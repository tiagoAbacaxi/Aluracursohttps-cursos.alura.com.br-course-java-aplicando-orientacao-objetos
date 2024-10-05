package org.example;

import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    String nome = "Clark Kent";
    String tipoConta = "Corrente";
    double saldo = 1599.99;
    int opcao = 0;

    System.out.println("***********************");
    System.out.println("\nNome do cliente: " + nome);
    System.out.println("Tipo conta: " + tipoConta);
    System.out.println("Saldo atual: " + saldo);
    System.out.println("\n***********************");



    Scanner leitura = new Scanner(System.in);

    while (opcao != 4) {
      System.out.println("** Digite sua opção **");
      System.out.println("1 - Consultar saldo");
      System.out.println("2 - Transferir valor");
      System.out.println("3 - Receber valor");
      System.out.println("4 - Sair");
      opcao = leitura.nextInt();

      if (opcao == 1) {
        System.out.println("O saldo atualizado é " + saldo);
      } else if (opcao == 2) {
        System.out.println("Qual o valor que deseja transferir?");
        double valor = leitura.nextDouble();
        if (valor > saldo) {
          System.out.println("Não há saldo para realizar a transferência.");
        } else {
          saldo -= valor;
          System.out.println("Novo saldo: " + saldo);
        }
      } else if (opcao == 3) {
        System.out.println("Valor recebido: ");
        double valor = leitura.nextDouble();
        saldo += valor;
        System.out.println("Novo saldo: " + saldo);
      } else if (opcao != 4) {
        System.out.println("Opção inválida!");
      }
    }
  }
}

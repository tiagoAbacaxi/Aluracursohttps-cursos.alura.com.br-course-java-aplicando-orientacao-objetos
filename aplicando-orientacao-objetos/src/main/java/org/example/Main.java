package org.example;

import static java.lang.String.format;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("ola mundo   !");
    System.out.println("filme: top gum: maverick");

    Scanner leitura = new Scanner(System.in);
    double mediaAvaliacao = 0;
    double nota = 0;
    int totalDeNotas = 0;

    while (nota != -1) {
      System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
      nota = leitura.nextDouble();
      mediaAvaliacao += nota;
      totalDeNotas++;
    }

    System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas);

    int anoDeLancamento = 2022;
    System.out.println("Ano de lancamento" + anoDeLancamento);
    boolean incluiidoNoPlano = true;
    double notaDoFilme = 8.1;

    String nome = "Maria";
    int idade = 30;
    double valor = 55.9999;
    System.out.println(
        format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

    double media = (9.8 + 6.3 + 8.0) / 3;
    System.out.println(media);
    String sinopse = "filme anos 80";
    System.out.println(sinopse);

    // por que n funciona?
  }
}

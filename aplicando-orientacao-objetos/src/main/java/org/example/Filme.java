package org.example;

public class Filme {

  int anoDelancamento;
  String nome;
  boolean incluidoNoPlano;
  double somaDasAvaliacao;
  int duracao;

  void exibeFichaTecnica() {
    System.out.println("Nome do filme" + nome);
    System.out.println("Nome do filme" + anoDelancamento);

  }

  void avalia(double nota) {
    somaDasAvaliacao += nota;
  }
}

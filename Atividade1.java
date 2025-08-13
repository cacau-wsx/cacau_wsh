package Cacau;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("Digite as 8 notas anuais do aluno:");

        // Ler as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();
        }

        // Calcular médias bimestrais (cada nota já representa um bimestre)
        // Aqui vamos mostrar diretamente as notas como médias bimestrais

        // Calcular médias semestrais
        double media1Semestre = (notas[0] + notas[1] + notas[2] + notas[3]) / 4.0;
        double media2Semestre = (notas[4] + notas[5] + notas[6] + notas[7]) / 4.0;

        // Calcular média final (média das médias semestrais)
        double mediaFinal = (media1Semestre + media2Semestre) / 2.0;

        // Mostrar resultados
        System.out.println("\nPráticas\n");

        System.out.printf("1o Bimestre: %.1f\n", notas[0]);
        System.out.printf("2o Bimestre: %.1f\n", notas[1]);
        System.out.printf("3o Bimestre: %.1f\n", notas[2]);
        System.out.printf("4o Bimestre: %.1f\n", notas[3]);
        System.out.printf("1o Semestre: %.1f\n", media1Semestre);
        System.out.println("----------------------");

        System.out.printf("5o Bimestre: %.1f\n", notas[4]);
        System.out.printf("6o Bimestre: %.1f\n", notas[5]);
        System.out.printf("7o Bimestre: %.1f\n", notas[6]);
        System.out.printf("8o Bimestre: %.1f\n", notas[7]);
        System.out.printf("2o Semestre: %.1f\n", media2Semestre);
        System.out.println("-----------------------");

        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}


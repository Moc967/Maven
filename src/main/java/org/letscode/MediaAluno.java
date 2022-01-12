package org.letscode;

import java.util.Scanner;



public class MediaAluno {
    private static final double MEDIA = 7.0;
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Pedir o nome do aluno

        System.out.println("Informe nome do aluno");
        String aluno = ler.next();

        // Pedir as notas das atividades

        System.out.println("Informe a nota da primeira atividade");
        int nota1 = ler.nextInt();

        System.out.println("Informe a nota da segunda atividade");
        int nota2 = ler.nextInt();

        System.out.println("Informe a nota da terceira atividade");
        int nota3 = ler.nextInt();

        // Calcular a médias das notas Atividades

        double somatorioNotasExercicio = (nota1 + nota2 + nota3)/3;

        // Pedir a nota da prova

        System.out.println("Informe a nota da prova");
        int notaProva = ler.nextInt();

        // Pedir a nota de participação

        System.out.println("Informe a nota da participação");
        int participacao = ler.nextInt();

        // Calcular a média nF = (2x (somatorioNotasExercicio) + 3x(notaProva) + participacao)/6

        double nF = (2*(somatorioNotasExercicio) + 3*(notaProva) + participacao)/6;

        // Imprimir a média




    }
}

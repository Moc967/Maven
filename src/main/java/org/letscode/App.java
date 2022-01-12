package org.letscode;

import java.util.Scanner;

/**
 *
 * Calculadora
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner tec = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = tec.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = tec.nextInt();

        int soma = somar(a, b);
        int sub = subtrair(a, b);
        int multi = multiplicar(a, b);
        float div = dividir(a, b);

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + sub);
        System.out.println("Multiplicação =" + multi);
        System.out.printf("Divisão = %.2f", div);

    }
    public static int somar (int a, int b){
        return a + b;
    }
    public static int subtrair (int a, int b){
        return a - b;
    }
    public static int multiplicar (int a, int b){
        return a * b;
    }
    public static float dividir (float a, float b){
        return a / b;
    }



}

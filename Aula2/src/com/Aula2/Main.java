package com.Aula2;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Ficha2 f;
    private static ListaDeLocalDates l;
    private static Scanner sc;

    public static void ex1a () {
        System.out.println("Quantos numeros vai ler? ");
        int ler = sc.nextInt();
        int[] array = new int[ler];

        System.out.println("Insira " + ler + " numeros");
        for(int i = 0; i < ler; i++) {
            array[i] = sc.nextInt();
        }
        int minimo = f.minimo(array);
        System.out.println("Minimo: " + minimo);
    }
    public static void ex1b () {
        System.out.println("Quantos numeros vai ler? ");
        int ler = sc.nextInt();
        int[] array = new int[ler];
        System.out.println("Insira " + ler + " numeros");
        for(int i = 0; i < ler; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Indice inicial: ");
        int init = sc.nextInt();
        System.out.println("Indice final: ");
        int fin = sc.nextInt();
        System.out.println("Array: " + Arrays.toString(f.entreIndices(array, init, fin)));
    }

    public static void ex1c () {
        System.out.println("Quantos numeros vai ler? ");
        int ler1 = sc.nextInt();
        int[] array1 = new int[ler1];
        System.out.println("Insira " + ler1 + " numeros");
        for(int i = 0; i < ler1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Quantos numeros vai ler? ");
        int ler2 = sc.nextInt();
        int[] array2 = new int[ler2];
        System.out.println("Insira " + ler2 + " numeros");
        for(int i = 0; i < ler2; i++) {
            array2[i] = sc.nextInt();
        }

        int [] res = f.comuns(array1, array2);
        if (res != null)
            System.out.println("Comuns: " + Arrays.toString(res));
    }

    public static void ex2a () {
        int [][] notasTurma = new int[5][5];
        int[] notasAluno = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira as notas do aluno " + (i+1) + ": ");
            for (int j = 0; j < 5; j++) {
                notasAluno[j] = sc.nextInt();
            }
            notasTurma = f.lerAt(notasTurma, i, notasAluno);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Notas do aluno " + (i+1) + ": " + Arrays.toString(notasTurma[i]));
        }
    }

    public static void ex3a () {
        l.insereData(LocalDate.now());
        System.out.println("resultado: " + l.toString());
    }

    public static void main(String[] args) {
        f = new Ficha2();
        sc = new Scanner(System.in);
        l = new ListaDeLocalDates(10);
       // ex3a();
        ex2a();
        sc.close();
    }
}

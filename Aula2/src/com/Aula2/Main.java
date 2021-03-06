package com.Aula2;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Ficha2 f;
    private static ListaDeLocalDates l;
    private static Scanner sc;
    private static Ex4 f4;

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
        l.insereData();
        System.out.println("resultado: " + l.toString());
    }
    public static void ex3b () {
        for (int i = 0; i < 10; i++)
            l.insereData();

        LocalDate res = l.dataMaisProxima(LocalDate.now());
        System.out.println("Data a compararar: " + LocalDate.now().toString());
        System.out.println("Data Mais Próxima: " + res.toString());
        System.out.println(l.toString());
    }

    public static void ex4a() {
        int [] v = new int [10];
        for (int i = 0, k = 10; i < 10; i++, k--) {
            v[i] = k;
        }
        System.out.println("Array inserido: " + Arrays.toString(v));
        v = f4.ordena(v);
        System.out.println("Array ordenado: " + Arrays.toString(v));
    }

    public static void ex4b (int x) {
        int [] v = new int [10];
        for (int i = 0, k = 10; i < 10; i++, k--) {
            v[i] = k;
        }
        v = f4.ordena(v);
        int res = f4.procura_binaria(v, x);
        System.out.println("Array inserido: " + Arrays.toString(v));
        System.out.println("Encontrado no índice " + res);
    }

    public static void main(String[] args) {
        f = new Ficha2();
        sc = new Scanner(System.in);
        l = new ListaDeLocalDates(10);
        f4 = new Ex4();
        //ex3a();
        //ex2a();
        //ex3b();
        //ex4a();
        ex4b(5);
        sc.close();
    }
}

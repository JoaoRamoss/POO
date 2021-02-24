package com.Aula1;
import java.util.Scanner;

public class Main {
    private static Ficha1 f1;
    private static Scanner ins;

    private static void exercicio1 (){
        System.out.println("Temperatura em Celsius: ");
        double temp = ins.nextDouble();
        double tempF = f1.celsiusParaFarenheit(temp);
        System.out.println("Em Fahrenheit: " + tempF);
    }
    private static void exercicio2 () {
        System.out.println("Insere o primeiro numero: ");
        int n1 = ins.nextInt();
        System.out.println("Insere o segundo numero: ");
        int n2 = ins.nextInt();
        int max = f1.maximo(n1, n2);
        System.out.println("O máximo é: " + max);
    }
    private static void exercicio3 () {
        System.out.println("Insere o teu nome: ");
        String nome = ins.nextLine();
        System.out.println("insere o teu saldo: ");
        int saldo = ins.nextInt();
        System.out.println(f1.criaDescricaoConta(nome, saldo));
    }

    private static void exercicio4 () {
        System.out.println("Insere o valor em euro que queres converter: ");
        int valor = ins.nextInt();
        System.out.println("Em libras: " + f1.euroParaLibra(valor, 0.86));
    }

    private static void exercicio5 () {
        System.out.println("Insere o primeiro numero: ");
        float n1 = ins.nextFloat();
        System.out.println("Insere o segundo numero: ");
        float n2 = ins.nextFloat();
        f1.decrescente(n1, n2);
    }

    private static void exercicio6 (int valor) {
        System.out.println("Fatorial: " + f1.factorial(valor));
    }

    private static void exercicio7 () {
        long tempo = f1.tempoGasto();
        System.out.println("Tempo gasto: " + tempo + "ms");
    }

    public static void main(String[] args) {
        f1 = new Ficha1();
        ins = new Scanner(System.in);
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6(Integer.parseInt(args[0]));
        exercicio7();
        ins.close();

    }
}

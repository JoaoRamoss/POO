package com.Aula1;

public class Ficha1 {
    public double celsiusParaFarenheit (double graus) {
        return graus*1.8+32;
    }

    public int maximo(int n1, int n2) {
        return Math.max(n1, n2);
    }

    public String criaDescricaoConta(String nome, double saldo) {
        return "Nome: " + nome + "\nSaldo: " + saldo;
    }

    public double euroParaLibra (double valor, double taxa) {
        return valor*taxa;
    }

    public void decrescente (float n1, float n2) {
        float media = (n1+n2)/2;
        if (n1 > n2) {
            System.out.println(n1 + "," + n2 + "\nMedia: " + media);
        }
        else
            System.out.println(n2 + "," + n1 + "\nMedia: " + media);
    }

    public long factorial(int num) {
        int i;
        long fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public long tempoGasto () {
        long antes = System.nanoTime();
        long fact = factorial(5000);
        long apos = System.nanoTime();
        return (apos - antes)/1000;
    }
}

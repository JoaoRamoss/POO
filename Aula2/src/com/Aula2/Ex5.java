package com.Aula2;
import java.util.Scanner;


public class Ex5 {

    public String [] criaArrayString () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos quer no array? ");
        int tamanho = sc.nextInt();
        String [] array = new String [tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Insira uma String: ");
            array[i] = sc.next();
        }
        return array;
    }

    //Quando se remove algum elemento da String aparece um "NULL" no final
    //Nao consegui perceber porque.
    public String [] removeReps (String [] array) {
        int tam = array.length;
        String[] aux = new String [tam];
        for (int i = 0; i < tam; i++) {
            for (int j = i+1; j < tam; j++) {
                if (array[i].equals(array[j])) {
                    for (int k = j; k < tam-1; k++) {
                        array[k] = array[k+1];
                    }
                    tam--;
                }
            }
        }
        for (int i = 0; i < tam; i++) {
            aux[i] = array[i];
        }

        return aux;
    }

    public String maiorString (String [] array) {
        int max = -1, key = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                key = i;
            }
        }
        return array[key];
    }

    public String [] stringsReps (String [] array) {
        String [] aux = new String [array.length];

        int res = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    Boolean presente = false;
                    //Verifica se o elemento repetido ja foi ou nao inserido no array aux.
                    for (String elem : aux) {
                        if (array[j].equals(elem)) {
                            presente = true;
                        }
                    }
                    if (!presente)
                        aux[res++] = array[j];
                }
            }
        }
        //Coloca o array final dentro de um array com o tamanho correto
        //Desta forma nao temos um array com tamanho 50 para apenas conter 10 elementos.
        String [] reps = new String[res];
        System.arraycopy(aux, 0, reps, 0, res);
        return reps;
    }

    public int quantasReps (String s1, String [] array) {
        int res = 0;
        for (String elem : array) {
            if (s1.equals(elem))
                res++;
        }
        return res;
    }
}

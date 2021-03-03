package com.Aula2;

import java.time.LocalDate;

public class Ficha2 {
    //exercicio 1 alinea a
    public int minimo (int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }
    //Exercicio 1 alinea b
    public int[] entreIndices (int[] a, int i, int f) {
        if (i > f || f > a.length || f < 0 || i < 0) {
            return null;
        }
        int tam = f-i+1;
        int [] res = new int[tam];
        System.arraycopy(a, i, res, 0, tam);
        return res;
    }
    //Exercicio 1 alinea c
    public int[] comuns(int [] a, int [] b) {
        int res[] = new int[a.length];
        int ind = 0;
        for (int elem1 : a) {
            boolean enc = false;
            for (int i = 0; i < b.length && !enc; i++) {
                if (elem1 == b[i]) {
                    boolean encR = false;
                    for (int j = 0; j < ind && !encR; j++) {
                        encR = res[j] == elem1;
                    }
                    if (!encR) {
                        res[ind++] = elem1;
                        enc = true;
                    }
                }
            }
        }
        int [] resultado = new int[ind];
        System.arraycopy(res, 0, resultado, 0, ind);
        return resultado;
    }


}

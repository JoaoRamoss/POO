package com.Aula2;

import java.util.Arrays;

public class Ex4 {

    /**
     * Ordena o array usando o sort da java.util.Arrays
     * @param array Array a ser ordenado.
     * @return Array ordenado.
     */
    public int[] ordena (int [] array) {
        Arrays.sort(array);
        return array;
    }

    /**
     * Efetua a Procura Binário usando o binarySearch da java.util.Arrays
     * @param array Array a ser ordenado
     * @param x Elemento a ser procurado
     * @return Índice onde foi encontrado o elemento, -1 se nao o encontrar.
     */
    public int procura_binaria (int [] array, int x) {
        int res = Arrays.binarySearch(array, x);
        return res;
    }

}

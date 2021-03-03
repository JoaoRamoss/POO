package com.Aula2;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * Ficha 2 exercicio 3.
 */

public class ListaDeLocalDates {
    private LocalDate datas[];
    private int tam;

    public ListaDeLocalDates () {
        //usar o this com () é equivalente a chamar o construtor com algum argumento.
        //Seria o mesmo que ListaDeLocalDates (10);
        this(10);
    }

    public ListaDeLocalDates (int n) {
        this.datas = new LocalDate[n];
        this.tam = 0;
    }

    public void insereData (LocalDate data) {
        if (tam < datas.length)
            this.datas[tam++] = data;
    }

    public String toString () {
        return "ListaDeLocalDates(" + Arrays.toString(this.datas) + ")";
    }
}

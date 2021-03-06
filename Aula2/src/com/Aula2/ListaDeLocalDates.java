package com.Aula2;

import java.time.LocalDate;
import java.time.Period;
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

    public void insereData () {
        if (tam < datas.length)
            this.datas[tam++] = LocalDate.of(2021, tam, 07);
    }

    public String toString () {

        return "Datas Disponíveis: (" + Arrays.toString(this.datas) + ")";
    }

    public String paraString (LocalDate data) {

        return "Data: " + data.toString();
    }

    public LocalDate dataMaisProxima (LocalDate data) {
        int min = 10000, aux = 0;
        LocalDate res = datas[0];
        for (int i = 0; i < tam; i++) {
            Period espacoTempo = Period.between(data, datas[i]);
            if (Math.abs(espacoTempo.getDays()) < min) {
                res = datas[i];
                min = Math.abs(espacoTempo.getDays());
            }
        }
        return res;
    }

}

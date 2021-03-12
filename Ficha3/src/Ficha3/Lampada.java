package Ficha3;

import java.time.temporal.JulianFields;
import java.util.LinkedHashMap;

public class Lampada {

    private static final double consumoEco = 0.3;
    private static final double consumoNormal = 1.4;
    private enum Eco {
        ECO_ON,
        ECO_OFF
    }
    private Eco eco;

    private enum Ligada {
        LIGADA,
        DESLIGADA
    }
    private Ligada status;
    private long start;
    private double gasto;



    public Lampada () {
      this(Eco.ECO_OFF, Ligada.DESLIGADA);
    }

    public Lampada (Eco eco, Ligada status) {
        this.eco = eco;
        this.status = status;
        this.start = 0;
        this.gasto = 0;
    }

    public Lampada(Lampada l) {
        this.status = l.status;
        this.eco = l.eco;
        this.start = l.start;
        this.gasto = 0;
    }

    public Lampada clone () {
        return new Lampada (this);
    }

    public String toString() {
        return "Estado: " + this.status + " | " + "Eco: " + this.eco;
    }

    // a)
    public void lampON () {
        if (this.status == Ligada.DESLIGADA) {
            this.status = Ligada.LIGADA;
            this.eco = Eco.ECO_OFF;
            this.start = System.currentTimeMillis();
        }
    }
    // b)
    public void lampOFF () {
        if (this.status == Ligada.LIGADA) {
            this.status = Ligada.DESLIGADA;
            long finish = System.currentTimeMillis();
            long delta = finish - this.start;
            if (this.eco == Eco.ECO_OFF)
                this.gasto = delta * consumoNormal;
            else if (this.eco == Eco.ECO_ON)
                this.gasto = delta * consumoEco;
        }
    }

    // c)
    public void lampECO () {
        if (this.status == Ligada.DESLIGADA) {
            this.status = Ligada.LIGADA;
            this.eco = Eco.ECO_ON;
            this.start = System.currentTimeMillis();
        }
    }
    // d)
    public double totalConsumo () {
        if (this.status == Ligada.LIGADA) {
            double finish = System.currentTimeMillis();
            double delta = finish - this.start;
            if (this.eco == Eco.ECO_ON) {
                this.gasto = consumoEco * delta;
            }
            else {
                this.gasto = consumoNormal * delta;
            }
        }
        return this.gasto;
    }
    // e)
    public double periodoConsumo () {
        return this.gasto;
    }
}

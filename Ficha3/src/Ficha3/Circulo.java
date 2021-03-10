package Ficha3;

public class Circulo {
    private double x, y, raio;

    public Circulo () {
        this(0, 0, 1);
    }

    public Circulo (double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo (Circulo c) {
       this(c.getX(), c.getY(), c.getRaio());
    }

    public double getX() {
       return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void setRaio (double raio) {
        this.raio = raio;
    }

    public void alteraCentro (double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double calculaArea () {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double calculaPerimetro () {
        return 2 * Math.PI * this.raio;
    }

    public Circulo clone () {
        return new Circulo(this);
    }

}

package Ficha3;

import java.security.cert.TrustAnchor;

public class Triangulo {

    private Ponto a, b, c;

    public Triangulo () {
        this.a = new Ponto();
        this.b = new Ponto();
        this.c = new Ponto();
    }

    public Triangulo (Ponto a, Ponto b, Ponto c) {
        this.a = new Ponto();
        this.b = new Ponto();
        this.c = new Ponto();
    }

    public Triangulo (Triangulo t) {
        this.a = t.getA();
        this.b = t.getB();
        this.c = t.getC();
    }

    public Ponto getA () {
        return this.a.clone();
    }

    public Ponto getB () {
        return this.b.clone();
    }
    public Ponto getC () {
        return this.c.clone();
    }

    public void setA (Ponto a) {
        this.a = a.clone();
    }

    public void setB (Ponto b) {
        this.b = b.clone();
    }

    public void setC (Ponto c) {
        this.c = c.clone();
    }

    public double [] getLados () {
        return new double[]{this.a.distancia(b), this.b.distancia(c), this.a.distancia(c)};
    }

    public double calculaAreaTriangulo () {
        double [] lados = getLados();
        double l = (lados [0] + lados[1] + lados[2]) / 2;
        return Math.sqrt(l * (l-lados[0]) * (l-lados[1]) * (l-lados[2]));
    }

    public double calculaPerimetro () {
        double [] lados = getLados();
        return lados[0] + lados[1] + lados[2];
    }

    public double calculaAltura () {
        double minY = Double.POSITIVE_INFINITY;
        double maxY = Double.NEGATIVE_INFINITY;

        double [] ys = {this.a.getY(), this.b.getY(), this.c.getY()};

        for (double y : ys) {
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }
        return maxY - minY;
    }

    public String toString () {
        StringBuilder s = new StringBuilder("Triangulo {");
        s.append("\na = ").append(this.a.toString());
        s.append("\nb = ").append(this.b.toString());
        s.append("\nc = ").append(this.c.toString());
        s.append("\n}");
        return s.toString();
    }


    public boolean equals (Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Triangulo t = (Triangulo) o;
        return this.a.equals(t.getA()) && this.b.equals(t.getB()) && this.c.equals(t.getC());
    }

    public Triangulo clone () {
        return new Triangulo(this);
    }

}

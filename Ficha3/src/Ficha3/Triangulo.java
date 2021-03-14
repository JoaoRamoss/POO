package Ficha3;

public class Triangulo {

    private Ponto a;
    private Ponto b;
    private Ponto c;

    public Triangulo () {
        this.a = new Ponto();
        this.b = new Ponto();
        this.c = new Ponto();
    }

    public Triangulo (Ponto a, Ponto b, Ponto c) {
        this.a = a.clone();
        this.b = b.clone();
        this.c = c.clone();
    }

    public Triangulo (Triangulo t) {
        this.a = t.getA().clone();
        this.b = t.getB().clone();
        this.c = t.getC().clone();
    }

    public Ponto getA () {
        return this.a;
    }

    public Ponto getB () {
        return this.b ;
    }

    public Ponto getC () {
        return this.c;
    }

    public double dist (Ponto p1, Ponto p2) {
        double dx = Math.abs(p1.getX() - p2.getX());
        double dy = Math.abs(p1.getY() - p2.getY());
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double[] getLados () {
        double [] lados = {dist(this.a, this.b), dist(this.b, this.c), dist(this.a, this.c)};
        return lados;
    }

    public double calculaAreaTriangulo () {
        double [] lados = getLados();
        double l = (lados[0] + lados[1] + lados[2]) / 2;
        return Math.sqrt(l * (l-lados[0]) * (l-lados[1]) * (l-lados[2]));
    }

    public double calculaPerimetroTriangulo () {
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
        final StringBuffer s = new StringBuffer("Triangulo {");
        s.append("\na = ").append(a.toString());
        s.append("\nb = ").append(b.toString());
        s.append("\nc = ").append(c.toString());
        s.append("\n}");
        return s.toString();
    }

    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return this.a.equals(Triangulo.a) && this.b.equals(triangulo.b)
                && this.c.equals(triangulo.c);
    }

    public Triangulo clone () {
        return new Triangulo(this);
    }
}

package Ficha3;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTriangulos {

    private List<Triangulo> tris;

    public ListaDeTriangulos () {
        this.tris = new ArrayList<>();
    }

    public ListaDeTriangulos (List <Triangulo> nTris) {
        this.tris = new ArrayList<Triangulo>(nTris.size());
        for (Triangulo t : nTris) {
            this.tris.add(t.clone());
        }
    }

    public ListaDeTriangulos(ListaDeTriangulos lt) {
        this(lt.getTris());
    }

    public List <Triangulo> getTris () {
        List<Triangulo> tris = new ArrayList<Triangulo>();
        for (Triangulo t : this.tris) {
            tris.add(t.clone());
        }
        return tris;
    }

    public Triangulo getTri (int pos) {
        return this.tris.get(pos).clone();
    }

    public void setTris(List <Triangulo> nTris) {
        this.tris.clear();

        for (Triangulo t : nTris) {
            this.tris.add(t.clone());
        }
    }

    public int somaPerimetros () {
        int soma = 0;
        for (Triangulo t : this.tris) {
            soma += t.calculaPerimetro();
        }
        return soma;
    }

    public void mudaA (int pos, Ponto p) {
        this.tris.get(pos).setA(p);
    }

    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        ListaDeTriangulos lt = (ListaDeTriangulos) o;
        return this.tris.equals(lt.getTris());
    }
    public String toString () {
        StringBuilder sb =  new StringBuilder("Lista de triangulos: ");
        sb.append(this.tris.toString());
        return sb.toString();
    }

    public ListaDeTriangulos clone() {
        return new ListaDeTriangulos(this);
    }
}

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
}

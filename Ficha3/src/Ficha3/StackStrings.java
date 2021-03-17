package Ficha3;

import java.util.ArrayList;
import java.util.List;

public class StackStrings {

    private List<String> lst;

    public StackStrings () {
        this.lst = new ArrayList<String>();
    }

    public StackStrings (List <String> lst) {
        this.lst = new ArrayList<String>(lst.size());
    }

    public StackStrings (StackStrings s) {
        this(s.getLst());
    }

    private List<String> getLst() {
        List <String> res = new ArrayList<String>();
        res.addAll(lst); //porque strings sao imutaveis.
        return res;
    }

    public String top () {
        int tam = this.lst.size();
        return tam > 0 ? this.lst.get(tam-1) : null; // se tamanho maior que 0 vai busvar ult elemento (semelhante a mascaras em C)
    }

    public void push (String s) {
        this.lst.add(s);
    }

    public void pop () {
        int tam = this.lst.size();
        if (tam > 0) {
            this.lst.remove(tam-1);
        }
    }

    public boolean empty () {
        return this.lst.isEmpty();
    }

    public int length () {
        return this.lst.size();
    }


}

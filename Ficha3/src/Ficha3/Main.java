package Ficha3;

public class Main {

    public static void testaCirculo () {
        Circulo c1 = new Circulo ();
        Circulo c2 = new Circulo (10, 5, 20);
        Circulo c3 = new Circulo(c2);

        System.out.println("Area de c1: " + c1.calculaArea());
        System.out.println("X do c3: " + c3.getX());
        c3.alteraCentro(2, 5);
        System.out.println("X do c3: " + c3.getX());
        System.out.println("X do c2: " + c2.getX());
    }

    public static void testaJogo () {
        Jogofutebol j = new Jogofutebol();
        Jogofutebol j2 = j.clone();
        j.startGame();
        j.goloVisitado();
        String res = j.resultadoAtual();
        System.out.println(res);
        j.goloVisitante();
        res = j.resultadoAtual();
        System.out.println(res);
        String wtf = j.toString();
        System.out.println(wtf);
        System.out.println("Iguais: " + j.equals(j2));
        j.endGame();
    }
    public static void testaLampada () {
        Lampada l = new Lampada();
        l.lampON();
        System.out.println("Lâmpada ligada");
        double consumo = l.totalConsumo();
        System.out.println("Consumo ate agora: " + consumo);
        Lampada l2 = l.clone();
        l.lampOFF();
        double total = l.periodoConsumo();
        double consumo2 = l.totalConsumo();
        System.out.println("Gasto no total: " + total);
        System.out.println("Consumo 2 ate agora: " + consumo2);
        String lamp = l.toString();
        l2.lampOFF();
        double total2 = l2.periodoConsumo();
        System.out.println("Gasto no total: " + total2);
        String lamp2 = l2.toString();
        System.out.println(lamp);
        System.out.println(lamp2);
    }

    public static void main(String[] args) {
        //testaJogo();
        testaLampada();
    }
}

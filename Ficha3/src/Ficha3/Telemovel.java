package Ficha3;
import java.util.ArrayList;

public class Telemovel {
    private String marca, modelo;
    private int displayX, displayY;
    private int armMensagens, armfotos, armApp;
    private int espacoOcupado;
    private int fotosGuardadas, appsInstaladas;
    private ArrayList<String> nomesAplicacoes;
    private ArrayList <String> mensagens;


    public Telemovel (String marca, String modelo, int displayX,
                      int displayY, int armMensagens, int armfotos, int armApp) {
        this.marca = marca;
        this.modelo = modelo;
        this.displayX = displayX;
        this.displayY = displayY;
        this.armMensagens = armMensagens;
        this.mensagens = new ArrayList<String>(this.getArmMensagens());
        this.mensagens.addAll(mensagens);
        this.armfotos = armfotos;
        this.armApp = armApp;
        this.espacoOcupado = 0;
        this.fotosGuardadas = 0;
        this.appsInstaladas = 0;
        this.nomesAplicacoes = new ArrayList<String> (this.appsInstaladas);
    }

    public Telemovel (String marca, String modelo, int displayX,
                      int displayY, int armMensagens, int armFotos, int armApp,
                      int espacoOcupado, int fotosGuardadas, int appsInstaladas,
                      ArrayList <String> nomesAplicacoes) {
        this.marca = marca;
        this.modelo = modelo;
        this.displayX = displayX;
        this.displayY = displayY;
        this.armMensagens = armMensagens;
        this.mensagens = new ArrayList<String>(this.getArmMensagens());
        this.mensagens.addAll(mensagens);
        this.armfotos = armFotos;
        this.armApp = armApp;
        this.espacoOcupado = espacoOcupado;
        this.fotosGuardadas = fotosGuardadas;
        this.appsInstaladas = appsInstaladas;
        this.nomesAplicacoes = new ArrayList <String> (this.appsInstaladas);
        this.nomesAplicacoes.addAll(nomesAplicacoes);
    }

    public Telemovel (Telemovel t) {
        this.marca = t.marca;
        this.modelo = t.modelo;
        this.displayX = t.displayX;
        this.displayY = t.displayY;
        this.armMensagens = t.armMensagens;
        this.mensagens = new ArrayList<String>(this.getArmMensagens());
        this.mensagens.addAll(t.mensagens);
        this.armfotos = t.armfotos;
        this.armApp = t.armApp;
        this.espacoOcupado = t.espacoOcupado;
        this.fotosGuardadas = t.fotosGuardadas;
        this.appsInstaladas = t.appsInstaladas;
        this.nomesAplicacoes = new ArrayList <String> (this.appsInstaladas);
        this.nomesAplicacoes.addAll(t.nomesAplicacoes);
    }

    public String getMarca () {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getDisplayX() {
        return this.displayX;
    }

    public int getDisplayY () {
        return this.displayY;
    }

    public int getArmMensagens() {
        return this.armMensagens;
    }

    public int getArmFotos () {
        return this.armfotos;
    }

    public int getArmApp () {
        return this.armApp;
    }

    public int getEspacoOcupado() {
        return this.espacoOcupado;
    }

    public int getFotosGuardadas() {
        return this.fotosGuardadas;
    }

    public int getAppsInstaladas() {
        return this.appsInstaladas;
    }

    public ArrayList <String> getNomesAplicacoes () {
        return this.nomesAplicacoes;
    }

    public boolean existeEspaco (int numeroBytes) {
        int livre = this.armApp + this.armfotos + this.armMensagens;
        return ((this.espacoOcupado + numeroBytes) < livre);
    }

    public void installApp (String nome, int tamanho) {
        this.appsInstaladas++;
        this.nomesAplicacoes.add(nome);
        this.armApp += tamanho;
    }

    public void recebeMsg (String msg) {
        this.armMensagens += msg.length();
        this.mensagens.add(msg);
    }

    public double tamMedioApps () {
        return this.armApp / this.appsInstaladas;
    }
    public String maiorString () {
        int max = Integer.MIN_VALUE;
        String res = "";
        for (String msg : this.mensagens) {
            if (msg.length() > max) {
                max = msg.length();
                res = msg;
            }
        }
        return res;
    }

    public void removeApp (String nome, int tamanho) {
        this.armApp--;
        this.appsInstaladas--;
        this.nomesAplicacoes.remove(nome);
    }

}

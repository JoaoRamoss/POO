package Ficha3;

public class Telemovel {
    private String marca, modelo;
    private int displayX, displayY;
    private int armMensagens, armfotos, armApp;
    private int espacoOcupado;
    private int fotosGuardadas, appsInstaladas;
    private String [] nomesAplicacoes;

    public Telemovel (String marca, String modelo, int displayX,
                      int displayY, int armMensagens, int armfotos, int armApp
                      , int espacoOcupado, int fotosGuardadas, int appsInstaladas,
                      String [] nomesAplicacoes) {
        this.marca = marca;
        this.modelo = modelo;
        this.displayX = displayX;
        this.displayY = displayY;
        this.armMensagens = armMensagens;
        this.armfotos = armfotos;
        this.armApp = armApp;
        this.espacoOcupado = espacoOcupado;
        this.fotosGuardadas = fotosGuardadas;
        this.appsInstaladas = appsInstaladas;
        this.nomesAplicacoes = nomesAplicacoes;
    }
    public Telemovel (String marca, String modelo) {
        this (marca, modelo, 1920, 1080, 20, 40, 40, 30, 10, 0, new String[0]);
    }
}

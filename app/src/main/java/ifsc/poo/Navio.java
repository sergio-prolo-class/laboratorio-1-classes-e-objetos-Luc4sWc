package ifsc.poo;

import java.util.Random;

public class Navio {
    private String[] navios = {"N", "P", "C", "E", "S"};//USEI SÓ COMO MODELO POIS O CÓDIGO É GENÉRICO
    private String[] Coordenadas_nav2 = new String[5];
    private String[] Coordenadas_nav3 = new String[5];
    private String[] Coordenadas_nav4 = new String[5];
    private String[] Coordenadas_nav5 = new String[5];
    private String[] Coordenadas_nav1 = new String[5];

    void setCoordenadas_nav1(String navio, String linha, String coluna, String posicao, String tamanho) {
        this.Coordenadas_nav1[0] = navio;
        this.Coordenadas_nav1[1] = linha;
        this.Coordenadas_nav1[2] = coluna;
        this.Coordenadas_nav1[3] = posicao;
        this.Coordenadas_nav1[4] = tamanho;
    }

    void setCoordenadas_nav2(String navio, String linha, String coluna, String posicao, String tamanho) {
        this.Coordenadas_nav2[0] = navio;
        this.Coordenadas_nav2[1] = linha;
        this.Coordenadas_nav2[2] = coluna;
        this.Coordenadas_nav2[3] = posicao;
        this.Coordenadas_nav2[4] = tamanho;
    }

    void setCoordenadas_nav3(String navio, String linha, String coluna, String posicao, String tamanho) {
        this.Coordenadas_nav3[0] = navio;
        this.Coordenadas_nav3[1] = linha;
        this.Coordenadas_nav3[2] = coluna;
        this.Coordenadas_nav3[3] = posicao;
        this.Coordenadas_nav3[4] = tamanho;
    }

    void setCoordenadas_nav4(String navio, String linha, String coluna, String posicao, String tamanho) {
        this.Coordenadas_nav4[0] = navio;
        this.Coordenadas_nav4[1] = linha;
        this.Coordenadas_nav4[2] = coluna;
        this.Coordenadas_nav4[3] = posicao;
        this.Coordenadas_nav4[4] = tamanho;
    }

    void setCoordenadas_nav5(String navio, String linha, String coluna, String posicao, String tamanho) {
        this.Coordenadas_nav5[0] = navio;
        this.Coordenadas_nav5[1] = linha;
        this.Coordenadas_nav5[2] = coluna;
        this.Coordenadas_nav5[3] = posicao;
        this.Coordenadas_nav5[4] = tamanho;
    }

    Random a = new Random();
    String afundou;

    String FuiAtingido(int linha, int coluna) {
       int x = a.nextInt(2);

        if (Integer.parseInt(Coordenadas_nav1[1]) == linha && Integer.parseInt(Coordenadas_nav1[2]) == coluna) {
            if(x == 0){
                return "Seu navio: " + Coordenadas_nav1[0] + " foi atingido!" + "Mas não afundou";
            }
            else{
                return "Seu navio: " + Coordenadas_nav1[0] + " foi atingido!" + "E afundou";
            }

        } else if (Integer.parseInt(Coordenadas_nav2[1]) == linha && Integer.parseInt(Coordenadas_nav2[2]) == coluna) {
            if(x == 0){
                return "Seu navio: " + Coordenadas_nav2[0] + " foi atingido!" + "Mas não afundou";
            }
            else{
                return "Seu navio: " + Coordenadas_nav2[0] + " foi atingido!" + "E afundou";
            }

        } else if (Integer.parseInt(Coordenadas_nav3[1]) == linha && Integer.parseInt(Coordenadas_nav3[2]) == coluna) {
            if(x == 0){
                return "Seu navio: " + Coordenadas_nav3[0] + " foi atingido!" + "Mas não afundou";
            }
            else{
                return "Seu navio: " + Coordenadas_nav3[0] + " foi atingido!" + "E afundou";
            }

        } else if (Integer.parseInt(Coordenadas_nav4[1]) == linha && Integer.parseInt(Coordenadas_nav4[2]) == coluna) {
            if(x == 0){
                return "Seu navio: " + Coordenadas_nav4[0] + " foi atingido!" + "Mas não afundou";
            }
            else{
                return "Seu navio: " + Coordenadas_nav4[0] + " foi atingido!" + "E afundou";
            }
        } else if (Integer.parseInt(Coordenadas_nav5[1]) == linha && Integer.parseInt(Coordenadas_nav5[2]) == coluna) {
            if(x == 0){
                return "Seu navio: " + Coordenadas_nav5[0] + " foi atingido!" + "Mas não afundou";
            }
            else{
                return "Seu navio: " + Coordenadas_nav5[0] + " foi atingido!" + "E afundou";
            }

        } else {
            return "Não foi atingido!";
        }
    }

}

package ifsc.poo;

public class retangulo {
    private float largura;
    private float altura;
    private static retangulo maior_retangulo;
    private static retangulo menor_retangulo;
    private static float maior_retangulo_area = 0;
    private static float menor_retangulo_perimetro;

    boolean setLargura(float largura) {
        if(largura <= 0) {
            return false;
        }
        this.largura = largura;
        return true;
    }
    boolean setAltura(float altura) {
        if(altura <= 0){
            return false;
        }
        this.altura = altura;
        return true;
    }
    float getArea(){
        maior_retanguloÁrea();
        return largura * altura;
    }
    float getPerimetro(){
        menor_retanguloPerimetro();
        return (largura + altura) * 2;
    }

    void maior_retanguloÁrea(){
        if(this.getArea() > maior_retangulo_area){
            maior_retangulo_area = this.getArea();
            maior_retangulo = this;
        }
    }
    
    void menor_retanguloPerimetro(){
        if(menor_retangulo == null){
            menor_retangulo = this;
        }
        else {
            if(this.getPerimetro() < menor_retangulo.getPerimetro()){
                menor_retangulo = this;
            }
        }
    }

    public static retangulo getMaior_retangulo() {
        return maior_retangulo;
    }
    public static retangulo getMenor_retangulo() {
        return menor_retangulo;
    }
    
}

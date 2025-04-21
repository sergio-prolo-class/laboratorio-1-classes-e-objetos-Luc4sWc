package ifsc.poo;

public class retangulo {
    private float largura;
    private float altura;
    private static retangulo maior_retangulo;
    private static retangulo menor_retangulo;
    private static float maior_retangulo_area = 0;
    private static float menor_retangulo_perimetro;

    boolean setLargura(float largura) {
        if (largura <= 0) {
            return false;
        }
        this.largura = largura;
        return true;
    }

    boolean setAltura(float altura) {
        if (altura <= 0) {
            return false;
        }
        this.altura = altura;
        return true;
    }

    float getArea() {
        maior_retanguloÁrea();
        return largura * altura;
    }

    float getPerimetro() {
        float perimetro = (largura + altura) * 2;
        menor_retanguloPerimetro(perimetro);
        return perimetro;
    }

    void maior_retanguloÁrea() {
        float area = largura * altura;
        if (area > maior_retangulo_area) {
            maior_retangulo_area = area;
            maior_retangulo = this;
        }
    }

    void menor_retanguloPerimetro(float perimetro) {
        if (menor_retangulo == null || perimetro < menor_retangulo.getPerimetroValue()) {
            menor_retangulo = this;
            menor_retangulo_perimetro = perimetro;
        }
    }

    float getPerimetroValue() {
        return (largura + altura) * 2;
    }

    public static retangulo getMaior_retangulo() {
        return maior_retangulo;
    }

    public static retangulo getMenor_retangulo() {
        return menor_retangulo;
    }
}
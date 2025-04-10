package ifsc.poo;

public class retangulo {
    float largura;
    float altura;

    void setLargura(float largura) {
        this.largura = largura;
    }
    void setAltura(float altura) {
        this.altura = altura;
    }
    float getArea(){
        return largura * altura;
    }
    float getPerimetro(){
        return (largura + altura) * 2;
    }
}

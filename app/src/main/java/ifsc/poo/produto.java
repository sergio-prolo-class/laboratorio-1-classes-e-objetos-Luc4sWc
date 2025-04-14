package ifsc.poo;

import static java.lang.System.*;

public class produto {
    String nome;
    int preco;
    int desconto;
    float novoPreco;

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    void setPreco(int preco) {
        this.preco = preco;
    }

    int getPreco() {
        return this.preco;
    }

    void setDesconto(int desconto) {
        this.desconto = desconto;
        this.novoPreco =  this.preco - (float) (this.preco * this.desconto)/100;
    }

    int getDesconto() {
        return this.desconto;
    }

    float getNovoPreco() {
        return this.novoPreco;
    }

    String anuncio(){
        return String.format("de R$" + this.preco + " por APENAS R$" + this.novoPreco);
    }
}

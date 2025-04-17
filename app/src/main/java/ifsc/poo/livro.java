package ifsc.poo;

public class livro {
    String titulo;
    String autor;
    String generos;
    int paginas;
    int capitulos;
    int ler = 0;
    String atual;

    void setNome(String nome) {
        this.titulo = nome;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    void setGeneros(String generos) {
        this.generos = generos;
    }

    void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    void setLer(int ler) {
        this.ler += ler;
        capAtual();
    }

    void capAtual(){
        if (this.ler < 23) {
            this.atual = "Uma Festa Muito Esperada";
        }
        if (this.ler >= 23 && this.ler <= 43) {
            this.atual = "A Sombra do Passado";
        }
        if (this.ler >= 44 && this.ler <= 65) { //passou disso eu não leio
            this.atual = "Três é Demais";
        }
        if (this.ler >= 66 && this.ler <= 88) {
            this.atual = "Um Atalho para Cogumelos";
        }
        if (this.ler >= 89 && this.ler <= 109) {
            this.atual = "Uma Conspiração Desmascarada";
        }
        if (this.ler >= 110 && this.ler <= 130) {
            this.atual = "A Floresta Velha";
        }
        if (this.ler >= 131 && this.ler <= 153) {
            this.atual = "Em Casa de Tom Bombadil";
        }
        if (this.ler >= 154 && this.ler <= 175) {
            this.atual = "Névoa nas Colinas dos Túmulos";
        }
        if (this.ler >= 176 && this.ler <= 196) {
            this.atual = "No Pônei Empinado";
        }
        if (this.ler >= 197 && this.ler <= 218) {
            this.atual = "Passolargo";
        }
        if (this.ler >= 219 && this.ler <= 239) {
            this.atual = "Um Faca na Noite";
        }
        if (this.ler >= 240 && this.ler <= 260) {
            this.atual = "Voo para o Vau"; //Chega já tabom já
        }
        if (this.ler >= 261 && this.ler <= 281) {
            this.atual = "Muitos Encontros";
        }
        if (this.ler >= 282 && this.ler <= 300) {
            this.atual = "O Conselho de Elrond";
        }
        if (this.ler >= 301 && this.ler <= 319) {
            this.atual = "O Anel Vai para o Sul";
        }
        if (this.ler >= 320 && this.ler <= 340) {
            this.atual = "Uma Jornada no Escuro";
        }
        if (this.ler >= 341 && this.ler <= 360) {
            this.atual = "A Ponte de Khazad-dûm";
        }
        if (this.ler >= 361 && this.ler <= 382) {
            this.atual = "Lothlórien ";
        }
        if (this.ler >= 383 && this.ler <= 402) {
            this.atual = "O Espelho de Galadriel";
        }
        if (this.ler >= 403 && this.ler <= 422) {
            this.atual = "Adeus a Lórien";
        }
        if (this.ler >= 423 && this.ler <= 445) {
            this.atual = "O Grande Rio";
        }
        if (this.ler >= 446 && this.ler <= 464) {
            this.atual = "A Partida da Sociedade"; //o programador está chorando no banho nesse exato momento
        }
        if(this.ler > 464){
            this.atual = "Acabou o Livro";
            return;
        }
    }

    String getCapituloAtual() {
        return this.atual;
    }

}

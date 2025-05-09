/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        lampada lampada = new lampada();
        lampada lampada2 = new lampada();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Para ligar digite: ligar, para desligar: desligar: ");
        if (teclado.nextLine().equals("ligar")) {
            lampada.ligar();
        }
        if (teclado.nextLine().equals("desligar")) {
            lampada.desligar();
        }

        System.out.println();

        System.out.println("Para ligar digite: ligar, para desligar: desligar: ");
        if (teclado.nextLine().equals("ligar")) {
            lampada2.ligar();
        }
        if (teclado.nextLine().equals("desligar")) {
            lampada2.desligar();
        }

        System.out.println("Para ver o estado da lampada digite 'estado': ");
        if (teclado.nextLine().equals("estado")) {
            System.out.println("Estado da lampada 1: " + lampada.getEstado());
        }

        System.out.println();

        System.out.println("Para ver o estado da lampada 2 digite 'estado': ");
        if (teclado.nextLine().equals("estado")) {
            System.out.println("Estado da lampada 2: " + lampada2.getEstado());
        }

        System.out.println("Quantidade de lâmpadas ligadas: " + lampada.getQuantidade());

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        pessoa pessoa = new pessoa();
        pessoa pessoa2 = new pessoa();

        pessoa.setNome("Alice");
        pessoa.setIdade(22);

        pessoa2.setNome("Bruno");
        pessoa2.setIdade(25);

        System.out.print("Bruno: ");
        pessoa.felisAniversario();
        System.out.println();
        pessoa.felisAniversario();
        System.out.println();
        pessoa.felisAniversario();

        System.out.println();

        pessoa.setIdade(-44);

        pessoa2.setNome("");

        pessoa.setCpf("432.890.674-87");
        pessoa2.setCpf("");

        System.out.println("Cpf: " + pessoa.cpf);
        System.out.println("Cpf: " + pessoa2.cpf);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        retangulo ret = new retangulo();
        ret.setLargura(5);
        ret.setAltura(4);

        System.out.println("Área:" + ret.getArea());
        System.out.println("Perimetro:" + ret.getPerimetro());

        String[] retangulos = new String[10];
        float[] perimetros = new float[10];
        float[] area = new float[10];
        Random x = new Random();
        float maior_razão = 0;
        float soma_a = 0, soma_p = 0;
        for (int i = 0; i < 10; i++) {
            float h = x.nextFloat();

            ret.setLargura(h);
            h = x.nextFloat();
            ret.setAltura(h);

            area[i] = ret.getArea();
            soma_a += ret.getArea();
            perimetros[i] = ret.getPerimetro();
            soma_p += ret.getPerimetro();

        }

        maior_razão = soma_a/soma_p;

        System.out.println("Maior razão: " + maior_razão);

        System.out.println("Maior Retângulo: " + retangulo.getMaior_retangulo().getArea());
        System.out.println("Menor Retângulo: " + retangulo.getMenor_retangulo().getArea());

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        relogio relogio = new relogio();
        relogio relogio2 = new relogio();

        relogio.ajustaHora((byte)14);
        relogio.ajustaMinuto((byte)58);
        relogio.ajustaSegundo((byte)32);
        System.out.print("Relógio 1: " + relogio.getHora());

        relogio2.ajustaHora((byte)24);
        System.out.println("Relógio 2: " + relogio2.getHora());
        relogio2.ajustaMinuto((byte)22);
        relogio.ajustaSegundo((byte)31);//teste pra ver o relogio 2 sem segundos fiz pros outros e deu no mesmo (tá certo)
        relogio2.ajustaHora((byte)9);

        System.out.println("Relógio 2: " + relogio2.getHora());

        relogio2.Sincroniza(relogio);
        System.out.println("Relógio sincronizado (o Relogio 2 com o 1): " + relogio2.getHora());
        System.out.println();

        System.out.println("Diferença entre as horas: " + relogio.Diferenca(relogio, relogio2));

        relogio.avancaMinuto();
        relogio.avancaMinuto();

        relogio.ajustaHora((byte)23);
        relogio.ajustaMinuto((byte)59);
        relogio.ajustaSegundo((byte)59);

        System.out.println(relogio.getHora());
        relogio.avancaSegundo();

        System.out.println(relogio.getHora());

        System.out.println(relogio.getHoraAMPM());

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        produto geladeira = new produto();
        geladeira.setNome("Geladeira");
        geladeira.setPreco(832);

        produto microondas = new produto();
        microondas.setNome("Microondas");
        microondas.setPreco(499);

        geladeira.setDesconto(6);
        microondas.setDesconto(12);

        System.out.println("Quantidade de produtos criados: " + microondas.getQuantidadeProdutos());
        System.out.println("Últimos produtos criados: ");
        geladeira.listarProdutos();
        System.out.println("Código da geladeira: " + geladeira.getCd());
        System.out.println("Código do microondas: " + microondas.getCd());

        System.out.println("Preço da geladeira: " + geladeira.getNovoPreco());
        System.out.println("Preço da microondas: " + microondas.getNovoPreco());

        System.out.println("Geladeira: " + geladeira.anuncio());
        System.out.println("Microondas: " + microondas.anuncio());

        System.out.println("Registro Geral: ");
        String[] csv = produto.gerarCSV();
        for (String linha : csv) {
            System.out.println(linha);
        }

                    /* Acho que a modelagem é eficiente para a situação abordada, claro que possivelmente se fosse ser aplicado
                       na vida real necessitaria de automatizar a criação dos produtos para que apenas ao colocar o nome já adiciona
                       -se numa tabela hash para que caso fossem alterar algo conseguissem ir direto ao objeto, a chave é o nome do
                       produto e o valor é o preço, depois seria possível acrescentar a função do setDesconto para puxar o valor do
                       produto da tabela e consequentemente fazer depois algum ajuste com interface no Jframe quem sabe né?
                    * */

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        livro livro = new livro();

        livro.setNome("O Senhor dos Anéis - A Sociedade do Anel");
        livro.setAutor("J. R. R. Tolkien");
        livro.setGeneros("Fantasia, Aventura");
        livro.setPaginas(464);

        livro.setLer(90);
        System.out.println("Capítulo atual:" + livro.getCapituloAtual());

        livro.setLer(300);
        System.out.println("Capítulo atual:" + livro.getCapituloAtual());

        livro.setLer(100);
        System.out.println("Óh o easter egg aí óh: " + livro.atual);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();

        Navio navios = new Navio();

        navios.setCoordenadas_nav1("P","5","6","VERTICAL", "23");
        navios.setCoordenadas_nav2("E","1","9","HORIZONTAL", "45");
        navios.setCoordenadas_nav3("C","4","8","VERTICAL", "68");
        navios.setCoordenadas_nav4("S","6","4","HORIZONTAL","56");
        navios.setCoordenadas_nav5("N","7","2","VERTICAL", "39");

       System.out.println("Fui atingido?: " + navios.FuiAtingido(4,8)); //aqui você verificar se seu navio afundou ou não

        System.out.println();
    }
}

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

            relogio.ajustaHora((byte)14,(byte)58,(byte)32);
            System.out.println(relogio.getHora());

            relogio.avancaMinuto();
            relogio.avancaMinuto();

            relogio.ajustaHora((byte)23,(byte)59,(byte)59);
            System.out.println(relogio.getHora());
            relogio.avancaSegundo();

            System.out.println(relogio.getHora());

            System.out.println(relogio.getHoraAMPM());

            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

            produto geladeira = new produto();
            geladeira.nome = "Geladeira";
            geladeira.preco = 832;

            produto microondas = new produto();
            microondas.nome = "Microondas";
            microondas.preco = 499;

            geladeira.setDesconto(6);
            microondas.setDesconto(12);

            System.out.println(geladeira.getNovoPreco());
            System.out.println(microondas.getNovoPreco());

            System.out.println("Geladeira: " + geladeira.anuncio());
            System.out.println("Microondas: " + microondas.anuncio());

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
    }
}

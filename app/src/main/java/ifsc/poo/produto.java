package ifsc.poo;

public class produto {
    private  String nome;
    private int preco;
    private int desconto = 0;
    private float novoPreco;
    private static int quantidade_produtos = 0;
    private String cd;
    private static String[] produtos = new String[50];
    private static String[] todos = new String[1000];
    private static String[] registro = new String[1000];
    private static String[] cds = new String[1000];
    private static int[] precos = new int[1000];
    private static int[] descontos = new int[1000];
    private int id;

    public produto() {
        this.id = quantidade_produtos;
        quantidade_produtos++;
    }

    void setNome(String nome) {
        if (nome.length() < 3 || nome.length() > 15 || nome.equals("")) {
            return;
        }
        this.nome = nome;
        this.cd = geraCd(this.id + 1);

        if (id <= 49) {
            produtos[id] = nome;
        } else {
            for (int i = 0; i < 49; i++) {
                produtos[i] = produtos[i + 1];
            }
            produtos[49] = nome;
        }
        todos[id] = nome;
    }


    String getNome() {
        return this.nome;
    }

    void setPreco(int preco) {
        this.preco = preco;
        precos[id] = preco;
    }

    int getPreco() {
        return this.preco;
    }

    void setDesconto(int desconto) {
        this.desconto = desconto;
        this.novoPreco =  this.preco - (float) (this.preco * this.desconto)/100;
        descontos[id] = desconto;
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

    int getQuantidadeProdutos(){
        return this.quantidade_produtos;
    }

    private String geraCd(int a){
        int primeiro = a /1000;
        int segundo = a % 1000;
        cds[id] = String.format("CD:%03d-%03d", primeiro, segundo);
        return String.format("CD:%03d-%03d", primeiro, segundo);
    }

    String getCd() {
        return this.cd;
    }

    void listarProdutos() {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println((i + 1) + ": " + produtos[i]);
            }
        }
    }

    public static String[] gerarCSV() {
        String[] registro = new String[quantidade_produtos + 1];
        registro[0] = "Código;Nome;Preço;Desconto";
        for (int i = 0; i < quantidade_produtos; i++) {
            registro[i + 1] = cds[i] + ";" + todos[i] + ";" + precos[i] + ";" + descontos[i];
        }
        return registro;
    }

}

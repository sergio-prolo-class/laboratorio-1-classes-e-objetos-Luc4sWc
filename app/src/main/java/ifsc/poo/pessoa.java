package ifsc.poo;

public class pessoa {
    String nome;
    int idade;

    public void setNome(String nome) {
        if (nome.equals("")) {
            System.out.println("Tem que ter nome");
            return;
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade deve ser maior que 0");
            return;
        }
        this.idade = idade;
    }

    public void felisAniversario() {
        System.out.println("Feliz aniversario!");
    }
}

package ifsc.poo;

public class pessoa {
    String nome;
    int idade;
    String cpf;

    public boolean setNome(String nome) {
        if (nome.isEmpty()) {
            System.out.println("Precisa de nome!");
            return false;

        }
        this.nome = nome;
        return true;
    }

    public boolean setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade deve ser maior que 0");
            return false;
        }
        this.idade = idade;
        return true;
    }

    public boolean setCpf(String cpf) {
        if (cpf.isEmpty()) {
            this.cpf = "123.456.789-00";
            return false;
        }
        this.cpf = cpf;
        return true;
    }

    public void felisAniversario() {
        System.out.println("Feliz aniversario!");
    }
}

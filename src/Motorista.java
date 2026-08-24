public class Motorista {
    String nome;
    Carro carro;
    Endereco endereco;

    public Motorista(String nome, Carro carro, Endereco endereco) {
        this.nome = nome;
        this.carro = carro;
        this.endereco = endereco;
    }

    public void exibirMotoristaECarro() {
        System.out.println("Nome do proprietário: " + this.nome + ".");
        this.carro.exibirDetalhes();
        System.out.println("\nEndereço:");
        this.endereco.exibirEndereco();
    }

}

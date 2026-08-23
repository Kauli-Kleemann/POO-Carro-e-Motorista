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
        System.out.println("\nDetalhes do carro:");
        System.out.println("Motor: " + this.carro.motor + ";");
        System.out.println("Rádio: " + this.carro.radio + ";");
        System.out.println("Bancos: " + this.carro.bancos + ".");
        System.out.println("\nEndereço:");
        this.endereco.exibirEndereco();
    }

}

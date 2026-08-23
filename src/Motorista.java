public class Motorista {
    String nome;
    Carro carro;

public Motorista (String nome, Carro carro) {
    this.nome = nome;
    this.carro = carro;
}

public void exibirMotoristaECarro() {
    System.out.println("Nome do proprietário: " + this.nome + ".");
    System.out.println("\nDetalhes do carro:");
    System.out.println("Motor: " + this.carro.motor + ";");
    System.out.println("Rádio: " + this.carro.radio + ";");
    System.out.println("Bancos: " + this.carro.bancos + ".");
}

}

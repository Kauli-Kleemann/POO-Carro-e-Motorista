public class Endereco {
    String rua;
    int numero;
    String cidade;

    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }


    public void exibirEndereco() {
        System.out.println("Rua: " + this.rua + " - número: " + this.numero + " - cidade: " + this.cidade + ".");
    }
}
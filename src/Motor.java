public class Motor {
    int potencia;
    String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }
    
    public void exibirMotor() {
        System.out.println("\nDetalhes do motor:");
        System.out.println("Potência: " + potencia + ";");
        System.out.println("Tipo: " + tipo + ".");
    }
}
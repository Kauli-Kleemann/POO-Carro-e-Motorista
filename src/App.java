public class App {
    public static void main(String[] args) throws Exception {
        
        Motor motor1 = new Motor(120, "1.0 Flex");
        Carro carro1 = new Carro(4, true, 2009, motor1);
        Endereco endereco1 = new Endereco("Farroupilha", 324, "Estância Velha");
        Motorista motorista1 = new Motorista("Carlos Nêmesis", carro1, endereco1);
      
        motorista1.exibirMotoristaECarro();

        Motor motor2 = new Motor(150, "2.0 Turbo");
        Carro carro2 = new Carro(4, false, 2016, motor2);
        Endereco endereco2 = new Endereco("Vista Nova", 199, "Novo Hamburgo");
        Motorista motorista2 = new Motorista("Andre Stela", carro2, endereco2);

        motorista2.exibirMotoristaECarro();

        carro1.compararAno(carro2);
    }
}

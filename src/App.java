public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro();
        Motorista motorista1 = new Motorista("Carlos Nêmesis", carro1);
      
        carro1.bancos = 4;
        carro1.radio = true;
        carro1.motor = "1.0 Flex";

        motorista1.exibirMotoristaECarro();
    }
}

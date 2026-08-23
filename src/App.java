public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro();
        Motorista motorista1 = new Motorista("Carlos Nêmesis", carro1);
      
        carro1.bancos = 4;
        carro1.radio = true;
        carro1.motor = "1.0 Flex";
        carro1.ano = 2009;

        motorista1.exibirMotoristaECarro();

        Carro carro2 = new Carro();
        Motorista motorista2 = new Motorista("Andre Stela", carro2);

        carro2.bancos = 4;
        carro2.radio = false;
        carro2.motor = "2.0 Turbo";
        carro2.ano = 2016;

        carro1.compararAno(carro2);
    }
}

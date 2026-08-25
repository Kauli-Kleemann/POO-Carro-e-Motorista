public class Carro {
    int bancos;
    boolean radio;
    int ano;
    Motor motor;
    Motorista motorista;

    public Carro(int bancos, boolean radio, int ano, Motor motor) {
        this.bancos = bancos;
        this.radio = radio;
        this.ano = ano;
        this.motor = motor;
        this.motorista = motorista;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Carro compararAno(Carro outroCarro) {
        if (this.ano > outroCarro.ano) {
            System.out.println("\nCarro mais novo: ano " + this.ano + ".");
            return this;
        } else if (outroCarro.ano > this.ano) {
            System.out.println("\nCarro mais novo: ano " + outroCarro.ano + ".");
            return outroCarro;
        } else {
            System.out.println("\nAmbos os carros são do mesmo ano.");
            return this;
        }

        }

        public void exibirDetalhes() {
            System.out.println("\nDetalhes do carro:");
            System.out.println("Ano: " + this.ano + ";");
            System.out.println("Bancos: " + this.bancos + ";");
            System.out.println("Rádio: " + this.radio + ";");
            this.motor.exibirMotor();
    }
}
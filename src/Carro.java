public class Carro {
    int bancos;
    boolean radio;
    String motor;
    int ano;

    public Carro compararAno(Carro outroCarro) {
        if (this.ano > outroCarro.ano) {
            System.out.println("\nCarro mais novo: ano " + this.ano + ", motor " + this.motor);
            return this;
        } else if (outroCarro.ano > this.ano) {
            System.out.println("\nCarro mais novo: ano " + outroCarro.ano + ", motor " + outroCarro.motor);
            return outroCarro;
        } else {
            System.out.println("\nAmbos os carros são do mesmo ano.");
            return this;
        }
    }
}
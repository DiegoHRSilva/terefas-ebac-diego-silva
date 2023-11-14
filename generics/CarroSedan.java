package generics;



class CarroSedan extends Carro {
    private int numeroPortas;

    public CarroSedan(String modelo, String marca, int ano, int numeroPortas) {
        super(modelo, marca, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString() {
        return "CarroSedan{" +
                "modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", ano=" + getAno() +
                ", numeroPortas=" + numeroPortas +
                '}';
    }
}
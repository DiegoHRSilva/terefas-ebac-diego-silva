package generics;

class CarroEsportivo extends Carro {
  private boolean possuiTurbo;

  public CarroEsportivo(String modelo, String marca, int ano, boolean possuiTurbo) {
      super(modelo, marca, ano);
      this.possuiTurbo = possuiTurbo;
  }

  @Override
  public String toString() {
      return "CarroEsportivo{" +
              "modelo='" + getModelo() + '\'' +
              ", marca='" + getMarca() + '\'' +
              ", ano=" + getAno() +
              ", possuiTurbo=" + possuiTurbo +
              '}';
  }


}

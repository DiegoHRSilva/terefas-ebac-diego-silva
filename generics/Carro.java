package generics;

public abstract class  Carro {
  private String modelo;
  private String marca;
  private int ano;

  public Carro(String modelo, String marca, int ano) {
      this.setModelo(modelo);
      this.setMarca(marca);
      this.ano = ano;
  }

  @Override
  public String toString() {
      return "Carro{" +
              "modelo='" + getModelo() + '\'' +
              ", marca='" + getMarca() + '\'' +
              ", ano=" + ano +
              '}';
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }
  
}


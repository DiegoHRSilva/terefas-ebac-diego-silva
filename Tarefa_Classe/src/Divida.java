public class Divida {
    int codigo;
    String pessoa;

    double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



    public void cadastrarCodigo(int codigo){
        setCodigo(codigo);
    }

    public void cadastrarPessoa(String pessoa){
        setPessoa(pessoa);
    }

    public void cadastrarvalor(double valor){
        setValor(valor);
    }

}

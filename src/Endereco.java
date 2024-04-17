package listaSeis.src;

public class Endereco {
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String cidade;
    public String bairro;
    public String rua;

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }
}

package listaSeis.src;

public class Item {
    public int id;
    public String nome;
    public String tipo;
    public double valor;

    public void gerarDescricao() {
        System.out.println("Id: " + this.id + "\nNome: " + this.nome + "\nTipo: " + this.tipo + "\nValor: " + this.valor);
    }
}

package listaSeis.src;

public class Item {
    public int id;
    public String nome;
    public String tipo;
    public double valor;

    public void gerarDescricao() {
        System.out.println("id: " + this.id + "\nnome: " + this.nome + "\ntipo: " + this.tipo + "\nvalor: " + this.valor);
    }
}

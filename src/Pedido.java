package listaSeis.src;

import java.util.Date;

public class Pedido {
    public int id;
    public Date data = new Date();
    public Long diaEmMs = 86400000l;
    public Long dataCriacao = data.getTime(); // 86400000 é 1 dia em milissegundos
    public Long dataPagamento;
    public Long dataVencimentoReserva = (dataCriacao + (diaEmMs * 3)); // Já adiciono os 3 dias
    public Cliente cliente = Cliente.idCliente;
    public Loja loja = Loja.id;
    public Vendedor vendedor = Vendedor.idVendedor;
    public int totalVenda;

    public Item[] itens = new Item[99];

    public Pedido() {
        for (int i = 0; i < itens.length - 1; i++) {
            itens[i] = new Item(); // Construtor pra inicializar o array e todos os Objetos de Item entrem no array itens dessa classe
        }
    }

    public int calcularValorTotal() {
        for (int i = 0; i < itens.length - 1; i++) {
            totalVenda += itens[i].valor;
        }
        return totalVenda;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Pedido: " + id + "\nData da Criação: " + dataPagamento.toString());
    }
}
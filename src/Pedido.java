package listaSeis.src;

import java.util.Date;

public class Pedido {
    public int id;
    public Date dataCriacao; //86400000 é 1 dia em milissegundos
    public Date data = new Date();
    public Date dataPagamento = data.getTime();
    public Date dataVencimentoReserva = (dataCriacao.getTime() + 259200000); //Já adiciono os 3 dias
    public Cliente cliente = Cliente.idCliente;
    public Loja loja = Loja.id;
    public Vendedor vendedor = Vendedor.idVendedor;

}
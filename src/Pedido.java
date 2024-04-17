package listaSeis.src;

import java.util.Date;

public class Pedido {
    public static int id;
    public static Date dataCriacao; //86400000 é 1 dia em milissegundos
    public static Date dataPagamento;
    public static Date dataVencimentoReserva = (dataCriacao.getTime() + 259200000); //Já adiciono os 3 dias
    public static Cliente cliente = Cliente.idCliente;
    public static Loja loja = Loja.id;
    public static Vendedor vendedor = Vendedor.idVendedor;

}

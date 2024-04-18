package listaSeis;

import java.util.Scanner;

import calculadoraV2.src.*;
import listaSeis.src.Gerente;
import listaSeis.src.Pedido;
import listaSeis.src.ProcessaPedido;

public class Main {
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        int optionMenu = 0;

        // Declarando Loja
        Loja prisma = new Loja();
        prisma.id = 1; // Na próxima versão vou implementar lógica para o ID.
        prisma.nome = "Prisma Softwares LTDA";
        prisma.razaoSocial = "Loja do Marcelolinho";
        prisma.cnpj = "0098060800120";
        prisma.cidade = "Cascavel";
        prisma.bairro = "Centro";
        prisma.rua = "Rua Presidente Bernardes";
        // Declarando Vendedor
        Vendedor marcelo = new Vendedor();
        marcelo.id = 1;
        marcelo.nome = "Marcelo Programador";
        marcelo.idade = 18;
        marcelo.nomeLoja = "Prisma Softwares LTDA";
        marcelo.cidade = "Cascavel";
        marcelo.rua = "Francisco Beltrão";
        marcelo.bairro = "Centro";
        marcelo.salarioBase = 1530.60;
        marcelo.salarioRecebido = new Double[] {1530.60, 1234.5, 5432.1};
        // Declarando Cliente
        Cliente kaue = new Cliente();
        kaue.id = 1;
        kaue.nome = "Kauê Orlandini";
        kaue.idade = 18;
        kaue.cidade = "Cascavel";
        kaue.bairro = "Maria Luiza";
        // Cria Gerente
        Gerente sandro = new Sandro();
        sandro.id = 1;
        sandro.nome = "Sandro";
        sandro.idade = 25;
        sandro.nomeLoja = "Prisma Softwares LTDA";
        sandro.endereco.bairro = "Centro";
        sandro.endereco.cidade = "Cascavel";
        sandro.endereco.rua = "Av. Brasil";
        sandro.salarioBase = 17550;
        sandro.salarioRecebido = new Double[] {17550, 1600.50, 17001.37};
        // Cria Item
        Item apostila = new Item();
        
        // Cria Pedido

        // Alimenta ProcessaPedido



        exibirMenu(option, optionMenu, prisma, marcelo, kaue);
    }

    public static void exibirMenu(Scanner opcao, int varOpcao, Loja varLoja, Vendedor varVendedor, Cliente varCliente, Pedido varPedido, ProcessaPedido varProcessaPedido) {
        do {
            System.out.println("[1] - Dados empresa \n[2] - Dados Vendedor \n[3] - Dados Cliente \n[4] - Criar Pedido \n[5] - Sair");
            varOpcao = opcao.nextInt();

            switch (varOpcao) {
                case 1:
                    varLoja.apresentarse();
                    varLoja.addClientes(varCliente.id);
                    varLoja.contarClientes();
                    varLoja.addVendedores(varVendedor.id);
                    varLoja.contarVendedores();
                    break;

                case 2:
                    varVendedor.apresentarse();

                    varVendedor.calcularMedia();
                    varVendedor.calcularBonus();
                    break;

                case 3:
                    varCliente.apresentarse();
                    break;

                case 4:
                    varPedido.calcularValorTotal();
                    varPedido.gerarDescricaoVenda();
                    varProcessaPedido.processar();
                    break;

                case 5:
                    System.out.println("Calculadora encerrada!");
                    break;

                default:
                    System.out.println("Erro de digitação, escolha uma das opções novamente.");
                    break;
            }
        } while (varOpcao != 5);
    }
}
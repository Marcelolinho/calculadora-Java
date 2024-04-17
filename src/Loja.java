package listaSeis.src;

public class Loja {
    public static int id;
    public static String nome;
    public static String razaoSocial;
    public static String cnpj;
    public static String cidade;
    public static String bairro;
    public static String rua;
    public static int[] vendedores = new int[99];
    public static int[] clientes = new int[99];

    public void apresentarse() {
        System.out.println("Loja: " + nome + "\nCNPJ: " + cnpj + "\nEndereço: " + cidade + ", " + bairro + ", " + rua);
    }

    public void addClientes(int idCliente) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == 0) {
                clientes[i] = idCliente;
                break;
            }
        }
    }

    public int contarClientes() {
        int count = 0;
        for (int id : clientes) {
            if (id != 0) {
                count++;
            }
        }
        return count;
    }

    public void addVendedores(int idVendedores) {
        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i] == 0) {
                vendedores[i] = idVendedores;
                break;
            }
        }
    }

    public int contarVendedores() {
        int count = 0;
        for (int id : vendedores) {
            if (id != 0) {
                count++;
            }
        }
        return count;
    }
}

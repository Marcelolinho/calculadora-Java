package listaSeis.src;

public class Cliente extends Pessoa{
    public static int id;
    public static String nome;
    public static int idade;
    public static String cidade;
    public static String bairro;

    public void apresentarse() {
        System.out.println("Olá, eu sou o vendedor(a)" + nome + " e tenho " + idade + " anos de idade.");
    }
}

package listaSeis.src;

public class Endereco {
    public String cidade;
    public String bairro;
    public String rua;
    public String numero;
    public String complemeto;
    
    public void apresentaLogradouro() {
        System.out.println("Cidade: " + cidade + "\nBairro: " + bairro + "\nRua: " + rua + "\nNúmero: " + numero + "\nComplemento: " + complemento);
    }
}

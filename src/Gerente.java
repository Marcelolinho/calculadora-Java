package listaSeis.src;

public class Gerente extends Pessoa{
    public int idGerente;
    public Double salarioBase;
    public Double[] salarioRecebido = new Double[99];
    public Double[] bonusMensal = new Double[99];

    public void apresentarse() {
        System.out.println("Olá, eu sou o vendedor(a) " + nome + ", moro na cidade " + cidade + ", no bairro " + bairro
                + ", na rua " + this.rua + "!");
    }

    public void calcularMedia() {
        double total = 0;
        for (int i = 0; i < salarioRecebido.length - 1; i++) {
            total += salarioRecebido[i];
        }
        total = total / salarioRecebido.length;
        System.out.println("A média salarial foi de: " + total);
    }

    public void calcularBonus() {
        double totalBonus = 0;
        for (int i = 0; i <= salarioRecebido.length - 1; i++) {
            if (salarioRecebido[i] == 0) {
                break;
            } else {
                bonusMensal[i] = salarioRecebido[i] * 0.35;
                totalBonus += bonusMensal[i];
                System.out.println("Seu bônus do salário " + i + " foi de: " + totalBonus);
            }

        }

    }
}
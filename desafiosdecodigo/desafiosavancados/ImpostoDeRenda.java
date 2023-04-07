import java.io.IOException;
import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0d;
        double diferenca = 0d;

        // TODO: Agora utilizando estrutura condicional implemente em seu código as
        // condições necessárias para o cálculo da taxa de imposto de renda:

        if (renda > 4500) {
            imposto = 1000 * 0.08 + 1500 * 0.18;
            diferenca = renda - 4500;
            imposto += diferenca * 0.28;
        } else if (renda > 3000) {
            imposto = 1000 * 0.08;
            diferenca = renda - 3000;
            imposto += diferenca * 0.18;
        } else if (renda > 2000) {
            diferenca = renda - 2000;
            imposto = diferenca * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f", imposto);
        }
        leitor.close();
    }

}

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double soma = 0d;
		// boolean triangulo;
		
        //TODO: Implemente a condição necessária para o cálculo do triângulo:
        //Dica: Você pode utilizar o String.format() na formatação do texto.
		
		if((A < B + C) && (B < A + C) && (C < B + A)){
            // triangulo = true;
            soma = A + B + C;
            System.out.println("Perimetro = " + soma);
        }else{
            soma = ((A + B)*C)/2;
            System.out.println("Area = " + soma);
        }
        leitor.close();
	}
}

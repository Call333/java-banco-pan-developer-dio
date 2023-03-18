package exer.sobrecarga;

public class Main {
    public static void main(String[] args) {
        CalculaFigurasPlanas cfp = new CalculaFigurasPlanas();

        System.out.println("-----------Àreas dos Quadriláteros-----------");

        System.out.println("Quadrado = " + cfp.calculaQuadrilatero(5));
        System.out.println("Retângulo = " + cfp.calculaQuadrilatero(7d, 3d));
        System.out.println("Trapézio = " + cfp.calculaQuadrilatero(8, 5, 6));
        System.out.println("Losango = " + cfp.calculaQuadrilatero(15f, 9f));

        }
}

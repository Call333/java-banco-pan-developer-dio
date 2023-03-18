package exer.sobrecarga;

public class CalculaFigurasPlanas {

    double area;

    public double calculaQuadrilatero(double lado){
        return this.area = lado * lado;
    }

    public double calculaQuadrilatero(double comprimento, double altura){
        return this.area = comprimento * altura;
    }

    public double calculaQuadrilatero(double baseMaior, double baseMenor, double altura){
        return this.area = ((baseMaior + baseMenor)*altura)/2;
    }

    public double calculaQuadrilatero(float diagonalMaior, float diagonalMenor){
        return this.area = (diagonalMaior * diagonalMenor)/2;
    }
}

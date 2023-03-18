package exer.exercicioum;

public class Emprestimo {
    
    private int nParcelas;
    private double valor;
    private double taxa = 1.15;

    public void calculaValor(double valor, int nParcelas){
        this.valor = valor;
        this.nParcelas = nParcelas;

        double valorPorMes = (this.valor / this.nParcelas)* taxa; // Juros mensais sobre as parcelas

        System.out.println("O Empréstimo de " + this.valor +  " será pago em " + this.nParcelas + " parcelas de " + valorPorMes + ". (Valor acrescido de juros de 15% ao mês)");
    }

}   

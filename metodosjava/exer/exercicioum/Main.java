package exer.exercicioum;

public class Main {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.dividir(10, 5);
        calc.multiplicar(5, 4);
        calc.somar(199, 199);
        calc.subtrair(150, 60);
        calc.subtrair(60, 150);

        // execucao da classe mensagem

        Mensagem msg = new Mensagem();
        msg.enviarMensagem("Olá, tudo bem");

        // execucao emprestimo

        Emprestimo emp = new Emprestimo();
        emp.calculaValor(3000, 12);
    }

}

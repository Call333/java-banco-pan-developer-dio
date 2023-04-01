package edu.calebe.herança.funcionarios;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        // upcast

        
        Funcionario g = new Gerente();
        Funcionario v = new Vendedor();
        Funcionario f = new Faxineiro();

        
        // downcast == Erro de cast de objeto.

        
        Vendedor vendedor = (Vendedor) new Funcionario();
        Gerente gerente = (Gerente) new Funcionario();
        Faxineiro faxineiro = (Faxineiro) new Funcionario();
    

        // Não trabalhe com downcast em OO. pois pode há perda de informação
    }

}

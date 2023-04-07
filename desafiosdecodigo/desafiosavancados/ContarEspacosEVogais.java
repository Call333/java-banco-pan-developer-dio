
import java.util.Scanner;

// TODO: Implemente condições (laços) adequados para que possamos contar os
// espaços em brancos e as vogais que existem na string.
// Dica: Você pode utilizar o Character.toLowerCase em sua condição:

public class ContarEspacosEVogais {

  char[] arrVogais = { 'a', 'e', 'i', 'o', 'u' };

  private boolean eVogal(char c) {
    for (int i = 0; i < arrVogais.length; i++) {
      if (c == arrVogais[i]) {
        return true;
      }
    }
    return false;
  }

  public int contarVogais(String s) {
    int contarVogais = 0;
    for (int j = 0; j < s.length(); j++) {
      char c = s.charAt(j);
      if (eVogal(c)) {
        contarVogais = contarVogais + 1;
      }
    }

    return contarVogais;
  }

  public static void main(String[] args) {

    ContarEspacosEVogais c = new ContarEspacosEVogais();

    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str = str.toLowerCase();
    String[] strSplit = str.split(" ");
    int espacosEmBranco = strSplit.length - 1, quantVogais = c.contarVogais(str);
    
    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    sc.close();
  }
}

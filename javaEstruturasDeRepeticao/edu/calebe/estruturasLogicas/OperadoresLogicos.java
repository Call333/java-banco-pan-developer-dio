package edu.calebe.estruturasLogicas;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);

        System.out.println(b2 || b3);
        System.out.println(b2 || b4);

        System.out.println(b1 ^ b3);
        System.out.println(b4 ^ b1);

        System.out.println(!b1);
        System.out.println(!b2);

        System.out.println((i1 > i2) || (f2 < f1));

        System.out.println((i1 + i2) < (f2 - f1) && true);
    }
}

package edu.calebe.estruturasRelacionais;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.68;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Diferente";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1589L;
        long l2 = 28439L;

        System.out.println( i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1 > i2);
        System.out.println((i1 <= i2) + "\n");

        System.out.println(f1 == f2);
        System.out.println(f1 != f2);
        System.out.println(f1 >= f2);
        System.out.println((f1 < f2) + "\n");
        
        System.out.println(c1 == c2);
        System.out.println(c1 != c2);
        System.out.println(c1 > c2);
        System.out.println((c1 <= c2) + "\n");

        System.out.println(s1 == s2);
        System.out.println((s1 != s2) + "\n");
        // System.out.println(s1 >= s2); #ERROR
        // System.out.println(s1 < s2); #ERROR

        System.out.println(b1 == b2);
        System.out.println((b1 != b2) + "\n");
        // System.out.println(b1 > b2); #ERROR
        // System.out.println(b1 <= i1); #ERROR

        System.out.println((l2 > f1) + "\n");
    }
}
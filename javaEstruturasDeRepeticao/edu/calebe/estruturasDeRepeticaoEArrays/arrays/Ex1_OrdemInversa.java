package edu.calebe.estruturasDeRepeticaoEArrays.arrays;

public class Ex1_OrdemInversa{
    public static void main(String[] args) {
        int[] vetor = {-5, -6, 15, 50, 8, 4};
        
        System.out.println("Array na ordem normal: ");
        for( int i = 0; i < vetor.length; i++ ){
            System.out.println(vetor[i]);
        }
        System.out.println("\nArray na ordem inversa: ");
        int count = (vetor.length - 1);
        while(count >= 0){
            System.out.println(vetor[count]);
            count--;
        }

        System.out.println("\n" + vetor[5]);
    }
}
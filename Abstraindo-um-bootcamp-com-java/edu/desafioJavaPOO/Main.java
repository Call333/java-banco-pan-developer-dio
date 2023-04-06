package edu.desafioJavaPOO;

import java.time.LocalDate;

import edu.desafioJavaPOO.bootcamp.Curso;
import edu.desafioJavaPOO.bootcamp.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        

        System.out.println(mentoria);
        System.out.println(curso1);
        System.out.println(curso2);
    }
}
package edu.desafioJavaPOO;

import java.time.LocalDate;

import edu.desafioJavaPOO.bootcamp.Bootcamp;
import edu.desafioJavaPOO.bootcamp.Conteudo;
import edu.desafioJavaPOO.bootcamp.Curso;
import edu.desafioJavaPOO.bootcamp.Dev;
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

        Conteudo conteudo = new Curso();
        conteudo.setTitulo("Curso Python");
        conteudo.setDescricao("Curso para desenvolvimento em python para iniciantes");
        // System.out.println(conteudo);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        

        // System.out.println(mentoria);
        // System.out.println(curso1);
        // System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1); 
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-------");
        System.out.println("Conteudos Concluídas Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("\nConteudos Incritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularXp());

        System.out.println("---------");

        Dev devJoão = new Dev();
        devJoão.setNome("João");
        devJoão.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos João: " + devJoão.getConteudosInscritos());
        devJoão.progredir();
        devJoão.progredir();
        devJoão.progredir();
        System.out.println("---");
        System.out.println("Conteudos Concluídos João: " + devJoão.getConteudosConcluidos());
        System.out.println("\nConteudos Incritos João: " + devJoão.getConteudosInscritos());
        System.out.println("XP: " + devJoão.calcularXp());
    }
}
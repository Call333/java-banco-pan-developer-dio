package edu.calebe.map.exercicios.exercicio01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Estado {
    
    private String nome;
    private Integer populacao;

    Estado(String nome, Integer populacao){
        this.nome = nome;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }
    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return " " + nome + " - " + "População: " + populacao;
    }

    public static void main(String[] args) {
        
        // Crie um dicionário e relacione os estados e sua populacoes
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE",  9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }}; 

    
        /* 

        Map<String, Estado> estados1 = new HashMap<>();

        Estado n;

        estados1.put("RN", n = new Estado("Rio Grande do Norte", 3534265d));
        estados1.put("AL", n = new Estado("Alagoas", 3351543d));
    
        System.out.println(estados1);

        estados1.put("AL", n = new Estado("Alagoas", 5351543d));

        System.out.println(estados1);
        
        */



        // Substitua a população do estado do RN por 3.534.165;

        estados.put("RN", 3354165);

        System.out.println(estados);

        // Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;

        System.out.println(estados.containsKey("PB"));

        estados.put("PB", 4039277);

        System.out.println(estados);

        // Exiba a população PE:
        
        System.out.println(estados.get("PE"));

        // Exiba todos os estados e suas populações na ordem que foi informado:

        Map<String, Double> estadosLHS= new LinkedHashMap<>(){{
            put("PE",  9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }}; 

        System.out.println(estadosLHS);

        // Exiba os estados e suas populações em ordem alfabética:

        Set<Map.Entry<String, Integer>> estadosTS= new TreeSet<>(new ComparatorNomeEstado());
        estadosTS.addAll(estados.entrySet());
        System.out.println(estadosTS);

        // Exiba o estado com o menor população e sua quantidade;

        Integer menorQtdPop = Collections.min(estados.values());

        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String nomeEstado = "";

        for (Map.Entry<String,Integer> entry : entries) {
            if(entry.getValue().equals(menorQtdPop)){
                nomeEstado = entry.getKey();
                System.out.println("O Estado com menor população é " + nomeEstado + " - População " + menorQtdPop);
            }
        }

        // Exiba o estado com o maior população e sua quantidade:

        Integer maiorQtdPop = Collections.max(estados.values());
        for (Map.Entry<String,Integer> entry : entries) {
            if(entry.getValue().equals(maiorQtdPop)){
                nomeEstado = entry.getKey();
                System.out.println("O Estado com maior população é " + nomeEstado + " - População " + maiorQtdPop);
            }
        }

        // Exiba a soma da população desses estados:

        Iterator<Integer> iter = estados.values().iterator();
        Integer soma = 0;
        while(iter.hasNext()){
            soma += iter.next();
        }

        System.out.println("Soma das populações: " + soma);
 
        // Exiba a média da população deste dicionário de estados;

        System.out.println("A média da população dos estados é de " + (soma/estados.size()));

        // Remova os estados com a população menor que 4.000.000;
        
        Iterator<Integer> iter1 = estados.values().iterator();
        while(iter1.hasNext()){
            if(iter1.next() < 4000000){
                iter1.remove();
            }
        }

        System.out.println(estados);

        // Apague o dicionário de estados;

        estados.clear();
        System.out.println(estados);

        // Confira se o dicionário está vazio:

        System.out.println("estados está vazio? " + estados.isEmpty());
    }

}

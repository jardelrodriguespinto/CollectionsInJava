package com.entendentoequalsehashcode;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Aluno> alunos = recuperarAlunos();
        Aluno pesquisa = new Aluno(1L);
        boolean existeAluno = alunos.contains(pesquisa);
        String resultado = (existeAluno ? "Aluno existe" : "Aluno não existe");
        System.out.println(resultado);

    }
    public static Set<Aluno> recuperarAlunos(){
        // criando diferents alunos
        Aluno aluno1 = new Aluno(1L, "João");
        Aluno aluno2 = new Aluno(2L, "Maria");
        Aluno aluno3 = new Aluno(3L, "Pedro");

        Set<Aluno> alunos = new HashSet<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        return alunos;
    }
}

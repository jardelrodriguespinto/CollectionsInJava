package com.entendentoequalsehashcode;

import java.util.Objects;

public class Aluno {
    private Long codigo;
    private String nome;

    public Aluno(Long codigo){
        this.codigo = codigo;
    }
    public Aluno(Long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getCodigo().equals(aluno.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}

package com.equalsandhashcode;

import java.util.Objects;

public class Produto {
    private String sku; //IHPD2360, IEPL1010 CHP021, CHPR021 - Impressora HP Deskjet 2360
    private String nome;

    public Produto(String sku, String nome) {
        this.sku = sku;
        this.nome = nome;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto [" + "sku = " + sku + ", nome = " + nome + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return getSku().equals(produto.getSku()) && getNome().equals(produto.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSku(), getNome());
    }
}

package model;

import java.util.Objects;

public class Produto {

    String nome;
    String fabricante;
    Double preco;


    public Produto() {

    }


    public Produto(String nome, String fabricante, Double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(getNome(), produto.getNome()) && Objects.equals(getFabricante(), produto.getFabricante()) && Objects.equals(getPreco(), produto.getPreco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getFabricante(), getPreco());
    }
}

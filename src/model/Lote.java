package model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Lote {


    List<Produto> produtos;
    Integer quantidade;
    Date date;

    public Lote(Produto p1, int i, String s) {
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.date = date;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lote)) return false;
        Lote lote = (Lote) o;
        return Objects.equals(getProdutos(), lote.getProdutos()) && Objects.equals(getQuantidade(), lote.getQuantidade()) && Objects.equals(getDate(), lote.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProdutos(), getQuantidade(), getDate());
    }
}

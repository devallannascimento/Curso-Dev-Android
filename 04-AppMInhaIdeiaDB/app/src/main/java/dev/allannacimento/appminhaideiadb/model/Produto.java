package dev.allannacimento.appminhaideiadb.model;

public class Produto {

    private int id;

    private String produto;
    private String fornecador;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getFornecador() {
        return fornecador;
    }

    public void setFornecador(String fornecador) {
        this.fornecador = fornecador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

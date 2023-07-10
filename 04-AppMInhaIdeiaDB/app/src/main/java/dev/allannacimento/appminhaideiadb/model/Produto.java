package dev.allannacimento.appminhaideiadb.model;

import android.util.Log;

import dev.allannacimento.appminhaideiadb.api.AppUtil;
import dev.allannacimento.appminhaideiadb.controller.ICrud;

public class Produto implements ICrud{

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

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "incluir: Produto");
    }

    @Override
    public void alterar() {

    }

    @Override
    public void deletar() {

        Log.i(AppUtil.TAG, "deletar: ");

    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG,"listar: Produtos");
    }
}

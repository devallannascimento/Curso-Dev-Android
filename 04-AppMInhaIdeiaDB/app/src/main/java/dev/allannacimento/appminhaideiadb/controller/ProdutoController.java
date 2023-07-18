package dev.allannacimento.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dev.allannacimento.appminhaideiadb.api.AppUtil;
import dev.allannacimento.appminhaideiadb.datamodel.ProdutoDataModel;
import dev.allannacimento.appminhaideiadb.datasource.AppDataBase;
import dev.allannacimento.appminhaideiadb.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues dadoDoObjeto;

    public ProdutoController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ProdutoController: Conetado");

    }

    @Override
    public boolean incluir(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.PRODUTO,obj.getProduto());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecador());

        return insert(ProdutoDataModel.TABELA, dadoDoObjeto);
    }

    @Override
    public boolean alterar(Produto obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.ID,obj.getId());
        dadoDoObjeto.put(ProdutoDataModel.PRODUTO,obj.getProduto());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecador());

        return true;
    }

    @Override
    public boolean deletar(int id) {
        return true;
    }

    @Override
    public List<Produto> listar() {

        List<Produto> lista = new ArrayList<>();

        return lista;
    }
}

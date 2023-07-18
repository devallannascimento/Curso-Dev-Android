package dev.allannacimento.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.List;

import dev.allannacimento.appminhaideiadb.api.AppUtil;
import dev.allannacimento.appminhaideiadb.datamodel.ClienteDataModel;
import dev.allannacimento.appminhaideiadb.datasource.AppDataBase;
import dev.allannacimento.appminhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadoDoObjeto;

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conetado");

    }

    @Override
    public boolean incluir(Cliente obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());

        return insert(ClienteDataModel.TABELA, dadoDoObjeto);
    }

    @Override
    public boolean alterar(Cliente obj) {

        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ClienteDataModel.ID,obj.getId());
        dadoDoObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());

        return update(ClienteDataModel.TABELA,dadoDoObjeto);

    }

    @Override
    public boolean deletar(int id) {

        return deleteByID(ClienteDataModel.TABELA,id);

    }

    @Override
    public List<Cliente> listar() {

        return getAllClientes(ClienteDataModel.TABELA);

    }
}

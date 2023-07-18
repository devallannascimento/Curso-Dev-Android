package dev.allannacimento.appminhaideiadb.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dev.allannacimento.appminhaideiadb.api.AppUtil;
import dev.allannacimento.appminhaideiadb.datamodel.ClienteDataModel;
import dev.allannacimento.appminhaideiadb.datamodel.ProdutoDataModel;
import dev.allannacimento.appminhaideiadb.model.Cliente;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "AppMinhaIdeida.sqlite";
    public static final int DB_VERSION = 1;

    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: Criando Banco de Dados");

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTabela());

        Log.d(AppUtil.TAG, "onCreate: Tabela Cliente criada..."+ClienteDataModel.criarTabela());

        db.execSQL(ProdutoDataModel.criarTabela());

        Log.d(AppUtil.TAG, "onCreate: Tabela Produto criada..."+ProdutoDataModel.criarTabela());

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }

    /**
     * Método para incluir dados no banco de dados
     * @return
     */
    public boolean insert(String tabela, ContentValues dados){

        db = getWritableDatabase();

        boolean retorno = false;

        try{
            retorno = db.insert(tabela,null,dados) > 0;
        }catch (Exception e){
            Log.d(AppUtil.TAG, "insert: "+e.getMessage());
        }

        return retorno;
    }

    /**
     * Método para deletar dados no banco de dados
     * @return
     */
    public boolean deleteByID(String tabela, int id){

        db = getWritableDatabase();

        boolean retorno = false;

        try{
            retorno = db.delete(tabela,"id = ?",new String[] {String.valueOf(id)}) > 0;
        }catch (Exception e){
            Log.d(AppUtil.TAG, "delete: "+e.getMessage());
        }

        return retorno;
    }

    /**
     * Método para alterar dados no banco de dados
     * @return
     */
    public boolean update(String tabela, ContentValues dados){

        db = getWritableDatabase();

        boolean retorno = false;

        try{
            retorno = db.update(tabela,dados, "id=?",
                    new String[] {String.valueOf(dados.get("id"))}) > 0;
        }catch (Exception e){
            Log.d(AppUtil.TAG, "update: "+e.getMessage());
        }

        return retorno;
    }

    /**
     * Método para listar dados no banco de dados
     * @return
     */
    public List<Cliente> getAllClientes(String tabela){

        db = getWritableDatabase();

        List<Cliente> clientes = new ArrayList<>();
        Cliente obj;

        String sql = "SELECT * FROM "+tabela;

        Cursor cursor;

        cursor = db.rawQuery(sql,null);

        if (cursor.moveToFirst()){

            do {
                obj = new Cliente();

                obj.setId(cursor.getInt(cursor.getColumnIndex(ClienteDataModel.ID)));
                obj.setNome(cursor.getString(cursor.getColumnIndex(ClienteDataModel.NOME)));
                obj.setEmail(cursor.getString(cursor.getColumnIndex(ClienteDataModel.EMAIL)));

                clientes.add(obj);

                Log.i("Listar", "getAllClientes: "+obj.getNome());

            }while (cursor.moveToNext());

        }

        return clientes;
    }

}

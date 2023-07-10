package dev.allannacimento.appminhaideiadb.datamodel;

public class ClienteDataModel {

    public static final String TABELA = "cliente";
    public static final String ID = "id"; // integer
    public static final String NOME = "nome"; // text
    public static final String EMAIL = "email"; // text

    public static String queryCriarTabela = "";

    public static String criarTabela(){

        queryCriarTabela += "CREATE TABLE "+TABELA+" (";
        queryCriarTabela += ID+" integer primary key autoincrement, ";
        queryCriarTabela += NOME+" text, "; // nome text
        queryCriarTabela += EMAIL+" text ";
        queryCriarTabela += ")";

        return queryCriarTabela;
    }

}

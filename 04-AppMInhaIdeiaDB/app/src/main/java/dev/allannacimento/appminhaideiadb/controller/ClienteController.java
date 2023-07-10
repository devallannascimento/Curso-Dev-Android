package dev.allannacimento.appminhaideiadb.controller;

import android.content.Context;
import android.util.Log;

import dev.allannacimento.appminhaideiadb.api.AppUtil;
import dev.allannacimento.appminhaideiadb.datasource.AppDataBase;

public class ClienteController extends AppDataBase {

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conetado");

    }
}

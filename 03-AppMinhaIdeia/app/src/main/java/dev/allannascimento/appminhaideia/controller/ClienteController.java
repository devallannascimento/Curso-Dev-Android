package dev.allannascimento.appminhaideia.controller;

import android.util.Log;

import dev.allannascimento.appminhaideia.apoio.AppUtil;

public class ClienteController {

    String versaoApp;
    public ClienteController() {

        this.versaoApp = AppUtil.versaoDoAplicativo();

        Log.d(AppUtil.TAG, "ClienteController: Versão App: "+versaoApp);

    }
}

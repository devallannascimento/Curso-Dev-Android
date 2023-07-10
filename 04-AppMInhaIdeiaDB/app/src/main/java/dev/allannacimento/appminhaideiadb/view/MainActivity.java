package dev.allannacimento.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import dev.allannacimento.appminhaideiadb.R;
import dev.allannacimento.appminhaideiadb.api.AppUtil;
import dev.allannacimento.appminhaideiadb.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");

        clienteController = new ClienteController(getApplicationContext());

    }
}
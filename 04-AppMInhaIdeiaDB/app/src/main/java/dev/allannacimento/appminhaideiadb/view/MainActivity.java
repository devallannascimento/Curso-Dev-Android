package dev.allannacimento.appminhaideiadb.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import dev.allannacimento.appminhaideiadb.R;
import dev.allannacimento.appminhaideiadb.api.AppUtil;
import dev.allannacimento.appminhaideiadb.controller.ClienteController;
import dev.allannacimento.appminhaideiadb.model.Cliente;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;
    Cliente obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");

        clienteController = new ClienteController(getApplicationContext());

        for (Cliente obj: clienteController.listar()) {

            Log.e("Retorno", "onCreate: "+obj.getId()+" "+obj.getNome()+" "+obj.getEmail());

        }

    }
}
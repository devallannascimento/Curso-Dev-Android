package dev.allannascimento.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import dev.allannascimento.appminhaideia.R;
import dev.allannascimento.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    Cliente objCliente;

    String TAG = "APP MINHA IDEIA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela Principal carregada...");

        objCliente = new Cliente(
                "Állan",
                "allan@email.com",
                "7399900-0000",
                20,
                true);
    }
}
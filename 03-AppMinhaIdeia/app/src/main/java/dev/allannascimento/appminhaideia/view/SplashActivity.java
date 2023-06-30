package dev.allannascimento.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import dev.allannascimento.appminhaideia.R;
import dev.allannascimento.appminhaideia.apoio.AppUtil;
import dev.allannascimento.appminhaideia.controller.ClienteController;
import dev.allannascimento.appminhaideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    public static final int TIME_OUT_SPLASH = 3000;

    TextView txtAppVersion;

    Cliente objCliente;
    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(AppUtil.TAG,"onCreate: Tela Splash carregada...");

        txtAppVersion = findViewById(R.id.txtAppVersion);
        txtAppVersion.setText(AppUtil.versaoDoAplicativo());

        clienteController = new ClienteController();

        cumutarTelaSplash();

    }

    private void cumutarTelaSplash() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                objCliente = new Cliente(
                        "Állan",
                        "allan@email.com",
                        "7399900-0000",
                        20,
                        true);

                Intent telaPrincipal = new Intent(
                        SplashActivity.this,
                        MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("nome",objCliente.getNome());
                bundle.putString("email",objCliente.getEmail());

                telaPrincipal.putExtras(bundle);

                startActivity(telaPrincipal);
                finish();

            }
        },TIME_OUT_SPLASH);
}
}
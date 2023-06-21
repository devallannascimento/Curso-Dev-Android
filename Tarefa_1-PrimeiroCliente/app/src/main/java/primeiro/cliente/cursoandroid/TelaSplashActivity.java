package primeiro.cliente.cursoandroid;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class TelaSplashActivity extends AppCompatActivity {

    String TAG = "APP_PRIMEIRO_CLIENTE";

    public static final int TIME_OUT_SPLASH = 15000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada...");

        cumutarTelaSplash();

    }

    private void cumutarTelaSplash() {

        Log.d(TAG,"cumutarTelaSplash: Mudando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {

                Intent telaPrincipal = new Intent(TelaSplashActivity.this,
                        MainActivity.class);

                startActivity(telaPrincipal);
                finish();

            }
        },TIME_OUT_SPLASH);

    }

}
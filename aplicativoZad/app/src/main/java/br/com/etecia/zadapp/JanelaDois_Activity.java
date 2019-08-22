package br.com.etecia.zadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class JanelaDois_Activity extends AppCompatActivity {
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_dois_layout);

        btnVoltar = (Button) findViewById(R.id.btnVoltarJanela1);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Voltandooo",
                        Toast.LENGTH_LONG).show();

            startActivity(new Intent(getApplicationContext(),
                    MainActivity.class));
            }
        });

    }
}

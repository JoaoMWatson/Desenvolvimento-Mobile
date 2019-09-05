package br.com.etecia.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JanelaDois_Activity extends AppCompatActivity {

    Button btnAbrirJanela3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_dois_layout);

        btnAbrirJanela3 = (Button)findViewById(R.id.btnAbrirJanela3);

        btnAbrirJanela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),JanelaTres_Activity.class));
                finish();
            }
        });
    }
}

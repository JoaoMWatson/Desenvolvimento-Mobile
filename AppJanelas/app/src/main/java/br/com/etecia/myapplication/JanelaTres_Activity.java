package br.com.etecia.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JanelaTres_Activity extends AppCompatActivity {

    Button btnAbrirJanela1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_tres_layout);

        btnAbrirJanela1 = (Button)findViewById(R.id.btnAbrirJanela1);

        btnAbrirJanela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });
    }
}

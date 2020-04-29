package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Abrir uma nova activity
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //instanciar o objeto
                Usuario usuario = new Usuario("Fernando","fernando973@gmail.com");



                //Passando dados
                intent.putExtra("nome","Fernando");
                intent.putExtra("idade",39);
                intent.putExtra("objeto",usuario);
                startActivity(intent);
            }
        });


    }
}

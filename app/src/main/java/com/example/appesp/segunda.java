package com.example.appesp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        resultado=(TextView)findViewById(R.id.txtresul);
        String dato=getIntent().getStringExtra("resulta");
        resultado.setText("Resultado:"+dato);

    }


    public void regresar(View view){

        Intent envio =new Intent(this,MainActivity.class);
        startActivity(envio);
    }
}
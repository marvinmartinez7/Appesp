package com.example.appesp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnum1,txtnum2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1=(EditText)findViewById(R.id.txtn1);
        txtnum2=(EditText)findViewById(R.id.txtn2);
        resultado=(TextView)findViewById(R.id.txtresul);


    }

    public void suma(View view)
    {
        String valor1=txtnum1.getText().toString();
        String valor2=txtnum2.getText().toString();

        if(!valor1.isEmpty() && !valor2.isEmpty())
        {

            int num1=Integer.parseInt(valor1);
            int num2=Integer.parseInt(valor2);

            int suma=num1+num2;

            String resul=String.valueOf(suma);
            //resultado.setText(resul);
            Intent envio=new Intent(this,segunda.class);
            envio.putExtra("resulta",resul);
            startActivity(envio);

        }else{
            Toast.makeText(this, "Favor ingresar los datos ", Toast.LENGTH_SHORT).show();
        }



    }

    public void resta(View view)
    {
        String valor1=txtnum1.getText().toString();
        String valor2=txtnum2.getText().toString();


        if(!valor1.isEmpty() && !valor2.isEmpty())
        {

            int num1=Integer.parseInt(valor1);
            int num2=Integer.parseInt(valor2);

            int suma=num1-num2;

            String resul=String.valueOf(suma);
            //resultado.setText(resul);
            Intent envio=new Intent(this,segunda.class);
            envio.putExtra("resulta",resul);
            startActivity(envio);

        }else{
            Toast.makeText(this, "Favor ingresar los datos ", Toast.LENGTH_SHORT).show();
        }

    }

    public void multi(View view)
    {
        String valor1=txtnum1.getText().toString();
        String valor2=txtnum2.getText().toString();


        if(!valor1.isEmpty() && !valor2.isEmpty())
        {

            int num1=Integer.parseInt(valor1);
            int num2=Integer.parseInt(valor2);

            int suma=num1*num2;

            String resul=String.valueOf(suma);
            //resultado.setText(resul);
            Intent envio=new Intent(this,segunda.class);
            envio.putExtra("resulta",resul);
            startActivity(envio);

        }else{
            Toast.makeText(this, "Favor ingresar los datos ", Toast.LENGTH_SHORT).show();
        }

    }

    public void dividir(View view)
    {
        String valor1=txtnum1.getText().toString();
        String valor2=txtnum2.getText().toString();

        if(!valor1.isEmpty() && !valor2.isEmpty())
        {

            int num1=Integer.parseInt(valor1);
            int num2=Integer.parseInt(valor2);

            int suma=num1/num2;

            String resul=String.valueOf(suma);
            //resultado.setText(resul);
            Intent envio=new Intent(this,segunda.class);
            envio.putExtra("resulta",resul);
            startActivity(envio);

        }else{
            Toast.makeText(this, "Favor ingresar los datos ", Toast.LENGTH_SHORT).show();
        }

    }


}
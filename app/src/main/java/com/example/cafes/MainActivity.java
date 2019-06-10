package com.example.cafes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantcafe = 0;
    int tipocafe = 0;
    int precoact = 0;

    //Diminuir e aumentar quantidade de cafes
    public void mais(View view){
        TextView textView = findViewById(R.id.quant);
            quantcafe++;
        textView.setText(String.valueOf(quantcafe));



    }

    public void menos(View view){
        TextView textView = findViewById(R.id.quant);
        if (quantcafe<0){

        }else{
            quantcafe--;
            textView.setText(String.valueOf(quantcafe));
        }


    }

    //Radio buttons
    // Cafe = 1, Cafe com leite = 2, Cappuccino = 3
    // Cafe = 2,00, Cafe com leite = 3,00, Cappuccino = 5,00


    public void clicado(View view){

        boolean checado = ((RadioButton) view).isChecked();
        TextView textView = findViewById(R.id.precounitario);

        switch (view.getId()){

            case R.id.Cafe:
                if (checado)
                    tipocafe = 1;
                    precoact = 2;


            break;

            case R.id.Cafecomleite:
                if (checado)
                    tipocafe = 2;
                    precoact = 3;
                break;

            case R.id.Cappuccino:
                if (checado)
                    tipocafe = 3;
                    precoact = 5;
                break;

        }

        textView.setText(precoact + ",00.");
    }

    public void pedido(View view){
        TextView textView = findViewById(R.id.pedido);
        TextView textView2 = findViewById(R.id.precototal);

        int precototal;
        precototal = quantcafe*precoact;
        textView.setText("Gostaria de " + quantcafe + " cafes, por favor. O valor total sera de R$" + precototal + ",00. Obrigado!");
        textView2.setText("R$ " + precototal + ",00");

    }










}

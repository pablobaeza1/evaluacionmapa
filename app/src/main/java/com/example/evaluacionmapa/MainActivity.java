package com.example.evaluacionmapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner luga;
    Button conti;
    ArrayList<String> valores= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        luga= (Spinner) findViewById(R.id.Lugares);
        conti =(Button) findViewById(R.id.Continuar);

        valores.add("...");
        valores.add("Dubai");
        valores.add("Los Angeles");
        valores.add("Cuba");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valores);
        luga.setAdapter(adaptador);

        conti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (luga.getSelectedItem() == "...") ;
                {
                    Toast.makeText(getApplicationContext(), "Seleccione un lugar", Toast.LENGTH_LONG);
                }


                if(luga.getSelectedItem() == "Dubai") {
                    String lug = luga.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(), activity_imagenes.class);
                    I.putExtra("Slugar", lug);
                    startActivity(I);
                }

                if(luga.getSelectedItem() == "Los Angeles") {
                    String lug = luga.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(), activity_imagenes2.class);
                    I.putExtra("Slugar", lug);
                    startActivity(I);
                }

                if(luga.getSelectedItem() == "Cuba") {
                    String lug = luga.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(), activity_imagenes3.class);
                    I.putExtra("Slugar", lug);
                    startActivity(I);
                }

            }






        });
    }
}

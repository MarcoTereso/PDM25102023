package com.example.carros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String carros[] = new String[]{"BMW","Ferrari","Mercedes","Porche"};
    int imagemCarros[] = new int[]{R.drawable.bmw, R.drawable.ferrari,
            R.drawable.mercedes,R.drawable.porche};
    String modelos[] = new String[]{"M4","F-200","220 Coupé","Carrera 911"};
    TextView txt;
    Spinner sp;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.ctxsms);
        sp = findViewById(R.id.spinner);
        iv = findViewById(R.id.img);

        ArrayAdapter<String> adapter =
 new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,carros);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txt.setText(modelos[position]);
                iv.setImageResource(imagemCarros[position]);
        Toast.makeText(MainActivity.this, "exemplo toast", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
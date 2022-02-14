package es.ua.eps.android_java_logics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//ATRIBUTOS
    TextView texto, textoInicial;
    EditText edicion, texto2;
    Button boton, toast, alien, botonToast;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_ejercicio);

       // texto = (TextView)  findViewById(R.id.texto);
        //edicion = (EditText) findViewById(R.id.edita);
       // boton = (Button)  findViewById(R.id.boton1);
        //toast = (Button) findViewById(R.id.toast);

        textoInicial = (TextView) findViewById(R.id.textoInicial);
        texto2 = (EditText) findViewById(R.id.texto2);
        alien = (Button) findViewById(R.id.botonAlien);
        image = (ImageView) findViewById(R.id.alien);
        botonToast = (Button) findViewById(R.id.botonToast);

/*
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux = edicion.getText().toString();
                texto.setText(aux);
                String auxi = (String) texto.getText();
                texto.setText(auxi);
            }
        });

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EL TOAST ES UNA CLASE DE ANDROID PARA CREAR TEXTOS EMERGENTES CON DURACION DETERMINADA
                Toast.makeText(MainActivity.this, "THIS IS A EXAMPLE", Toast.LENGTH_SHORT).show();
            }
        });*/

        alien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textoInicial.setText((String) texto2.getText().toString());
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux = "Esto no es un botton";
                textoInicial.setText((aux));
            }
        });
                botonToast.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Has pulsado correctamente", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
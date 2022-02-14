package es.ua.eps.android_java_logics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//ATRIBUTOS
    TextView texto;
    EditText edicion;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView)  findViewById(R.id.texto);
        edicion = (EditText) findViewById(R.id.edita);
        boton = (Button)  findViewById(R.id.boton1);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux = edicion.getText().toString();
                texto.setText(aux);
            }
        });
    }
}
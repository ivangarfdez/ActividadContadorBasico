package com.example.ivan.ivangarciabotoncontador;

//Autor: Iván García Fernández

//Imports
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaramos los botones de pulsar, disminuir y borrar.
    private Button pulsar,disminuir,borrar;

    //Añadimos el texto del contador.
    private TextView contadorTextView;

    //Declaramos la variable.
    private int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorTextView = (TextView) findViewById(R.id.contadorTextView);

        pulsar = (Button) findViewById(R.id.pulsarboton);

            //Aquí llamamos al listener y le decimos lo que hace cada botón
        pulsar.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                    //Cuando se pulse que incremente 1

                contador++;
                contadorTextView.setText("Contador: "+contador);

            }
        });

        //Aquí hacemos lo mismo pero tiene que disminuir -1
        disminuir = (Button) findViewById(R.id.disminuirboton);
        disminuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cuando se pulse que decremente 1

                contador--;
                contadorTextView.setText("Contador: "+contador);
            }
        });
        borrar = (Button) findViewById(R.id.borrarboton);
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cuando se pulse que se ponga el contador a 0

                contador=0;
                contadorTextView.setText("Contador: "+contador);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

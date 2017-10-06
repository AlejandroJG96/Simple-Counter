package edu.upc.eseiaat.pma.simplecounter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    private Button BOTONSUMAR, BOTONRESTAR, BOTONACABAR;
    private TextView Numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BOTONSUMAR = (Button) findViewById(R.id.Botonsumar);
        BOTONRESTAR = (Button) findViewById(R.id.Botonrestar);
        BOTONACABAR = (Button) findViewById(R.id.Botonacabar);
        Numero = (TextView) findViewById(R.id.elnumero);


        BOTONSUMAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    BOTONACABAR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String message =
                    String.format(Locale.getDefault(), "Estas segur que vols acabr?");

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Acabar");
            builder.setMessage(message);
            builder.setCancelable(false);
            builder.setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton(R.string.no, null);

            builder.create().show();

        }
    });
    }
}





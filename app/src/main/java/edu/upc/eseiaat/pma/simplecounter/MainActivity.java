package edu.upc.eseiaat.pma.simplecounter;

import android.content.DialogInterface;
import android.support.annotation.StringDef;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BOTONSUMAR = (Button) findViewById(R.id.Botonsumar);
        Button BOTONRESTAR= (Button) findViewById(R.id.Botonrestar);
        Button BOTONACABAR= (Button) findViewById(R.id.Botonacabar);
        final TextView number = (TextView) findViewById(R.id.textView2);
        contador=0;


        BOTONSUMAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                String count = String.format("%s",contador );
                number.setText(count);


            }
        });
        BOTONRESTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contador>0){contador--;}
                else contador=0;
                String count1 = String.format("%s",contador );
                number.setText(count1);

            }
        });

    BOTONACABAR.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Acabar");
            builder.setMessage(R.string.confirmmessage);
            builder.setCancelable(false);
            builder.setPositiveButton(R.string.si, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton(android.R.string.cancel, null);

            builder.create().show();

        }
    });
    }


}





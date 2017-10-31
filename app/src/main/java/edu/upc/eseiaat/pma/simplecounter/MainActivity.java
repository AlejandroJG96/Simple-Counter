package edu.upc.eseiaat.pma.simplecounter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BOTONSUMAR = (Button) findViewById(R.id.Botonsumar);
        Button BOTONRESTAR= (Button) findViewById(R.id.Botonrestar);
        Button BOTONACABAR= (Button) findViewById(R.id.Botonacabar);
        final EditText number = (EditText) findViewById(R.id.editTextNumber);


        BOTONSUMAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero1 = number.getText().toString();
                int num1 = Integer.parseInt(numero1);
                num1++;
                String snum = String.format("%f", num1);
                number.setText(snum);

            }
        });
        BOTONRESTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero2 = number.getText().toString();
                int num = Integer.parseInt(numero2);
                if(num>0){num--;}
                else num=0;
                String snum = String.format("%f", num);
                number.setText(snum);
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





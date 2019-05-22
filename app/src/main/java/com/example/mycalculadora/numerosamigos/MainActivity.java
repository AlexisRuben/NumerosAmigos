package com.example.mycalculadora.numerosamigos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numeroAm = findViewById(R.id.numeroAm);
        final Button btnAmigo = findViewById(R.id.btnAmigo);
        final TextView rsa = findViewById(R.id.rsa);

        btnAmigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = numeroAm.getText().toString();
                int entero = Integer.parseInt(num1);
                int div=0;

                for (int i=1;i <= entero/2;i++){
                    if (entero%i==0)
                        div+=i;
                }
                rsa.setText(""+div);
            }
        });
    }
}

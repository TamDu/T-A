package com.example.tamdu.tamiscoolerthanaaron;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends ActionBarActivity {
    private ProgressDialog progress;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = new ProgressDialog(this);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView txtView = (TextView) findViewById(R.id.textView);
                txtView.setTextSize(25);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int min = 65;
                int max = 80;

                Random r = new Random();


                int i1 = r.nextInt(max - min + 1) + min;
                TextView txtView = (TextView) findViewById(R.id.textView);
                txtView.setTextSize(i1);
            }
        });
    }
}

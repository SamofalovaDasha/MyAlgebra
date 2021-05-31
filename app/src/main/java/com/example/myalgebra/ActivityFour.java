package com.example.myalgebra;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityFour extends AppCompatActivity implements OnClickListener {
    EditText E1;
    EditText E2;
    Button count4;
    TextView Tw4;
    Button clean4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        E1 = (EditText) findViewById(R.id.E1);
        E2 = (EditText) findViewById(R.id.E2);
        count4 = (Button) findViewById(R.id.count4);
        count4.setOnClickListener(this);
        clean4 = (Button) findViewById(R.id.clean4);
        clean4.setOnClickListener(this);
        Tw4 = (TextView) findViewById(R.id.Tw4);

    }

    @Override
    public void onClick(View v) {
        int a = 0;
        int b = 0;
        int x = 0;
        int y = 0;
        x = Integer.parseInt(E1.getText().toString());
        y = Integer.parseInt(E2.getText().toString());


        switch (v.getId()) {
            case R.id.count4:
                if ( x == y){
                    Tw4.setText(Integer.toString(x));
                } else {
                    if (x > y) {
                        a = x;
                        b = y;
                    } else {
                        a = y;
                        b = x;
                    }
                    while (a != b) {
                        if (a > b) {
                            a = a - b;
                        } else {
                            b = b - a;
                        }
                    }
                    Tw4.setText(Integer.toString(a));
                }
                break;

            case R.id.clean4:
                E1.setText("");
                E2.setText("");
                Tw4.setText("");
                break;
            default:
                break;
        }

    }

}

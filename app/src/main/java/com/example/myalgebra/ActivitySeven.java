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

public class ActivitySeven extends AppCompatActivity implements OnClickListener {
    EditText E71;
    EditText E72;
    Button count7;
    TextView Tw7;
    Button clean7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);

        E71 = (EditText) findViewById(R.id.E71);
        E72 = (EditText) findViewById(R.id.E72);
        count7 = (Button) findViewById(R.id.count7);
        count7.setOnClickListener(this);
        clean7 = (Button) findViewById(R.id.clean7);
        clean7.setOnClickListener(this);
        Tw7 = (TextView) findViewById(R.id.Tw7);

    }

    @Override
    public void onClick(View v) {
        int a = 0;
        int b = 0;
        int x = 0;
        int y = 0;
        int c = 0;
        x = Integer.parseInt(E71.getText().toString());
        y = Integer.parseInt(E72.getText().toString());


        switch (v.getId()) {
            case R.id.count7:
                 c = x*y;
                if ( x == y){
                    Tw7.setText(Integer.toString(x));
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
                    a = c / a;
                    Tw7.setText(Integer.toString(a));
                }
                break;

            case R.id.clean7:
                E71.setText("");
                E72.setText("");
                Tw7.setText("");
                break;
            default:
                break;
        }

    }

}

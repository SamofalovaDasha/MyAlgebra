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

public class ActivityTwo extends AppCompatActivity implements OnClickListener {
    EditText Ek;
    EditText Eb;
    Button count2;
    TextView Tw2;
    Button clean2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Ek = (EditText) findViewById(R.id.Ek);
        Eb = (EditText) findViewById(R.id.Eb);
        count2 = (Button) findViewById(R.id.count2);
        count2.setOnClickListener(this);
        clean2 = (Button) findViewById(R.id.clean2);
        clean2.setOnClickListener(this);
        Tw2 = (TextView) findViewById(R.id.Tw2);

    }

    @Override
    public void onClick(View v) {
        float k = 1;
        float b = 0;
        float restwo = 0;
        k = Float.parseFloat(Ek.getText().toString());
        b = Float.parseFloat(Eb.getText().toString());


        switch (v.getId()) {
            case R.id.count2:
                if (k == 0) {
                    Tw2.setText("Ошибка!");
                    Tw2.setTextColor(Color.RED);
                } else {
                    restwo = -1 * (b / k);
                    Tw2.setText("x" + " " + "=" + " " + Float.toString(restwo));
                }
                break;
            case R.id.clean2:
                Ek.setText("");
                Eb.setText("");
                Tw2.setText("");
                Tw2.setTextColor(Color.BLACK);
                break;
            default:
                break;
        }

    }

}


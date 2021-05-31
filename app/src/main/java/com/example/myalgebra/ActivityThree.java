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

public class ActivityThree extends AppCompatActivity implements OnClickListener {
    EditText Ea;
    EditText Eb3;
    EditText Ec;
    Button count3;
    TextView Tw31;
    TextView Tw32;
    Button clean3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        Ea = (EditText) findViewById(R.id.Ea);
        Eb3 = (EditText) findViewById(R.id.Eb3);
        Ec = (EditText) findViewById(R.id.Ec);
        count3 = (Button) findViewById(R.id.count3);
        count3.setOnClickListener(this);
        clean3 = (Button) findViewById(R.id.clean3);
        clean3.setOnClickListener(this);
        Tw31 = (TextView) findViewById(R.id.Tw31);
        Tw32 = (TextView) findViewById(R.id.Tw32);

    }

    @Override
    public void onClick(View v) {
        double a = 1;
        double b = 1;
        double c = 0;
        double resthree = 0;
        double resthree1 = 0;
        double resthree2 = 0;
        double diskrim = 0;
        a = Double.parseDouble(Ea.getText().toString());
        b = Double.parseDouble(Eb3.getText().toString());
        c = Double.parseDouble(Ec.getText().toString());


        switch (v.getId()) {
            case R.id.count3:
                diskrim = b*b - 4* a*c;
                if (diskrim < 0) {
                    Tw31.setText("Решений нет");
                    Tw31.setTextColor(Color.RED);
                } else {
                    if (diskrim == 0) {
                        resthree = (-1 * b) / (2 * a);
                        Tw31.setText("x" + " " + "=" + " " + Double.toString(resthree));
                    } else {
                            diskrim = Math.sqrt(diskrim);
                            resthree1 = (-1 * b + diskrim) / (2 * a);
                            resthree2 = (-1 * b - diskrim) / (2 * a);
                            Tw31.setText("x1" + " " + "=" + " " + Double.toString(resthree1));
                            Tw32.setText("x2" + " " + "=" + " " + Double.toString(resthree2));
                    }
                }
                break;
            case R.id.clean3:
                Ea.setText("");
                Eb3.setText("");
                Ec.setText("");
                Tw31.setText("");
                Tw31.setTextColor(Color.BLACK);
                Tw32.setText("");
                break;
            default:
                break;
        }

    }

}
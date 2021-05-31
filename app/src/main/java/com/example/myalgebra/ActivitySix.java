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

public class ActivitySix<Ec1> extends AppCompatActivity implements OnClickListener {
    EditText Ea1;
    EditText Ea2;
    EditText Eb1;
    EditText Eb2;
    EditText Ec1;
    EditText Ec2;
    Button count6;
    TextView Tw61;
    TextView Tw62;
    Button clean6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        Ea1 = (EditText) findViewById(R.id.Ea1);
        Ea2 = (EditText) findViewById(R.id.Ea2);
        Eb1 = (EditText) findViewById(R.id.Eb1);
        Eb2 = (EditText) findViewById(R.id.Eb2);
        Ec1 = (EditText) findViewById(R.id.Ec1);
        Ec2 = (EditText) findViewById(R.id.Ec2);
        count6 = (Button) findViewById(R.id.count6);
        count6.setOnClickListener(this);
        clean6 = (Button) findViewById(R.id.clean6);
        clean6.setOnClickListener(this);
        Tw61 = (TextView) findViewById(R.id.Tw61);
        Tw62 = (TextView) findViewById(R.id.Tw62);

    }

    @Override
    public void onClick(View v) {
        double a1, a2, b1, b2, c1, c2;
        double x, y;
        double bres, cres;
        a1 = Double.parseDouble(Ea1.getText().toString());
        a2 = Double.parseDouble(Ea2.getText().toString());
        b1 = Double.parseDouble(Eb1.getText().toString());
        b2 = Double.parseDouble(Eb2.getText().toString());
        c1 = Double.parseDouble(Ec1.getText().toString());
        c2 = Double.parseDouble(Ec2.getText().toString());


        switch (v.getId()) {
            case R.id.count6:
                if ((a2*b1- a1*b2) == 0) {
                    Tw61.setText("Ошибка!");
                    Tw61.setTextColor(Color.RED);
                } else {
                    bres = (a2*b1)- (a1*b2);
                    cres = (a2*c1) - (a1*c2);
                    y = cres / bres;
                    x = (c1 - b1*y)/a1;
                    Tw61.setText("x" + " " + "=" + " " + Double.toString(x));
                    Tw62.setText("y" + " " + "=" + " " + Double.toString(y));
                }
                break;
            case R.id.clean6:
                Ea1.setText("");
                Ea2.setText("");
                Eb1.setText("");
                Eb2.setText("");
                Ec1.setText("");
                Ec2.setText("");
                Tw61.setText("");
                Tw62.setText("");
                Tw61.setTextColor(Color.BLACK);
                break;
            default:
                break;
        }

    }

}

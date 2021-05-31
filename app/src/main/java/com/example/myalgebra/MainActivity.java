package com.example.myalgebra;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button btnActTwo;
    Button btnActThree;
    Button btnActFour;
    Button btnActSix;
    Button btnActSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);

        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);

        btnActFour = (Button) findViewById(R.id.btnActFour);
        btnActFour.setOnClickListener(this);


        btnActSix = (Button) findViewById(R.id.btnActSix);
        btnActSix.setOnClickListener(this);

        btnActSeven = (Button) findViewById(R.id.btnActSeven);
        btnActSeven.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            case R.id.btnActThree:
                intent = new Intent(this, ActivityThree.class);
                startActivity(intent);
                break;
            case R.id.btnActFour:
                intent = new Intent(this, ActivityFour.class);
                startActivity(intent);
                break;
            case R.id.btnActSix:
                intent = new Intent(this, ActivitySix.class);
                startActivity(intent);
                break;
            case R.id.btnActSeven:
                intent = new Intent(this, ActivitySeven.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }

}

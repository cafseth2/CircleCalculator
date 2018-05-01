package com.example.caafs.circlecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView results;
    private Button buttoncalculate;
    private EditText radius;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        results = (TextView) findViewById(R.id.results);
        buttoncalculate = (Button)findViewById(R.id.calcbutton);
        radius = (EditText)findViewById(R.id.radius);
        buttoncalculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        double rad = Double.parseDouble(radius.getText().toString());
        CircleClass circleOne = new CircleClass(rad);
        results.setText("Area: " + circleOne.getArea() + "\nCircumference: " + circleOne.getCircumference());
    }
}

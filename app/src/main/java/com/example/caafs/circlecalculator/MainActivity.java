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
    private Button squarecalculate;
    private Button tricalculate;
    private EditText sidelength;
    private EditText radius;
    private EditText triside;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        results = (TextView) findViewById(R.id.results);
        buttoncalculate = (Button)findViewById(R.id.calcbutton);
        squarecalculate = (Button)findViewById(R.id.squarebutton);
        tricalculate = (Button)findViewById(R.id.trianglebutton);
        radius = (EditText)findViewById(R.id.radius);
        sidelength = (EditText)findViewById(R.id.sidelength);
        triside = (EditText)findViewById(R.id.triangleside);
        buttoncalculate.setOnClickListener(this);
        squarecalculate.setOnClickListener(this);
        tricalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.calcbutton) {
            double rad = Double.parseDouble(radius.getText().toString());
            CircleClass circleOne = new CircleClass(rad);
            results.setText("Area: " + circleOne.getArea() + "\nCircumference: " + circleOne.getCircumference() +
                    "\nSpherical Volume: " + circleOne.getVolume() + "\nSpherical Surface Area: " + circleOne.getSurfaceArea());
        }
        if (v.getId() == R.id.squarebutton) {
            double side = Double.parseDouble(sidelength.getText().toString());
            Square squareOne = new Square(side);
            results.setText("Area: " + squareOne.getArea() + "\nPerimeter: " + squareOne.getPerimeter() + "\nCubical Volume: "
            + squareOne.getVolume() + "\nCubical Surface Area: " + squareOne.getSurfaceArea());
        }
        if (v.getId() == R.id.trianglebutton) {
            double tSide = Double.parseDouble(triside.getText().toString());
            Triangle triangleOne = new Triangle(tSide);
            results.setText("Area: " + triangleOne.getArea() + "\nPerimeter: " + triangleOne.getPerimeter() + "\nTetrahedral Volume: "
                    + triangleOne.getVolume() + "\nTetrahedral Surface Area: " + triangleOne.getSurfaceArea());
        }
    }
}

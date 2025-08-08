package com.dreamtomagic.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText display;
    private double firstValue = 0;
    private String operator = "";
    private boolean isNewOp = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.editTextNumber);
    }

    public void numberClick(View view) {
        if (isNewOp) display.setText("");
        isNewOp = false;
        Button button = (Button) view;
        String content = display.getText().toString();
        content += button.getText().toString();
        display.setText(content);
    }

    public void operatorClick(View view) {
        Button button = (Button) view;
        operator = button.getText().toString();
        firstValue = Double.parseDouble(display.getText().toString());
        isNewOp = true;
    }

    public void equalClick(View view) {
        double secondValue = Double.parseDouble(display.getText().toString());
        double result = 0;
        switch (operator) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                if(secondValue != 0) result = firstValue / secondValue;
                else display.setText("错误");
                return;
        }
        display.setText(String.valueOf(result));
        isNewOp = true;
    }

    public void clearClick(View view) {
        display.setText("");
        firstValue = 0;
        operator = "";
        isNewOp = true;
    }
}
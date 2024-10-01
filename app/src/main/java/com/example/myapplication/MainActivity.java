package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private Button updateButton;
    private TextView displayText;
    private Button colorButton;
    private Button sizeButton;
    private boolean isColorChanged = false;
    private boolean isSizeChanged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize widgets
        inputText = findViewById(R.id.inputText);
        updateButton = findViewById(R.id.updateButton);
        displayText = findViewById(R.id.displayText);
        colorButton = findViewById(R.id.colorButton);
        sizeButton = findViewById(R.id.sizeButton);

        // Set button click listener to update text
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputText.getText().toString();
                displayText.setText(text);
            }
        });

        // Set button click listener to change color
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isColorChanged) {
                    displayText.setTextColor(Color.RED);
                } else {
                    displayText.setTextColor(Color.BLACK);
                }
                isColorChanged = !isColorChanged;
            }
        });

        // Set button click listener to change size
        sizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isSizeChanged) {
                    displayText.setTextSize(24);
                } else {
                    displayText.setTextSize(16);
                }
                isSizeChanged = !isSizeChanged;
            }
        });
    }
}

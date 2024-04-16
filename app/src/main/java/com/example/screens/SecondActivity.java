package com.example.screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    // Variables
    private Button buttonToMainActivity;
    private TextView vehicleText;
    private TextView colorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        buttonToMainActivity = findViewById(R.id.goToMainActivity); // Finds the go to main button
        vehicleText = findViewById(R.id.vehicleText); // Finds the vehicle-TextView
        colorText = findViewById(R.id.colorText); // Finds the color-TextView

        // Gets the intents
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String vehicle = extras.getString("vehicle");
            String color = extras.getString("color");
            vehicleText.setText(vehicle); // Sets the text to the vehicle inputted in MainActivity
            colorText.setText(color); // Sets the text to the color inputted in MainActivity
        }

        // Sets a OnClickListener for the back to main activity button
        buttonToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
    }
}
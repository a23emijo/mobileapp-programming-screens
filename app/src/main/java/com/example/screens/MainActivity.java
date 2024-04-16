package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Variables
    private Button buttonToSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonToSecondActivity = findViewById(R.id.goToSecondActivity); // Finds the to second activity button

        // Sets a OnClickListener for the to second activity button
        buttonToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Sets the intents
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("vehicle", "Car"); // Sets the vehicle type
                intent.putExtra("color", "Red"); // Sets the color of the vehicle to red
                startActivity(intent); // Starts the activity with the intents
            }
        });
    }
}

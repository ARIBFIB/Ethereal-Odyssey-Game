package com.example.etherealodysseygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startGame_button);
        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, working_game_01.class);
            startActivity(intent);
            finish();
        });
    }
}

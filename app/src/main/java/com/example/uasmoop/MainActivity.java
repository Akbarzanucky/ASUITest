package com.example.uasmoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TheGame game = new TheGame();
        Button Button1 = findViewById(R.id.warBtn);
        final TextView winner = findViewById(R.id.textWinner);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sim = game.linkStart();
                if (sim == 1){
                    winner.setText("Player 1 Wins");
                }
                else {
                    winner.setText("Player 2 Wins");
                }

            }
        });
    }
}
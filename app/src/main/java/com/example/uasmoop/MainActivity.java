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
        final TextView winner2 = findViewById(R.id.textWinner2);
        final TextView result = findViewById(R.id.textResult);
        final TextView result2 = findViewById(R.id.textResult2);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Winner is");
                result2.setText("Winner is");
                int sim = game.linkStart();
                int sim2 = game.linkStart2();

                if (sim == 1){
                    winner.setText("Player 1");
                }
                else {
                    winner.setText("Player 2");
                }

                if (sim2 == 1){
                    winner2.setText("Player 1");
                }
                else {
                    winner2.setText("Player 2");
                }



            }
        });
    }
}
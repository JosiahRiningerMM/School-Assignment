package com.rininger.numbersgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calculateButton;
    EditText ageEditText;
    TextView scoreTextView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupView();
    }

    private void setupView() {
        calculateButton = findViewById(R.id.btn_second);
        ageEditText = findViewById(R.id.editText);
        scoreTextView = findViewById(R.id.tv_score);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                generateBPM(Integer.parseInt(ageEditText.getText().toString()));
            }
        });
    }

    private void generateBPM(int num) {
        int maxHR = 220 - num;
        String txt = Integer.toString((int)(maxHR * 0.5))
                + " - " + Integer.toString((int)(maxHR * 0.85)) + " BPM";
        scoreTextView.setText(txt);
    }
}

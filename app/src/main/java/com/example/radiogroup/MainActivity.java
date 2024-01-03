package com.example.radiogroup;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupTheme;
    private Button button;
    private RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupTheme = findViewById(R.id.radioGroupTheme);
        button = findViewById(R.id.button);
        mainLayout = findViewById(R.id.mainLayout); // Cambia a R.id.mainLayout

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroupTheme.getCheckedRadioButtonId();

                if (selectedId == R.id.radioButtonOscuro) {
                    mainLayout.setBackgroundColor(Color.BLACK);
                } else if (selectedId == R.id.radioButtonClaro) {
                    mainLayout.setBackgroundColor(Color.WHITE);
                }
            }
        });
    }
}

package com.example.calculeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.result);
        findViewById(R.id.button_red).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity main1 = new MainActivity();
                finishAffinity();

            }
        });

        String text = getIntent().getStringExtra("key");
        textView.setText(text);


    }
}
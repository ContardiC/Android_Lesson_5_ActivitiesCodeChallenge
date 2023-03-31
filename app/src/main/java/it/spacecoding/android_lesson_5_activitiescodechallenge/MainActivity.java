package it.spacecoding.android_lesson_5_activitiescodechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_text_one;
    Button button_text_two;
    Button button_text_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_text_one = (Button) findViewById(R.id.button_text_one);
        button_text_two = (Button) findViewById(R.id.button_text_two);
        button_text_three = (Button) findViewById(R.id.button_text_three);

        ClickListener listener = new ClickListener();
        button_text_one.setOnClickListener(listener);
        button_text_two.setOnClickListener(listener);
        button_text_three.setOnClickListener(listener);
    }


}
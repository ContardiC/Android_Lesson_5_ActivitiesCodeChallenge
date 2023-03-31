package it.spacecoding.android_lesson_5_activitiescodechallenge;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class ClickListener implements View.OnClickListener{

    private final static String LOG_TAG = ClickListener.class.getSimpleName();

    private File file;
    private Vector<String> vector = new Vector<String>();


    public ClickListener(){
        vector.add("Messaggio 1");
        vector.add("Messaggio 2");
        vector.add("Messaggio 3");

    }
    // TODO: aggiungere il passaggio delle frasi alla seconda Activity
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_text_one:
                Log.d(LOG_TAG, vector.elementAt(0));
                break;
            case R.id.button_text_two:
                Log.d(LOG_TAG, vector.elementAt(1));
                break;
            case R.id.button_text_three:
                Log.d(LOG_TAG, vector.elementAt(2));
                break;
        }

    }
}

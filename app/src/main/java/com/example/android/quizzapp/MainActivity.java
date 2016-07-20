package com.example.android.quizzapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Below all the methods that recover and evaluate the answer to each question


    private boolean checkQuestion1(View view) {
        // create a variable that store the results:
        int result = 0;

        // Is the button now checked?
        CheckBox box1 = (CheckBox) findViewById(R.id.);

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q1_a1:
                if (checked)
                    result = result-1;
            case R.id.q1_a2:
                if (checked)
                    result = result+1;
            case R.id.q1_a3:
                if (checked)
                    result = result+1;


    }

    /**
     * Recovers the values from the Radio Button and grades de response
     * @param view
     */

    private  boolean checkQuestion2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q1_a1:
                if (checked)
                    return false;
            case R.id.q1_a2:
                if (checked)
                    return true;
            case R.id.q1_a3:
                if (checked)
                    return false;
        }
    }
}

package com.example.android.sciencequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public int calculateScore(View view) {

        //At the beginning, final score is 0
        int finalScore = 0;

        //Question 1: get input from EditText and update final score
        EditText question1 = (EditText) findViewById(R.id.edit_text_q1);
        String q1Answer = question1.getText().toString();
        int q1Value = Integer.parseInt(q1Answer);
        if (q1Value == 22) {
            finalScore += 1;
        }

        //Question 2: If the first RadioButton is checked, update final score. If not, don't update final score
        RadioButton radioButtonQ2_1 = (RadioButton) findViewById(R.id.radio_button_q2_1);
        RadioButton radioButtonQ2_2 = (RadioButton) findViewById(R.id.radio_button_q2_2);

        if (radioButtonQ2_1.isChecked()) {
            finalScore += 1;
        }

        //Question 3: if the answer is correct, update final score
        CheckBox chechBoxDoubleStranded = (CheckBox) findViewById(R.id.checkbox_q3_1);
        CheckBox checkBoxSingleStranded = (CheckBox) findViewById(R.id.checkbox_q3_2);
        CheckBox checkBoxBuildingBlocks = (CheckBox) findViewById(R.id.checkbox_q3_3);
        CheckBox checkBoxCharge = (CheckBox) findViewById(R.id.checkbox_q3_4);

        if (chechBoxDoubleStranded.isChecked()) {
            finalScore += 1;
        }
        if (!checkBoxSingleStranded.isChecked()) {
            finalScore += 1;
        }
        if (!checkBoxBuildingBlocks.isChecked()) {
            finalScore += 1;
        }
        if (checkBoxCharge.isChecked()) {
            finalScore += 1;
        }

        //Question 4: If ma is checked, update final score
        RadioButton radioButtonMA = (RadioButton) findViewById(R.id.radio_button_q4_1);
        RadioButton radioButtonMG = (RadioButton) findViewById(R.id.radio_button_q4_2);

        if (radioButtonMA.isChecked()) {
            finalScore += 1;
        }

        //Question 5:
        EditText editTextAge = (EditText) findViewById(R.id.edit_text_q5);
        String ageString = editTextAge.getText().toString();
        int age = Integer.parseInt(ageString);

        if (age == 28) {
            finalScore += 1;
        }

        Toast toast = Toast.makeText(getApplicationContext(), "Your final score is " + finalScore, Toast.LENGTH_SHORT);
        toast.show();

    return finalScore;
    }


}

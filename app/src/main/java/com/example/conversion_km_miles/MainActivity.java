package com.example.conversion_km_miles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText km, mile;
    Button convert1, convert2;
    Double result = null;
//Double operand1 = null;
//Double operand2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        km = findViewById(R.id.editTextNumber);
        mile = findViewById(R.id.editTextNumber2);
        convert1 = findViewById(R.id.button);
        convert2 = findViewById(R.id.button2);
        convert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String miles = mile.getText().toString();
                result= 0.621 * Double.valueOf(miles);
                km.setText(result.toString());
//                performOperation(kilometer,miles);




            }
        });
        convert2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kilometer = km.getText().toString();
                result = Double.valueOf(kilometer)/0.621;
                mile.setText(result.toString());
            }
        }));


    }
}

//    private void performOperation(String kilometer, String miles) {
//        operand1 = Double.valueOf(kilometer);
//        operand2 = Double.valueOf(miles);
//        if(operand2==null)
//        {
//            operand2=operand1*0.621;
//            mile.setText(operand2.toString());
//        }
//        else if (operand1==null)
//        {
//            operand1=operand2/0.621;
//            km.setText(operand1.toString());
//        }
//
//    }
//}
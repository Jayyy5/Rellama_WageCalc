package com.example.wagetrial;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wagetrial.R;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.salary);
        ed2 = findViewById(R.id.tax);
        ed3 = findViewById(R.id.netsalary);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }


        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double salary = Double.parseDouble(ed1.getText().toString());
                double tax;
                    if(salary > 50000)
                    {
                    tax =  salary * 10/10029;
                    }
                    else if(salary > 30000) {
                    tax =  salary * 5/100;
                    }
                    else {
                    tax = 0;
                    }

                ed2.setText(String.valueOf(tax));
                double netsal = salary - tax;
                ed3.setText(String.valueOf(netsal));
            }
        });

    }


    public void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
    }


}
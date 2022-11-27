package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.Toast;



public class Link extends AppCompatActivity implements View.OnClickListener {



    // creating three buttons

    // by the of btn1, btn2,btn3

    Button btn1, btn2,btn3 ;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_link);
        Bundle extras = getIntent().getExtras();



        // connecting buttons with the

        // layout using findViewById()

        btn1= findViewById(R.id.button);

        btn2= findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);





        // apply setOnClickListener over buttons

        btn1.setOnClickListener(this);

        btn2.setOnClickListener(this);

       btn3.setOnClickListener(this);





    }



    // common onClick() for all buttons

    @Override

    public void onClick(View v) {



        switch (v.getId()){



            // cases applied over different buttons

            case R.id.button:



                // Toast message appears when button pressed

                Toast.makeText(this, "Choose easy/difficult", Toast.LENGTH_SHORT).show();
                break;



            case R.id.button2:



                Toast.makeText(this, "Easy pressed", Toast.LENGTH_SHORT).show();
                Intent intents ;
                intents = new Intent(getApplicationContext(), Firstactivity.class);
                startActivity(intents);

                break;

            case R.id.button3:

                Toast.makeText(this, "Difficult pressed", Toast.LENGTH_SHORT).show();
                Intent i ;
                i = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(i);

                break;








        }

    }
}

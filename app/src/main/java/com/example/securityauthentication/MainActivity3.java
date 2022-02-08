package com.example.securityauthentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button button1;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button1 = findViewById(R.id.button3);
        editText1 = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPassword);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText1.getText().length() == 0 && editText2.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "User Name Password Cannot be empty", Toast.LENGTH_SHORT).show();
                } else if (editText1.getText().length() == 0){
                    Toast.makeText(getApplicationContext(), "User Name Cannot be empty", Toast.LENGTH_SHORT).show();
            }
                  else if (editText2.getText().length() == 0) {
                    Toast.makeText(getApplicationContext(), "Password Cannot be empty", Toast.LENGTH_SHORT).show();
                }
                  else {
                    Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                    startActivity(intent);
                }
            }

        });
    }
}
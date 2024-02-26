package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button btn1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.email);
        et2 = (EditText) findViewById(R.id.password);
        btn1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.t1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e = et1.getText().toString();
                String email="admin@admin.com";
                String pass="123456";
                String p = et2.getText().toString();
                if(e.equals(email) && p.equals(pass)){
                    Toast.makeText(getApplicationContext(),"Successful Login",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,Dashboard.class));
                }
                else{
                    Toast.makeText(getApplicationContext(),"UnSuccessful",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,MainActivity.class));
                }
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ForgetActivity.class));
            }
        });
    }
}
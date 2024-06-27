package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddRecipe extends AppCompatActivity {
    EditText t1,t2,t3;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_recipe);
        t1=(EditText) findViewById(R.id.rname);
        t2=(EditText) findViewById(R.id.des);
        t3=(EditText) findViewById(R.id.prepby);
        b1=(AppCompatButton) findViewById(R.id.subbtn);
        b2=(AppCompatButton) findViewById(R.id.menubtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getTitle = t1.getText().toString();
                String getDes = t2.getText().toString();
                String getPrepBy = t3.getText().toString();
                Toast.makeText(getApplicationContext(),getTitle+" " +getDes+" " +getPrepBy,Toast.LENGTH_LONG).show();

            }
        });
    }
}
package com.example.android.pally;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlphabethActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabeth);
    }
    public void clickAlphabeth(View view){
     Intent alpha = new Intent(this, AlphabethActivity.class);
     startActivity(alpha);
    }
    public void clickNumber (View view){

    }
    public void clickColors (View view){

    }
    public void clickPhrases(View view){

    }
    public void clickThings (View view){

    }
}

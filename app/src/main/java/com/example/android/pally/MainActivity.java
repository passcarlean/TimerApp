package com.example.android.pally;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the activity of the content to use activity.xml in the layout
        setContentView(R.layout.activity_main);
//
//        //Creating an interface constructor
//        NumberClickListener clickListener = new NumberClickListener();

        //To find view that shows the numbers category
        TextView num =(TextView)findViewById(R.id.num);

        //set a clicklistener on the view
        num.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create a toast
                Toast.makeText(view.getContext(),
                        "Open the list of numbers available", Toast.LENGTH_SHORT).show();
                //create a new intent to open the numbersActivity
                Intent numIntent = new Intent(MainActivity.this, Number.class);
                //start a new activity
                startActivity(numIntent);
            }
        });
        //To find view that shows the numbers category
        TextView alpha =(TextView)findViewById(R.id.alpha);

        //set a clicklistener on the view
        alpha.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create a toast
                Toast.makeText(view.getContext(),
                        "Open the list of alphabeths available", Toast.LENGTH_SHORT).show();
                //create a new intent to open the alphabethsActivity
                Intent AlphabethIntent = new Intent(MainActivity.this, AlphabethActivity.class);
                //start a new activity
                startActivity(AlphabethIntent);
            }
        });
        //To find view that shows the numbers category
        final TextView color =(TextView)findViewById(R.id.colors);

        //set a clicklistener on the view
        color.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create a toast
                Toast.makeText(view.getContext(),
                        "Open the list of colors available", Toast.LENGTH_SHORT).show();
                //create a new intent to open the colorsActivity
                Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
                //start a new activity
                startActivity(colorsIntent);
            }
        });
        //To find view that shows the numbers category
        TextView phrase =(TextView)findViewById(R.id.phrase);

        //set a clicklistener on the view
        phrase.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create a toast
                Toast.makeText(view.getContext(),
                        "Open the list of phrases available", Toast.LENGTH_SHORT).show();
                //create a new intent to open the phrasesActivity
                Intent phraseIntent = new Intent(MainActivity.this, Phrases.class);
                //start a new activity
                startActivity(phraseIntent);
            }
        });
        //To find view that shows the numbers category
        TextView things =(TextView)findViewById(R.id.things);

        //set a clicklistener on the view
       things.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create a toast
                Toast.makeText(view.getContext(),
                        "Open the list of Things available", Toast.LENGTH_SHORT).show();
                //create a new intent to open the thingsActivity
                Intent thingsIntent = new Intent(MainActivity.this,Things.class);
                //start a new activity
                startActivity(thingsIntent);
            }
        });
    }


}

package com.example.android.pally;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //create an array of words using the string datatype
       ArrayList<String> words = new ArrayList<String>();
       words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("twelve");
        words.add("thirteen");
        words.add("fourteen");
        words.add("fifteen");
        words.add("sixteen");
        words.add("seventeen");
        words.add("eighteen");
        words.add("nineteen");
        words.add("twenty");

        ArrayAdapter<String>itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);
        ListView listView = (ListView)findViewById(R.id.rootNum);
        listView.setAdapter(itemsAdapter);

//        LinearLayout rootNum = (LinearLayout)findViewById(R.id.rootNum);
//        int index =0;
//        while(index<words.size()){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(0));
//            rootNum.addView(wordView);
//
//            index++;
//            Log.v("Numbers", "Index:" + index + "Value:" + words.get(index));
//        }
//
//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(0));
//        rootNum.addView(wordView);


//        Log.v("Numbers", "Words at index 0:" + words.get(0));
//        Log.v("Numbers", "Words at index 1:" + words.get(1));
//        Log.v("Numbers", "Words at index 2:" + words.get(2));
//        Log.v("Numbers", "Words at index 3:" + words.get(3));
//        Log.v("Numbers", "Words at index 4:" + words.get(4));
    }
}

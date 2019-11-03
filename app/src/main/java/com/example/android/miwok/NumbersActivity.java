package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    TextView numberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

      //  LinearLayout MyView = (LinearLayout) findViewById(R.id.root);


        ArrayList<Word> nummer = new ArrayList<Word>();

        nummer.add(new Word("one","ek",R.drawable.number_one));
        nummer.add(new Word("two","don",R.drawable.number_two));
        nummer.add(new Word("three","teen",R.drawable.number_three));
        nummer.add(new Word("four","chaar",R.drawable.number_four));
        nummer.add(new Word("five","paach",R.drawable.number_five));
        nummer.add(new Word("six","sahaa",R.drawable.number_six));



        WordAdapater itemsAdapter = new WordAdapater(this, nummer);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }

}

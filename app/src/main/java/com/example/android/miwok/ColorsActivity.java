package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    TextView numberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //  LinearLayout MyView = (LinearLayout) findViewById(R.id.root);


        ArrayList<Word> nummer = new ArrayList<Word>();

        nummer.add(new Word("yellow","piwala",R.drawable.color_mustard_yellow));
        nummer.add(new Word("red","laal",R.drawable.color_red));
        nummer.add(new Word("green","hirawaa",R.drawable.color_green));
        nummer.add(new Word("black","kaala",R.drawable.color_black));




        WordAdapater itemsAdapter = new WordAdapater(this, nummer);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }

}

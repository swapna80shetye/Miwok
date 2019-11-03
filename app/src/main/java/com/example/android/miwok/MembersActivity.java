package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MembersActivity extends AppCompatActivity {
    TextView numberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //  LinearLayout MyView = (LinearLayout) findViewById(R.id.root);


        ArrayList<Word> nummer = new ArrayList<Word>();

        nummer.add(new Word("mom","aai",R.drawable.family_mother));
        nummer.add(new Word("dad","baba",R.drawable.family_father));
        nummer.add(new Word("sister","didi",R.drawable.family_older_sister));
        nummer.add(new Word("brother","dada",R.drawable.family_older_brother));
        nummer.add(new Word("grandmother","aaji",R.drawable.family_grandmother));
        nummer.add(new Word("grandfather","aajoba",R.drawable.family_grandfather));



        WordAdapater itemsAdapter = new WordAdapater(this, nummer);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }

}

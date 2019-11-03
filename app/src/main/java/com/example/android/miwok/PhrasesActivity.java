package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    TextView numberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //  LinearLayout MyView = (LinearLayout) findViewById(R.id.root);


        ArrayList<Word> nummer = new ArrayList<Word>();

        nummer.add(new Word("hello","namaskar"));
        nummer.add(new Word("thank you","dhanyawad"));
        nummer.add(new Word("how are you?","kase ahat?"));
        nummer.add(new Word("i'm fine","mi bari ahe"));



        WordAdapater itemsAdapter = new WordAdapater(this, nummer);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }

}

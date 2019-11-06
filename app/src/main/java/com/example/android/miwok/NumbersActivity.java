package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    TextView numberText;

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //  LinearLayout MyView = (LinearLayout) findViewById(R.id.root);


        final ArrayList<Word> nummer = new ArrayList<Word>();

        nummer.add(new Word("one", "ek", R.drawable.number_one,R.raw.number_one));
        nummer.add(new Word("two", "don", R.drawable.number_two,R.raw.number_two));
        nummer.add(new Word("three", "teen", R.drawable.number_three,R.raw.number_three));
        nummer.add(new Word("four", "chaar", R.drawable.number_four,R.raw.number_four));
        nummer.add(new Word("five", "paach", R.drawable.number_five,R.raw.number_five));
        nummer.add(new Word("six", "sahaa", R.drawable.number_six,R.raw.number_six));


        WordAdapater itemsAdapter = new WordAdapater(this, nummer);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               Word word=nummer.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });


    }

}

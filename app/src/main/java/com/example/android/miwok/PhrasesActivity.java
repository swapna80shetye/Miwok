package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    TextView numberText;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //  LinearLayout MyView = (LinearLayout) findViewById(R.id.root);


       final ArrayList<Word> nummer = new ArrayList<Word>();

        nummer.add(new Word("hello","namaskar", R.drawable.number_one, R.raw.phrase_how_are_you_feeling));
        nummer.add(new Word("thank you","dhanyawad", R.drawable.number_one, R.raw.phrase_yes_im_coming));
        nummer.add(new Word("how are you?","kase ahat?", R.drawable.number_one, R.raw.number_one));
        nummer.add(new Word("i'm fine","mi bari ahe", R.drawable.number_one, R.raw.number_one));



        WordAdapater itemsAdapter = new WordAdapater(this, nummer);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        //the following lines of code calls the setOnClickListener on the list view and it in turn calls the onItemClick
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word=nummer.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });

    }

}

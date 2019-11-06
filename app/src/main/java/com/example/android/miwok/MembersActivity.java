package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MembersActivity extends AppCompatActivity {
    TextView numberText;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //  LinearLayout MyView = (LinearLayout) findViewById(R.id.root);


       final ArrayList<Word> nummer = new ArrayList<Word>();

        nummer.add(new Word("mom","aai",R.drawable.family_mother,R.raw.family_mother));
        nummer.add(new Word("dad","baba",R.drawable.family_father,R.raw.family_father));
        nummer.add(new Word("sister","didi",R.drawable.family_older_sister,R.raw.family_older_sister));
        nummer.add(new Word("brother","dada",R.drawable.family_older_brother,R.raw.family_older_brother));
        nummer.add(new Word("grandmother","aaji",R.drawable.family_grandmother,R.raw.family_grandmother));
        nummer.add(new Word("grandfather","aajoba",R.drawable.family_grandfather,R.raw.family_grandfather));



        WordAdapater itemsAdapter = new WordAdapater(this, nummer);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word=nummer.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(MembersActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });

    }

}

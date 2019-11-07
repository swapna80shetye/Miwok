package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    TextView numberText;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //  LinearLayout MyView = (LinearLayout) findViewById(R.id.root);


        final ArrayList<Word> nummer = new ArrayList<Word>();

        nummer.add(new Word("yellow", "piwala", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        nummer.add(new Word("red", "laal", R.drawable.color_red, R.raw.color_red));
        nummer.add(new Word("green", "hirawaa", R.drawable.color_green, R.raw.color_green));
        nummer.add(new Word("black", "kaala", R.drawable.color_black, R.raw.color_black));


        WordAdapater itemsAdapter = new WordAdapater(this, nummer);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = nummer.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mpRelease();
                    }
                });
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        mpRelease();
    }
//to release the unused resources
    private void mpRelease() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}

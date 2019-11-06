package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapater extends ArrayAdapter<Word> {


    public WordAdapater(Activity context, ArrayList<Word> myword) {
        super(context, 0, myword);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listlayout, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word tobedisplayed = getItem(position);

        final TextView defaultnameTextView = (TextView) listItemView.findViewById(R.id.defaultNames);
        defaultnameTextView.setText(tobedisplayed.getDtrans());

        TextView mewaknameTextView = (TextView) listItemView.findViewById(R.id.mewakNames);
        mewaknameTextView.setText(tobedisplayed.getMtrans());

        ImageView im = (ImageView) listItemView.findViewById((R.id.icon));
        if (tobedisplayed.hasImage()) {

            im.setImageResource(tobedisplayed.getImageID());
            im.setVisibility(View.VISIBLE);
        } else
            im.setVisibility(View.GONE);


        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

package com.example.anurag.trainingsessions;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anurag on 27/2/18.
 */

public class CustomAdapter extends ArrayAdapter {
    private String companyName[];
    private int flags[];
    LayoutInflater inflater;
    private Activity context;

    public CustomAdapter(Activity context, String[] companyName, int[] flags) {
        super(context, R.layout.activity_list_view, companyName);
        this.context = context;
        this.companyName = companyName;
        this.flags = flags;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_list_view, null, true);
        TextView titleText = (TextView) rowView.findViewById(R.id.tv_listview);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.iconList);
        titleText.setText(companyName[position]);
        imageView.setImageResource(flags[position]);

        return rowView;
    }
}

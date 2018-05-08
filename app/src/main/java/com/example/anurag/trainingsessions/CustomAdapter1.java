package com.example.anurag.trainingsessions;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anurag on 2/3/18.
 */

public class CustomAdapter1 extends ArrayAdapter{
    LayoutInflater inflater;
    private Activity context;
    private ListView listView;

    List<TestClass> classList = new ArrayList<>();

    public CustomAdapter1(Activity context, int resource, List<TestClass> classList) {
        super(context, resource);
        this.context=context;
        this.classList = classList;
    }

    @Override
    public int getCount() {
        return classList.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.test_list, null, true);
        TextView titleText = rowView.findViewById(R.id.tv_listview_test);
        ImageView imageView =rowView.findViewById(R.id.iconList_test);
        titleText.setText(classList.get(position).getTname());
        imageView.setImageResource(classList.get(position).getTimage());

        return rowView;
    }
}

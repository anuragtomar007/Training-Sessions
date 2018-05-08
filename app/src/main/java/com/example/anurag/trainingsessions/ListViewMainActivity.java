package com.example.anurag.trainingsessions;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewMainActivity extends AppCompatActivity {
    ListView listView;
    int flags[] = {R.drawable.taco, R.drawable.taco, R.drawable.taco, R.drawable.taco, R.drawable.taco, R.drawable.taco, R.drawable.taco, R.drawable.taco, R.drawable.taco};
    String[] companyName = {"Google", "Microsoft", "Apple", "Facebook", "Dell", "Sedin", "Accenture", "Lenovo", "HP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_main);
        listView = findViewById(R.id.listview);

//        final List<TestClass> list = new ArrayList<>();
//        list.add(new TestClass("Anurag", R.drawable.taco, true));
//        list.add(new TestClass("Naren", R.drawable.taco, false));
//        list.add(new TestClass("Ram", R.drawable.taco, false));
//        list.add(new TestClass("Raja", R.drawable.taco, true));
//        list.add(new TestClass("Kumaresh", R.drawable.taco, false));
//        list.add(new TestClass("Arrvind", R.drawable.taco, false));
//        list.add(new TestClass("SivaMani", R.drawable.taco, true));
//        list.add(new TestClass("Shiv", R.drawable.taco, false));
//        list.add(new TestClass("Navami", R.drawable.taco, true));
//        list.add(new TestClass("Nivedha", R.drawable.taco, false));

//        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,list);
//        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//        listView.setAdapter(arrayAdapter);
//
//        CustomAdapter1 customAdapter1 = new CustomAdapter1(this, 1, list);
//        listView.setAdapter(customAdapter1);

//        for (int i = 0; i < list.size(); i++) {
//            if (!list.get(i).getaBoolean()) {
//                listView.setSelector(R.color.light_blue);
//            }
//        }

        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (listView.isSelected()){
                    listView.setSelector(R.color.app_green);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //For Simple
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, companyName);
//        listView.setAdapter(adapter);

        //For Custom
        CustomAdapter customAdapter = new CustomAdapter(this,companyName,flags);
        listView.setAdapter(customAdapter);

    }
}

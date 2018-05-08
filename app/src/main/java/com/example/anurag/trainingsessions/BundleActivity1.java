package com.example.anurag.trainingsessions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BundleActivity1 extends AppCompatActivity {
    private EditText name;
    private EditText lastname;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle1);

        name=findViewById(R.id.et_name);
        lastname=findViewById(R.id.et_lastname);
        btn = findViewById(R.id.btn_submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BundleActivity1.this,BundleActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putString("Name",name.getText().toString());
                bundle.putString("LastName",lastname.getText().toString());
                i.putExtras(bundle);
                startActivity(i);
            }
        });
    }
}

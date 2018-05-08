package com.example.anurag.trainingsessions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataTransfer extends AppCompatActivity {
    private Button submit;
    private EditText pname;
    private EditText prole;
    private EditText pcountry;
    private EditText pipl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer);

        pname =findViewById(R.id.p_name);
        prole =findViewById(R.id.p_role);
        pcountry =findViewById(R.id.p_country);
        pipl=findViewById(R.id.p_ipl);
        submit = findViewById(R.id.btn_p_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayerDetails playerDetails = new PlayerDetails(pname.getText().toString(),prole.getText().toString(),
                        pcountry.getText().toString(),pipl.getText().toString());
                Intent i = new Intent(DataTransfer.this,PlayerDetailsActivity.class);
                i.putExtra("Player Details",playerDetails);
                startActivity(i);
            }
        });
    }
}

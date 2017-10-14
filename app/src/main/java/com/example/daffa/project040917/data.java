package com.example.daffa.project040917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class data extends AppCompatActivity {

    TextView txtdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        txtdata = (TextView)findViewById(R.id.txdata);

        Intent getdata = getIntent();

        String gtdat = getdata.getStringExtra("dthsl");

        txtdata.setText(gtdat);
    }
}

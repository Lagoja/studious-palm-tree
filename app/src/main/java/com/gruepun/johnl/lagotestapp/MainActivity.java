package com.gruepun.johnl.lagotestapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateCounter();

    }


    public void updateCounter(){
        TextView counter = (TextView) findViewById(R.id.counter);
        counter.setText(String.valueOf(count));
    }

    public void addOneToCounter(View v){
        count++;
        count++;
        updateCounter();
    }

    @Override
    public void onStop() {
        super.onStop();

    }
}

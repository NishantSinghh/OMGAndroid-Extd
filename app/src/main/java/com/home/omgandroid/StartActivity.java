package com.home.omgandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

/**
 * Created by Nishant on 8/18/2015.
 */
public class StartActivity extends AppCompatActivity{
    Button SearchButton;
    Button AboutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        SearchButton = (Button) findViewById(R.id.btnSearch);
        AboutButton = (Button) findViewById(R.id.btnAbout);
    }
    public void displayMain(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void displayAbout(View v) {
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
}

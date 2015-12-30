package com.mcdonnell.diarmuid.wfdfrulesofultimate;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView articleOne;
    TextView articleOnePointOne, articleOnePointTwo, articleOnePointThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        articleOne = (TextView) findViewById(R.id.article1);

        articleOnePointOne = (TextView) findViewById(R.id.article1_1);
        articleOnePointTwo = (TextView) findViewById(R.id.article1_2);
        articleOnePointThree = (TextView) findViewById(R.id.article1_3);

        articleOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(articleOnePointOne.getVisibility() == View.VISIBLE) {
                    articleOnePointOne.setVisibility(View.GONE);
                    articleOnePointTwo.setVisibility(View.GONE);
                    articleOnePointThree.setVisibility(View.GONE);
                }
                else{
                    articleOnePointOne.setVisibility(View.VISIBLE);
                    articleOnePointTwo.setVisibility(View.VISIBLE);
                    articleOnePointThree.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

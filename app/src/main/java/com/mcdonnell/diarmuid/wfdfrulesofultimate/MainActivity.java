package com.mcdonnell.diarmuid.wfdfrulesofultimate;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView articleOne, articleTwo;
    LinearLayout articleOneContent, articleTwoContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        articleOne = (TextView) findViewById(R.id.article1);
        articleTwo = (TextView) findViewById(R.id.article2);

        articleOneContent = (LinearLayout) findViewById(R.id.article1Content);
        articleTwoContent = (LinearLayout) findViewById(R.id.article2Content);

        articleOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(articleOneContent.getVisibility() == View.VISIBLE) {
                    articleOneContent.setVisibility(View.GONE);
                }
                else{
                    setContentsToGone();
                    articleOneContent.setVisibility(View.VISIBLE);
                }
            }
        });
        articleTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(articleTwoContent.getVisibility() == View.VISIBLE) {
                    articleTwoContent.setVisibility(View.GONE);
                }
                else{
                    setContentsToGone();
                    articleTwoContent.setVisibility(View.VISIBLE);
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

    public void setContentsToGone(){
        articleOneContent.setVisibility(View.GONE);
        articleTwoContent.setVisibility(View.GONE);
    }
}

package com.somedomain.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void BtnClickSpotifyStreamer(View v){
        ShowToast("This button will launch my Spotify Streamer app!",v);
    }
    public void BtnClickLibraryApp(View v) {
        ShowToast("This button will launch my Library app!",v);
    }
    public void BtnClickScoresApp(View v) {
        ShowToast("This button will launch my Scores app!",v);
    }

    public void BtnClickBuildItBiggerApp(View v) {
        ShowToast("This button will launch my Build It Bigger app!",v);
    }

    public void BtnClickxyzReaderApp(View v) {
        ShowToast("This button will launch my XYZ Reader app!",v);
    }

    public void BtnClickmyOwnApp(View v) {
        ShowToast("This button will launch my capstone app!",v);
    }
    private void ShowToast(String message, View v)
    {
        Toast.makeText(v.getContext(),message,Toast.LENGTH_SHORT).show();
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

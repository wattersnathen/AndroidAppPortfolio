package com.nwatters.nanodegreeportfolio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view) {
        Toast toast = null;
        switch (view.getId()) {
            case (R.id.spotify_btn):
                toast = Toast.makeText(getApplicationContext(), R.string.spotify_msg, Toast.LENGTH_LONG);
                break;
            case (R.id.scores_btn):
                toast = Toast.makeText(getApplicationContext(), R.string.scores_msg, Toast.LENGTH_LONG);
                break;
            case (R.id.library_btn):
                toast = Toast.makeText(getApplicationContext(), R.string.library_msg, Toast.LENGTH_LONG);
                break;
            case (R.id.bigger_btn):
                toast = Toast.makeText(getApplicationContext(), R.string.build_bigger_msg, Toast.LENGTH_LONG);
                break;
            case (R.id.xyz_btn):
                toast = Toast.makeText(getApplicationContext(), R.string.xyz_reader_msg, Toast.LENGTH_LONG);
                break;
            case (R.id.capstone_btn):
                toast = Toast.makeText(getApplicationContext(), R.string.capstone_msg, Toast.LENGTH_LONG);
                break;
            default:
                System.out.println("AAAAHAHDFDFHA");
                break;
        }
        if (null != toast) {
            toast.show();
        }
    }
}

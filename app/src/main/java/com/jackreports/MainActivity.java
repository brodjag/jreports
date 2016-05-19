package com.jackreports;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.jackreports.rooms_list_fragment.MarksListSet;
import com.sothree.slidinguppanel.ScrollableViewHelper;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class MainActivity extends AppCompatActivity {

    mapSet map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new SwipeSet(this);



        new MarksListSet(this);

        map= new mapSet(this);
        (new Handler()).postDelayed(new Runnable() {
            @Override
            public void run() {
                map.setPosition(38.14,-120.45);
              //  map.addMarks();
            }
        },1000);





    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_settings:
               // startActivity(new Intent(this, SettingsActivity.class));
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

}

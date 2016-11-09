package com.moco.schleppo.schleppo;

import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

// Sidebar imports
import android.support.v4.widget.DrawerLayout;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarDrawerToggle;

public class MainActivity extends AppCompatActivity {
    ImageButton profileBtn;
    ImageButton mapBtn;
    ImageButton warningBtn;
    ImageButton messageBtn;
/*
    private DrawerLayout mDrawer;
    private Toolbar toolbar;
    private NavigationView nvDrawer;
    private ActionBarDrawerToggle drawerToggle;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setupSidebar();
        setClickListener();
    }

    public void setClickListener () {
        profileBtn = (ImageButton) findViewById(R.id.imageButton_Profile);
        mapBtn = (ImageButton) findViewById(R.id.imageButton_Map);
        warningBtn = (ImageButton) findViewById(R.id.imageButton_Warning);
        messageBtn = (ImageButton) findViewById(R.id.imageButton_Messages);

        // Capture button clicks
        profileBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                Log.d("BTN", "Profile clicked");
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        profil.class);
                startActivity(myIntent);
            }
        });
        mapBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                Log.d("BTN", "Map clicked");
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        MapActivity.class);
                startActivity(myIntent);
            }
        });
        warningBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                Log.d("BTN", "DriverWarn clicked");
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        DriverWarnActivity.class);
                startActivity(myIntent);
            }
        });
        messageBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                Log.d("BTN", "Message clicked");
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        MailListActivity.class);
                startActivity(myIntent);
            }
        });
    }
/*
    private void setupSidebar () {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        nvDrawer = (NavigationView) findViewById(R.id.nav_view);
        // Setup drawer view
        nvDrawer.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                selectDrawerItem(menuItem);
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean selectDrawerItem(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent myIntent;

        if (id == R.id.nav_home) {new Intent();
            myIntent = new Intent(MainActivity.this,
                    MainActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_help) {
            myIntent = new Intent(MainActivity.this,
                    MainActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_map) {
            myIntent = new Intent(MainActivity.this,
                    MainActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_messages) {
            myIntent = new Intent(MainActivity.this,
                    MailListActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_settings) {
            myIntent = new Intent(MainActivity.this,
                    MainActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_warnDriver) {
            myIntent = new Intent(MainActivity.this,
                    MainActivity.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_profile) {
            myIntent = new Intent(MainActivity.this,
                    profil.class);
            startActivity(myIntent);
        } else if (id == R.id.nav_login) {
            myIntent = new Intent(MainActivity.this,
                    LoginActivity.class);
            startActivity(myIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    */
}
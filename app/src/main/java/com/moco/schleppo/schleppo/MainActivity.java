package com.moco.schleppo.schleppo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.Toast;

import com.parse.GetCallback;
import com.parse.GetDataCallback;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.interceptors.ParseLogInterceptor;

import java.io.ByteArrayOutputStream;

import bolts.Task;

public class MainActivity extends AppCompatActivity {
    ImageButton profileBtn;
    ImageButton mapBtn;
    ImageButton warningBtn;
    ImageButton messageBtn;
    SidebarBinder sidebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setClickListener();
        sidebar = new SidebarBinder(MainActivity.this);

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);


    }

    public void setClickListener () {
        profileBtn = (ImageButton) findViewById(R.id.imageButton_Profile);
        mapBtn = (ImageButton) findViewById(R.id.imageButton_Map);
        warningBtn = (ImageButton) findViewById(R.id.imageButton_Warning);
        messageBtn = (ImageButton) findViewById(R.id.imageButton_Messages);

        // Capture button clicks
        profileBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        profil.class);
                startActivity(myIntent);
            }
        });
        mapBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        profil.class);
                startActivity(myIntent);
            }
        });
        warningBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        profil.class);
                startActivity(myIntent);
            }
        });
        messageBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        MailListActivity.class);
                startActivity(myIntent);
            }
        });
    }





}
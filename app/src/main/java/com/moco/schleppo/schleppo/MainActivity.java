package com.moco.schleppo.schleppo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton profileBtn;
    ImageButton mapBtn;
    ImageButton warningBtn;
    ImageButton messageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Locate the button in activity_main.xml
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
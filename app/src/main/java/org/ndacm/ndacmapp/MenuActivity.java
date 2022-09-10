package org.ndacm.ndacmapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends Activity {

			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		TextView menuButtonPreferences = (TextView) findViewById(R.id.menu_textview_preferences);
		menuButtonPreferences.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MenuActivity.this, "Preferences :)", Toast.LENGTH_SHORT).show();
			}
		});
		
		TextView menuButtonRoster = (TextView) findViewById(R.id.menu_textview_roster);
		menuButtonRoster.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MenuActivity.this, "Roster :)", Toast.LENGTH_SHORT).show();
			}
		});
		
		TextView menuButtonEvents = (TextView) findViewById(R.id.menu_textview_events);
		menuButtonEvents.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MenuActivity.this, "Events :)", Toast.LENGTH_SHORT).show();
			}
		});
		
		TextView menuButtonAbout = (TextView) findViewById(R.id.menu_textview_about);
		menuButtonAbout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MenuActivity.this, "About Us :)", Toast.LENGTH_SHORT).show();
			}
		});
		
		TextView menuButtonCredit = (TextView) findViewById(R.id.menu_textview_credit);
		menuButtonCredit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MenuActivity.this, "Credit System :)", Toast.LENGTH_SHORT).show();
			}
		});
		
		TextView menuButtonCamera = (TextView) findViewById(R.id.menu_textview_camera);
		menuButtonCamera.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MenuActivity.this, "ACM Camera:)", Toast.LENGTH_SHORT).show();
			}
		});
		
		TextView menuButtonExtra = (TextView) findViewById(R.id.menu_textview_extra);
		menuButtonExtra.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MenuActivity.this, "Extra button :o", Toast.LENGTH_SHORT).show();
			}
		});
	}
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}

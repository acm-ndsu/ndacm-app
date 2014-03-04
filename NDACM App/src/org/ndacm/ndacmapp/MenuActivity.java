package org.ndacm.ndacmapp;

import android.os.Bundle;
import android.R.menu;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;

public class MenuActivity extends Activity {

			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}

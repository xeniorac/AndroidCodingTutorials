package com.example.gps;

import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LocationManager loc=(LocationManager)getSystemService(LOCATION_SERVICE);
		
		
		
	}

}

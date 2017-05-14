package com.asif;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Next extends Activity{

	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next);
		
		tv=(TextView)findViewById(R.id.showD);
		
		tv.setText(getIntent().getStringExtra("data"));
		
		
	}
}

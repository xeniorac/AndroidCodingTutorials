package com.asif;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends Activity implements OnClickListener{

	Button bn;
	TextView tv;
	EditText ed;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		bn=(Button)findViewById(R.id.bn2);
		tv=(TextView)findViewById(R.id.wel);
        ed=(EditText)findViewById(R.id.editText1);

		String str=ed.getText().toString();
		tv.setText(str);
		bn.setOnClickListener(this);
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(bn.isPressed()){
			
			Intent i=new Intent(Second.this, LayoutDemoActivity.class);
			
			startActivity(i);
		}
	}
}

package com.asif;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

public class AdapterDemoActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
	
	AutoCompleteTextView auto;
	Spinner sp;
	Button bn,bn1;
	
	String arr[]={"Android","Iphone","Windwos","Symbian","Anphone","IpPDA"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        auto=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        sp=(Spinner)findViewById(R.id.spinner1);
        bn=(Button)findViewById(R.id.button3);
        
        bn1=(Button)findViewById(R.id.custoButton);

        ArrayAdapter arrayd=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, arr);
        
        auto.setAdapter(arrayd);
        		
        sp.setAdapter(arrayd);
        
        bn.setOnClickListener(this);
        bn1.setOnClickListener(this);

    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(bn.isPressed()){
		Intent i=new Intent(this,ShowList.class);
		
		startActivity(i);
		}else {
			Intent i1=new Intent(this,ShowCustoList.class);
			
			startActivity(i1);
		}
	}
}
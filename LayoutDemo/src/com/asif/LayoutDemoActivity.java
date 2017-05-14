package com.asif;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LayoutDemoActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	
	
	Button bn;
	EditText ed;
	String str;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ed=(EditText)findViewById(R.id.editText1);
        bn=(Button)findViewById(R.id.button1);
        
        bn.setOnClickListener(this);
        
        
    }
    
    public void onClick(View v) {
    	// TODO Auto-generated method stub
    	if(v.getId()==R.id.button1){
    		 str=ed.getText().toString();
    		 
    		Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com") );
    		
    		i.putExtra("name", str);

    		startActivity(i);
    	}
    }
}
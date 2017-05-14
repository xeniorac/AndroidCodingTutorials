package com.asif;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DialogDemoActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
	Button bn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        bn=(Button)findViewById(R.id.button1);
        
        bn.setOnClickListener(this);
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		ProgressDialog pd=new ProgressDialog(this);
		
		pd.setTitle("Loading...!!!");
		pd.setMessage("Please wait...!!!!");
		
		pd.setIcon(R.drawable.ic_launcher);
		
		pd.show();
		
	}
}
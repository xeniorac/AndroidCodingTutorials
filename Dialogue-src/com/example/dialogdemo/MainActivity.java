package com.example.dialogdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	
	Button bn1,bn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn1=(Button)findViewById(R.id.button1);
        bn2=(Button)findViewById(R.id.button2);
        
        
        bn1.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(bn1.isPressed()){
			
			
			   AlertDialog.Builder alert=new AlertDialog.Builder(this);
				
				alert.setTitle("AlertDialog Box");
				alert.setMessage("This is AlertDialog Box");
				alert.setIcon(R.drawable.ic_launcher);
				
				alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Toast.makeText(getApplicationContext(), "Yes Clicked..", 1000).show();
					}
				});
				
	alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Toast.makeText(getApplicationContext(), "No Clicked..", 1000).show();
					}
				});
	
	alert.setNeutralButton("Okay", new DialogInterface.OnClickListener() {
		
		public void onClick(DialogInterface arg0, int arg1) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "Okay Clicked..", 1000).show();
		}
	});
				alert.show();
			
		}else {
			
		}
	}
    
}

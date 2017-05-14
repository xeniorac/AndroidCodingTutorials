package com.asif;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class OpenGalActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
	Button bn;
	ImageView iv;
	int rc=1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        bn=(Button)findViewById(R.id.button1);
        iv=(ImageView)findViewById(R.id.imageView1);
        
        bn.setOnClickListener(this);
    }
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent i=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
		
		startActivityForResult(i, rc);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(rc==1){
			Uri image=data.getData();
			iv.setImageURI(image);
		}
	}
}
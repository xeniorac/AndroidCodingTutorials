package com.asif;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TouchDemoActivity extends Activity implements OnTouchListener {
    /** Called when the activity is first created. */
	
	

	TextView tv1,tv2,tv3,tv4,tv5;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);
        tv5=(TextView)findViewById(R.id.textView5);

        
        LinearLayout ll=(LinearLayout)findViewById(R.id.ll);
        
        ll.setOnTouchListener(this);
    }

	public boolean onTouch(View v, MotionEvent me) {
		// TODO Auto-generated method stub..
		
		float x1 = 0,x2;
		switch (me.getAction()) {
		case MotionEvent.ACTION_DOWN:
			
			x1=me.getX();
			
			break;
	
		case MotionEvent.ACTION_UP:	
			
			x2=me.getX();
		if(x1>x2){
			
		}else {
			
		}
		
		default:
			break;
		}
		
		float x=me.getX();
		float y=me.getY();
		
		tv1.setText("X: "+String.valueOf(x)+"Y: "+String.valueOf(y));
		
		tv2.setText(String.valueOf(me.getDownTime()));
		
		tv3.setText(String.valueOf(me.getEventTime()));
		tv4.setText(String.valueOf(me.getPressure()));
		
		
		tv5.setText(String.valueOf(me.getEventTime()-me.getDownTime()));

		
		return true;
	}
}
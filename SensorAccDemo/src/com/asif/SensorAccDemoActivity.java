package com.asif;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class SensorAccDemoActivity extends Activity implements SensorEventListener{
    /** Called when the activity is first created. */
	
	
	TextView tv1,tv2,tv3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        
        SensorManager sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        
        Sensor sen=sm.getDefaultSensor(Sensor.TYPE_TEMPERATURE);
        
        
        sm.registerListener(this, sen, SensorManager.SENSOR_DELAY_NORMAL);
    }

	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	public void onSensorChanged(SensorEvent se) {
		// TODO Auto-generated method stub
		
		float x=se.values[0];
		float y=se.values[1];
		float z=se.values[2];
		
		tv1.setText(tv1.getText()+String.valueOf(x));
		tv2.setText(tv2.getText()+String.valueOf(y));
		tv3.setText(tv3.getText()+String.valueOf(z));
		
	}
}
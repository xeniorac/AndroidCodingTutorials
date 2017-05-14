package com.asif;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.asif.abc.*;

public class ShowCustoList extends Activity{

	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custolist);
		lv=(ListView)findViewById(R.id.listCusto);
		
		BaseAdDemo obj=new BaseAdDemo(this);
		
		lv.setAdapter(obj);
	}
}


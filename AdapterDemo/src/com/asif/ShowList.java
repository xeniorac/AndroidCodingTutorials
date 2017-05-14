package com.asif;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowList extends Activity implements OnItemClickListener{

	
	ListView lv;
	
	String arr[]={"Android","Iphone","Windwos","Symbian","Anphone","IpPDA"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.list);
		lv=(ListView)findViewById(R.id.listView1);
		
		ArrayAdapter<String> adp=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, arr);
		
		lv.setAdapter(adp);
		
		lv.setOnItemClickListener(this);
		//lv.invalidate();
		
	}

	public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
		// TODO Auto-generated method stub
		
		String str=arr[pos];
		
		Intent i=new Intent(this, Next.class);
		i.putExtra("data",str );
		
		startActivity(i);
		
	}
}

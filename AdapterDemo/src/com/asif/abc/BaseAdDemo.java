package com.asif.abc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.asif.R;
import com.asif.ShowCustoList;

public class BaseAdDemo extends BaseAdapter{

	ShowCustoList con;
	public BaseAdDemo(ShowCustoList con){
		this.con=con;
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return getItem(arg0);
	}

	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	public View getView(int arg0, View arg1, ViewGroup vg) {
		// TODO Auto-generated method stub
		
		LayoutInflater inf=con.getLayoutInflater();
		
		View v=inf.inflate(R.layout.custo,null);
		
		return v;
	}
	
}

package iiitd.chs.newapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class AccessInfo extends Fragment{
	TextView t,d;
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		View v= inflater.inflate(R.layout.accessinfo, container, false);
		t=(TextView)v.findViewById(R.id.accesstitle);
		d=(TextView)v.findViewById(R.id.accessdata);
		return v;
	}

}

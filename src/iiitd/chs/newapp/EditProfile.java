package iiitd.chs.newapp;

import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class EditProfile extends Fragment implements OnClickListener{
	Button b;
	EditText uid,username,password,bg,address,age,gender;
	
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		View v= inflater.inflate(R.layout.editprofile, container, false);
		b=(Button)v.findViewById(R.id.update);
		uid=(EditText)v.findViewById(R.id.uid);
		username=(EditText)v.findViewById(R.id.user);
		password=(EditText)v.findViewById(R.id.pass);
		bg=(EditText)v.findViewById(R.id.bloodgroup);
		address=(EditText)v.findViewById(R.id.address);
		age=(EditText)v.findViewById(R.id.age);
		gender=(EditText)v.findViewById(R.id.gender);
		return v;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b)
		{
			
		}
		
	}
	
	
	
	

}

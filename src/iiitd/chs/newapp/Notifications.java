package iiitd.chs.newapp;

import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Notifications extends Fragment{
	TextView t;
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.notifications, container, false);
		t=(TextView)v.findViewById(R.id.received);
		return v;
		
		
	}
   
		
	/*private BroadcastReceiver onNotification= new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {
			// intent can contain anydata
			Log.d("MainActivity","onReceive called");
			//tv.setText("Broadcast received !");
			String msg = intent.getStringExtra(Constants.AMQP_SUBSCRIBED_MESSAGE);
			
		}
	};*/

}
package iiitd.chs.newapp;

import java.util.UUID;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends Activity {

	Button b;
	EditText uid, username, password, bg, address, age, gender, phone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		b = (Button) findViewById(R.id.signup);
		uid = (EditText) findViewById(R.id.uid);
		username = (EditText) findViewById(R.id.user);
		password = (EditText) findViewById(R.id.pass);
		bg = (EditText) findViewById(R.id.bloodgroup);
		address = (EditText) findViewById(R.id.address);
		age = (EditText) findViewById(R.id.age);
		gender = (EditText) findViewById(R.id.gender);
		phone = (EditText) findViewById(R.id.phone);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registration, menu);
		return true;
	}

	public void addpatient(View v) {
		UUID id = UUID.randomUUID();
		String sid = String.valueOf(id);
		Toast.makeText(getApplicationContext(),
				"Account created!!" + "\n" + "UUID :" + sid, Toast.LENGTH_LONG)
				.show();
		;
		
		Intent mServiceIntent = new Intent(this, AMQPService.class);
		mServiceIntent.putExtra(Constants.AMQP_PUBLISH_MESSAGE, sid);
		startService(mServiceIntent);
		
		
		
		System.out.println("UUID :" + sid);
		this.finish();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}

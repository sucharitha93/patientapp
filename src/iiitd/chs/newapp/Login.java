package iiitd.chs.newapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
	EditText uname, pword;
	Button b;

	// String u, p;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		b = (Button) findViewById(R.id.loginbutton);
		uname = (EditText) findViewById(R.id.edit_username);
		pword = (EditText) findViewById(R.id.edit_password);
		// u = uname.getText().toString();
		// p = pword.getText().toString();
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	public void login(View b) {
	/*	if(uname.getText()==null && pword.getText()==null)
		{
			Toast.makeText(getApplicationContext(), "Enter username and password",
					Toast.LENGTH_LONG).show();
		}
		else
		{
		
		}*/
			Intent in = new Intent(this, MainActivity.class);
			// in.putExtra("user", u);
			// in.putExtra("password", p);
			startActivity(in);
		
		

	}

	public void register(View b) {

		Intent in = new Intent(this, Registration.class);
		startActivity(in);

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

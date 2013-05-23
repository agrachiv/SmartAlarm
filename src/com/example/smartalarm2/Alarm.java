package com.example.smartalarm2;

import com.example.smartalarm2.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Alarm extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm);
		 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_alarm, menu);
		return true;
	}
	public void Level3(View f) {
			Intent Level3 = new Intent(this, Level3.class);
    	startActivity(Level3);
	}    	
	public void Level2(View g) {
		Intent Level2 = new Intent(this, Level2.class);
	startActivity(Level2);
}
	public void Level1(View h) {
		Intent Level1 = new Intent(this, Level1.class);
	startActivity(Level1);
}
}

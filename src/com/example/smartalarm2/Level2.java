package com.example.smartalarm2;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Level2 extends Activity {
Random randomik = new Random();
Random Sklizenka = new Random();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level3);
		
		int a = randomik.nextInt(9);
		int b = randomik.nextInt(9);
		int d = randomik.nextInt(9);
	
		int r = randomik.nextInt(9);
		int w = randomik.nextInt(9);
		int q = randomik.nextInt(9);
		
		int result = a+10*b+100*d;
		int result2 = q+10*w+100*r;
		int resultresult1 = result2+result;
		int resultresult2 = result2-result;
		int c = randomik.nextInt(2);
		int plusminus = Sklizenka.nextInt(2);
		double endResult = 0 ;
        Button button1aa = (Button)findViewById(R.id.button1a);
        Button button2aa = (Button)findViewById(R.id.button2a);
        Button button3aa = (Button)findViewById(R.id.button3a);
        TextView textView1 = (TextView)findViewById(R.id.textView1);
    
        	
		if(plusminus==1){
			endResult = resultresult1; 
			textView1.setText(result2+"+"+result+"=?");
		}else{
			endResult = resultresult2;
			textView1.setText(result2+"-"+result+"=?");
		}
		double wResult = endResult +(Math.pow(10,randomik.nextInt(2)))*(randomik.nextInt(8)+1); 
		double wResult2 = endResult +(Math.pow(10,randomik.nextInt(2)))*(randomik.nextInt(8)+1); 
		
		 if(c==0){
			 button1aa.setText(""+endResult+"");
			 button2aa.setText(""+wResult+"");
			 button3aa.setText(""+wResult2+"");
		 }else if(c==1){
			 button2aa.setText(""+endResult+"");
			 button1aa.setText(""+wResult+"");
			 button3aa.setText(""+wResult2+"");
		 }else if(c==2){
			 button3aa.setText(""+endResult+"");
			 button2aa.setText(""+wResult+"");
			 button1aa.setText(""+wResult2+"");
		 }
		 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_level3, menu);
		return true;
	}
}

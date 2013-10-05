package com.example.handsonandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;


public class SplashActivity extends Activity {

	private static int SPLASH_TIME_OUT = 3000; // 3 seconds.
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_splash);
		
		
		//Use a timer to keep the splash screen up long enough to show my logo.
		
		new Handler().postDelayed(new Runnable(){
			
			/*Show the splash screen
			 * sample commit
			 * 
			 */
			
			@Override
			public void run(){
				//Once timer is over, go to the new activity.
				Intent i = new Intent(SplashActivity.this, MainActivity.class);
				startActivity(i);
				
				finish();
			}
		}, SPLASH_TIME_OUT);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}


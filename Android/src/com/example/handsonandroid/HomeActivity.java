package com.example.handsonandroid;

import com.example.handsonandroid.mail_utility.Mail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 
 * @author Garrett
 *
 * Class that is the Home activity of the app, the main screen. Holds all
 * the buttons and directions to the many activities in the application
 */
public class HomeActivity extends Activity
{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
	}
	
	/*** All the OnClickListeners for the buttons ****/
	
	public void event(View v)
	{
		Intent i = new Intent(HomeActivity.this, FeedActivity.class);
		startActivity(i);
	}
	public void cal(View v)
	{
		Intent i = new Intent(HomeActivity.this, CalendarActivity.class);
		startActivity(i);
	}
	public void login(View v)
	{
		Intent i = new Intent(HomeActivity.this, LoginActivity.class);
		startActivity(i);
	}
	public void register(View v)
	{
		Intent i = new Intent(HomeActivity.this, RegisterActivity.class);
		startActivity(i);
	}
}

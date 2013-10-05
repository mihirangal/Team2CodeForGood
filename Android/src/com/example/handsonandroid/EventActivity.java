package com.example.handsonandroid;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EventActivity extends Activity implements OnClickListener
{
	private String eventUrl;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
		Bundle extras = getIntent().getExtras();
		Events event = null;
		if (extras != null) {
		    event = (Events) extras.get("Event");
		}
		
	}
	
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.shareButton:
			Intent shareIntent = new Intent(Intent.ACTION_SEND);
      	  	shareIntent.setType("text/plain");
      	  	shareIntent.putExtra(Intent.EXTRA_TEXT, "http://www.volunteercentralohio.org");
      	  	startActivity(Intent.createChooser(shareIntent, "Share"));
			break;
		case R.id.expressInterestButton:
			break;
		case R.id.signUpButton:
			break;
		}
	}
	
}

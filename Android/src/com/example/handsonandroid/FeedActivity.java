package com.example.handsonandroid;

import java.util.ArrayList;
import java.util.List;



import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
<<<<<<< HEAD
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
=======
import android.widget.ArrayAdapter;
import android.widget.ListView;
>>>>>>> ff0cad9a8b98dc5517ac9652015f7813e46da0a0


/**
 * 
 * @author Garrett
 * 
 * This activity is the feed for the app, all the events.
 */
public class FeedActivity extends Activity {

	ArrayList<Events> events;
	User user;
	
	//private ListView lv1 = null;
	private ListView lv2 = null;
	private ListView lv3 = null;
	private String s1[] = { "a", "b", "c", "d", "e", "f" };
	private String s2[] = { "r", "s", "t", "u", "v", "w", "x" };
	private String s3[] = { "r", "s", "f", "u", "c", "k", "x" };

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feed);
<<<<<<< HEAD

	    // DatabaseHandler db = new DatabaseHandler(this);
         
	        /**
	         * CRUD Operations
	         * */
	        // Inserting Contacts
	   
	         
	        // Reading all contacts
	    
		

	    
		
		
	}
	public void test(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("foo");
		your_array_list.add("bar");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				Intent i = new Intent(FeedActivity.this,EventActivity.class);
				i.putExtra("new_variable_name","12312411414");
				startActivity(i);
				
			}
		});
	}
	public void t1asa(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("foo");
		your_array_list.add("barsss");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}
		});
	}
	public void t2(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("foo");
		your_array_list.add("barsss");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}
		});
=======
		
		ListView lv = (ListView) findViewById(R.id.event_feed);
		
		//Comment out temporarily
		//String[] lv_array = (String[]) Events.getList().toArray();
		//lv.setAdapter(new ArrayAdapter<String>(FeedActivity.this, android.R.layout.simple_list_item_1,
		//lv_array));
		
>>>>>>> ff0cad9a8b98dc5517ac9652015f7813e46da0a0
	}
	public void t3(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("foo");
		your_array_list.add("barsss");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}
		});
	}
	public void t4(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("foo");
		your_array_list.add("barsss");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}
		});
	}
	public void t5(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("foo");
		your_array_list.add("barsss");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}
		});
	}
	public void t6(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("foo");
		your_array_list.add("barsss");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}
		});
	}
	

}

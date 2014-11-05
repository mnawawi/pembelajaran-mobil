package com.example.finalexam;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class Aras2 extends Activity {
	ListView listView ;
	MediaPlayer ourSound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aras2);
		
		final ImageButton menu =(ImageButton) findViewById(R.id.bmenu);
		listView = (ListView) findViewById(R.id.list);
		String[] values = new String[] { "2.1 Rintangan Aruhan & Kemuatan Dalam Litar Ulang-Alik", "2.2 Kuasa Dalam Litar Arus Ulang-Alik"};

		// Define a new Adapter
		// First parameter - Context
		// Second parameter - Layout for the row
		// Third parameter - ID of the TextView to which the data is written
		// Forth - the Array of data

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		  android.R.layout.simple_list_item_1, android.R.id.text1, values);


		// Assign adapter to ListView
		listView.setAdapter(adapter); 
		
		listView.setOnItemClickListener(new OnItemClickListener() {
			  @Override
			  public void onItemClick(AdapterView<?> parent, View view,
			    int position, long id) {
				
		       // ListView Clicked item index
			   int itemPosition     = position;
			   
			   // ListView Clicked item value
			   String  itemValue    = (String) listView.getItemAtPosition(position);
				  
			    // Show Alert 
			   
			    if (itemPosition==0){
			    	
			    	Intent i = new Intent(Aras2.this, LitarArusUlangAlik1.class);
					   startActivity(i);
					   finish();
			    }
			    
			    if(itemPosition==1){
			    	
			    	
			    	Intent i=new Intent(Aras2.this,KuasaLitarArusUlangAlik1.class);
			    	startActivity(i);
			    	finish();
			    }
			 
			  }

			
			}); 
		

		
		menu.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent i= new Intent (Aras2.this, Menu_Utama.class);
				startActivity(i);
				finish();
				ourSound=MediaPlayer.create(Aras2.this, R.raw.button);
				ourSound.start();
			}
			
		});
	}

}

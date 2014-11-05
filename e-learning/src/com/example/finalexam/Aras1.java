package com.example.finalexam;




import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class Aras1 extends Activity {
	ListView listView ;
	MediaPlayer ourSound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aras1);
		//final Button keluar=(Button) findViewById(R.id.bkeluar);
		final ImageButton menu =(ImageButton) findViewById(R.id.bmenu);
		listView = (ListView) findViewById(R.id.list);
		String[] values = new String[] { "1.1 Pengenalan", "1.2 Get Logik", "1.3 Jenis-jenis get logik",
		  "1.4 Kombinasi get logik", "1.5 Flip flop"};
		//listView.setTextColor(Color.parseColor("#FFFFFF"));
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
			    /*Toast.makeText(getApplicationContext(),
			      "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
			      .show();*/
			    
			    if (itemPosition==0){
			    	
			    	Intent i = new Intent(Aras1.this, Pengenalan.class);
					   startActivity(i);
					   //finish();
			    }
 if (itemPosition==1){
			    	
			    	Intent i = new Intent(Aras1.this, GetLogik.class);
					   startActivity(i);
					   //finish();
			    }
 if (itemPosition==2){
 	
 	Intent i = new Intent(Aras1.this, Jenis_getlogik.class);
		   startActivity(i);
		   //finish();
 }
 if (itemPosition==3){
	 	
	 	Intent i = new Intent(Aras1.this, Kombinasi_getlogik.class);
			   startActivity(i);
			   //finish();
	 }
 if (itemPosition==4){
	 	
	 	Intent i = new Intent(Aras1.this, Ff.class);
			   startActivity(i);
			   //finish();
	 }
			  }

			
			}); 
		
		/*keluar.setOnClickListener(new View.OnClickListener(){
			
			@Override
	        public void onClick(View v) {
	            // TODO Auto-generated method stub
	        finish();
	        onDestroy();
	        System.exit(0);
	          
	        }
		});*/
		
		menu.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent i= new Intent (Aras1.this, Menu_Utama.class);
				startActivity(i);
				finish();
				ourSound=MediaPlayer.create(Aras1.this, R.raw.button);
				ourSound.start();
			}
			
		});
		
		
		
		
	}
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{

	    if (keyCode == KeyEvent.KEYCODE_BACK)
	    {
	    	 super.onBackPressed();
	    }

	    return false;
	}

}

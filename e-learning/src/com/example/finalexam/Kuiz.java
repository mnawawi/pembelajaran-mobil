package com.example.finalexam;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Kuiz extends Activity {
	MediaPlayer ourSound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.kuiz);
		
	//final ImageButton exit=(ImageButton) findViewById(R.id.bExit);
	final ImageButton kuiz1=(ImageButton) findViewById(R.id.bkuiz1);
	final ImageButton kuiz2= (ImageButton) findViewById(R.id.bkuiz2);
	final ImageButton menu =(ImageButton) findViewById(R.id.bmenu);
	
	menu.setOnClickListener(new View.OnClickListener(){
		@Override
		public void onClick(View v){
			Intent i= new Intent (Kuiz.this, Menu_Utama.class);
			startActivity(i);
			finish();
			ourSound=MediaPlayer.create(Kuiz.this, R.raw.button);
			ourSound.start();
		}
		
	});
	
	kuiz1.setOnClickListener(new View.OnClickListener(){
		@Override
		
		public void onClick(View v)
		{
			
			Intent i= new Intent(Kuiz.this,Soal1.class);
			startActivity(i);
			ourSound=MediaPlayer.create(Kuiz.this, R.raw.button);
			ourSound.start();
			
		}
	});
	kuiz2.setOnClickListener(new View.OnClickListener(){
		@Override
		
		public void onClick(View v)
		{
			
			Intent i= new Intent(Kuiz.this,Soal1_2.class);
			startActivity(i);
			ourSound=MediaPlayer.create(Kuiz.this, R.raw.button);
			ourSound.start();
			
		}
	});
	/*exit.setOnClickListener(new View.OnClickListener() {

		        @Override
		        public void onClick(View v) {
		            // TODO Auto-generated method stub
		        finish();
		        System.exit(0);
		          
		        }
		    });*/
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
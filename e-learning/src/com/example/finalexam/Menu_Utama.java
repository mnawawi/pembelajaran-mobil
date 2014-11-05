package com.example.finalexam;

import com.example.finalexam.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Menu_Utama extends Activity {
	MediaPlayer ourSound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.menu_utama);
	final ImageButton aras1=(ImageButton) findViewById(R.id.bAras1);
	final ImageButton aras2=(ImageButton) findViewById(R.id.bAras2);
	final ImageButton kuiz=(ImageButton) findViewById(R.id.bKuiz);
	
	//final TransitionDrawable transition = (TransitionDrawable) viewObj.getBackground();
	//transition.startTransition(300);
	
	 /*ImageView img=(ImageView)findViewById(R.id.imgview);
	 img.setBackgroundResource(R.drawable.bgtrans);
	 AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
	 frameAnimation.start();*/
	 
	 
	aras1.setOnClickListener(new View.OnClickListener(){
	@Override
		public void onClick(View v )
			   {
				// TODO Auto-generated method stub					
			   Intent i = new Intent(Menu_Utama.this,Aras1.class);
			   startActivity(i);
			  // finish();
			   ourSound=MediaPlayer.create(Menu_Utama.this, R.raw.button);
				ourSound.start();
			   }
			   
		   });
	aras2.setOnClickListener(new View.OnClickListener(){
		@Override
			public void onClick(View v )
				   {
					// TODO Auto-generated method stub					
				   Intent i = new Intent(Menu_Utama.this, Aras2.class);
				   startActivity(i);
				   ourSound=MediaPlayer.create(Menu_Utama.this, R.raw.button);
					ourSound.start();
				   //finish();
				   }
				   
			   });
	
	kuiz.setOnClickListener(new View.OnClickListener(){
		@Override
			public void onClick(View v )
				   {
					// TODO Auto-generated method stub					
				   Intent i = new Intent(Menu_Utama.this, Kuiz.class);
				   startActivity(i);
				   ourSound=MediaPlayer.create(Menu_Utama.this, R.raw.button);
					ourSound.start();
				   //finish();
				   }
				   
			   });
	
	}}


package com.example.finalexam;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;

public class Soal5 extends Activity {
MediaPlayer ourSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal5);
        
        // tombol jawab
        ImageButton jawab = (ImageButton) findViewById(R.id.jawab);
        
        // tombol jawab diklik
        jawab.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// radio group
				RadioGroup opsi = (RadioGroup) findViewById(R.id.opsi);
				
				// radio yang dicek
				int id = opsi.getCheckedRadioButtonId();
				
				// dialog
				AlertDialog.Builder dialog = new AlertDialog.Builder(Soal5.this);
				dialog.setCancelable(false);
				
				// tidak ada radio yang dicek
				if (id == -1) {
					// pesan error
					dialog.setTitle("Error");
					dialog.setMessage("Jawaban harus diisi.");
					ourSound=MediaPlayer.create(Soal5.this, R.raw.button);
					ourSound.start();
					dialog.setPositiveButton("OK", new OnClickListener(){

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							ourSound=MediaPlayer.create(Soal5.this, R.raw.button);
							ourSound.start();
						}
						
					});
					dialog.show();

				// ada radio yang dicek
				} else {
					// benar
					if (id == R.id.opsi1) {						
						// penjelasan
						final Intent intent = new Intent(Soal5.this, Kuiz.class);
						dialog.setTitle("Tamat");
						dialog.setMessage("Jawapan anda betul. Taniah anda berjaya menjawab kesemua soalan");
						ourSound = MediaPlayer.create(Soal5.this, R.raw.musik);
						ourSound.start();
						dialog.setPositiveButton("Selesai", new OnClickListener() {
							
							public void onClick(DialogInterface dialog, int which) {
								startActivity(intent);		
								ourSound=MediaPlayer.create(Soal5.this, R.raw.button);
								ourSound.start();
							}
						});
						dialog.show();
						
					// salah
					} else {
						// pesan salah
						dialog.setTitle("Salah");
						dialog.setMessage("Jawapan anda salah.");
						ourSound=MediaPlayer.create(Soal5.this, R.raw.error);
						ourSound.start();
						dialog.setPositiveButton("Mula Semula", new OnClickListener() {
							
							public void onClick(DialogInterface dialog, int which) {
								ourSound=MediaPlayer.create(Soal5.this, R.raw.button);
								ourSound.start();
								final Intent i = new Intent(Soal5.this, Soal1.class);
								startActivity(i);	
								finish();
							}});
						dialog.show();
					}
				}
			}
		});
    }

    public boolean onKeyDown(int keycode,KeyEvent event){
    	AlertDialog.Builder dialog = new AlertDialog.Builder(Soal5.this);
		dialog.setCancelable(false);
		ourSound=MediaPlayer.create(Soal5.this,R.raw.error);
		ourSound.start();
    	if(keycode==KeyEvent.KEYCODE_BACK){
    		
    		dialog.setTitle("Keluar");
    		dialog.setMessage("Anda ingin menamatkan kuiz?");
    		dialog.setPositiveButton("Tamatkan",new OnClickListener(){

				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					ourSound=MediaPlayer.create(Soal5.this, R.raw.button);
					ourSound.start();
					final Intent intent=new Intent(Soal5.this,Kuiz.class);
					startActivity(intent);
					finish();
				}
    			
    				
    		});
    		dialog.show();
    	}
		return false;
    	
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.page1, menu);
        return true;
    }
    
}

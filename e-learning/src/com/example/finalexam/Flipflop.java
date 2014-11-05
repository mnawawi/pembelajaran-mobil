package com.example.finalexam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;





public class Flipflop extends Activity implements OnClickListener {

	private Context mContext=this;
	private static final String TAG = "Android BillingService";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pengenalan);
		
		//final Button donate=(Button) findViewById(R.id.donate2);
		
		
		WebView wv = (WebView)findViewById(R.id.webView1);
	//	wv.loadUrl("file:///android_asset/objektif.html");
		//wv.setInitialScale(100); 
	//	   wv.getSettings().setLoadWithOverviewMode(true);
	//	    wv.getSettings().setUseWideViewPort(true);
	//	wv.getSettings().setBuiltInZoomControls(true);

		String data = "<body>" + "<img src=\"images/cr.jpg\"/></body>";
		wv.loadDataWithBaseURL("file:///android_asset/",data , "text/html", "utf-8",null);
		wv.getSettings().setLoadWithOverviewMode(true);
		wv.getSettings().setUseWideViewPort(true);
		wv.getSettings().setBuiltInZoomControls(true);
		
		
		
		/*donate.setOnClickListener(new View.OnClickListener(){

			 public void onClick(View v )
			   {
				Intent i = new Intent(Objective.this, LinktoDonate.class);
			
				   startActivity(i);
				   //overridePendingTransition(R.anim.lefttoright, R.anim.righttoleft);
					  }
				   
			   });
		/*right.setOnClickListener(new View.OnClickListener(){
			
			 public void onClick(View v )
			   {
				Intent i = new Intent(Webview_design1.this,Webview_design_1.class);
			
				   startActivity(i);
				   overridePendingTransition(R.anim.righttoleft, R.anim.lefttoright);
					  }
				   
			   });*/
		/*left.setOnClickListener(new View.OnClickListener(){
		
			 public void onClick(View v )
			   {
				 
				Intent i = new Intent(Webview_design1.this,Webview_design.class);
			
				   startActivity(i);
				   overridePendingTransition(R.anim.righttoleft, R.anim.lefttoright);
					  }
				   
			   });*/
	}
	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
}
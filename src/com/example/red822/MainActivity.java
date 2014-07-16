package com.example.red822;

import org.apache.cordova.DroidGap;
import org.apache.cordova.*;
import android.os.Bundle;




public class MainActivity extends DroidGap {

	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/app/index.html");

//		if (savedInstanceState == null) {
//			getFragmentManager().beginTransaction()
//					.add(R.id.container, new PlaceholderFragment()).commit();
//		}
	}
}
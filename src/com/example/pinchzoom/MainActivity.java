package com.example.pinchzoom;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ZoomView zoomView = (ZoomView)findViewById(R.id.zoomView);
		zoomView.setImageResource(R.drawable.image);
	}


}

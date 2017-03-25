package com.navigation.drawer.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * @author dipenp
 *
 */
public class Item3Activity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		/**
		 * Adding our layout to parent class frame layout.
		 */
		View v=getLayoutInflater().inflate(R.layout.item1, null);
		frameLayout.addView(v);
		
		/**
		 * Setting title and itemChecked  
		 */
		
		
		//((ImageView)findViewById(R.id.image_view)).setBackgroundResource(R.drawable.image3);
	}
	@Override
	protected void onResume() {
		super.onResume();
		mDrawerList.setItemChecked(position, true);
		setTitle("Item3");
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
	}
	
}

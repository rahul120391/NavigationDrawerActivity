package com.navigation.drawer.activity;

import android.os.Bundle;
import android.view.View;

/**
 * @author dipenp
 *
 */
public class Item1Activity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/**
		 *  We will not use setContentView in this activty 
		 *  Rather than we will use layout inflater to add view in FrameLayout of our base activity layout*/
		
		/**
		 * Adding our layout to parent class frame layout.
		 */
		View v=getLayoutInflater().inflate(R.layout.item1, null);
		frameLayout.addView(v);
		/**
		 * Setting title and itemChecked  
		 */
		
		//((ImageView)findViewById(R.id.image_view)).setBackgroundResource(R.drawable.image1);
	}
	@Override
	protected void onResume() {
		super.onResume();
		mDrawerList.setItemChecked(position, true);
		setTitle("Item1");
	}
	@Override
	public void onBackPressed() {
		super.onBackPressed();
	}
}

package com.inetstd.android.sandbox;


import com.inetstd.android.sandbox.rss.activities.RSSReaderActivity;
import com.inetstd.android.sandbox.rss.activities.RSSViewActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LandingActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        findViewById(R.id.go_to_pulltorefresh).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LandingActivity.this, PullToRefreshActivity.class);
				startActivity(intent);
			}
			
		});
        
        findViewById(R.id.go_to_rss).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LandingActivity.this, RSSReaderActivity.class);
				startActivity(intent);
			}
			
		});
        
    }
}
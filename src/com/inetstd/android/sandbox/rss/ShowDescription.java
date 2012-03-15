package com.inetstd.android.sandbox.rss;

import com.inetstd.android.sandbox.R;
import com.inetstd.android.sandbox.rss.parser.RSSItem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.util.Log;
import android.view.*;

public class ShowDescription extends Activity
{
	public final static String C_RSS_ITEM_PARAM = "C_RSS_ITEM_PARAM"; 
	
	RSSItem rssItem;
	
    public void onCreate(Bundle icicle) 
    {
        super.onCreate(icicle);
        setContentView(R.layout.rss_item);
        
        try {
        	rssItem = (RSSItem) getIntent().getExtras().get(C_RSS_ITEM_PARAM);
        } catch (Exception e) {
        	Log.e("error", "can't get rss item");
		}          
        
        
    }     
    
    @Override
    public void onBackPressed() {
       	finish();
    }
}
package com.inetstd.android.sandbox.rss.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener; 
import android.util.Log;
import java.util.ArrayList;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;

import org.xml.sax.XMLReader;

import com.inetstd.android.sandbox.R;
import com.inetstd.android.sandbox.rss.parser.RSSFeed;
import com.inetstd.android.sandbox.rss.parser.RSSHandler;
import com.inetstd.android.sandbox.rss.parser.RSSItem;

import android.content.Intent;


public class RSSViewActivity extends Activity //implements OnItemClickListener
{
	public final static String C_RSS_ITEM_PARAM = "C_RSS_ITEM_PARAM"; 
	
	RSSItem rssItem;
	
	WebView webView;

    public void onCreate(Bundle icicle) {
    	Log.i("RSSViewActivity", "Start >>");
        super.onCreate(icicle);
        setContentView(R.layout.rss_item);            
        
        try {
        	rssItem = (RSSItem) getIntent().getExtras().get(C_RSS_ITEM_PARAM);
        } catch (Exception e) {
        	Log.e("error", "can't get rss item " + e.getMessage());
		}      
        
        
        Log.i("RSSViewActivity", rssItem.getTitle());
        webView = ((WebView) findViewById(R.id.rss_item_web_view));
        webView.getSettings().setJavaScriptEnabled(true);
        ((TextView) findViewById(R.id.rss_item_title)).setText(rssItem.getTitle());
    
        Log.i("RSSViewActivity", rssItem.getContent() + "!");
        String html = "<html>";
        html += "<head>";
        html += "<meta name=\"viewport\" content=\"width=device-width, dpi=device-dpi\">";
        html += "</head>";
        html += "<body>";
        html += rssItem.getContent();//.replaceAll("width=\"(\\d+)\"", "width=\"300\"").replaceAll("height=\"(\\d+)\"", "");
        html += "</body>";
        html += "</html>";
        
        
        webView.loadData(html, "text/html", "utf-8");
    
        Log.i("RSSViewActivity", "<<");
    }
    

       
}
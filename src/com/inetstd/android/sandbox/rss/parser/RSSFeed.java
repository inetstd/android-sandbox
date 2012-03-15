package com.inetstd.android.sandbox.rss.parser;


import java.util.List;
import java.util.Vector;

public class RSSFeed 
{
	private String _title = null;
	private String _pubdate = null;
	private int _itemcount = 0;
	private List<RSSItem> _itemlist;
	
	
	RSSFeed()
	{
		_itemlist = new Vector(0); 
	}
	int addItem(RSSItem item)
	{
		_itemlist.add(item);
		_itemcount++;
		return _itemcount;
	}
	RSSItem getItem(int location)
	{
		return _itemlist.get(location);
	}
	public List getAllItems()
	{
		return _itemlist;
	}
	int getItemCount()
	{
		return _itemcount;
	}
	void setTitle(String title)
	{
		_title = title;
	}
	void setPubDate(String pubdate)
	{
		_pubdate = pubdate;
	}
	public String getTitle()
	{
		return _title;
	}
	public String getPubDate()
	{
		return _pubdate;
	}
	
	
}

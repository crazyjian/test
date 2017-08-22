package com.hujian.util;

import java.util.HashMap;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySAXHandler extends DefaultHandler {
	
	private Map<String,String> config;
	private String TagName;
	private String ver;
	private String len;
	private String sum;
	private String dbytes;
	
	public void startDocument() {
		config = new HashMap<String,String>();
	}
	
	public void startElement(String uri, String localName, String aName, Attributes attributes) throws SAXException {
        TagName = aName;
    }
	
	public void endElement(String uri, String localName, String qName)  
            throws SAXException {  
        if("ver".equals(qName)){  
            config.put("ver", ver); 
        } else if("len".equals(qName)){  
            config.put("len", len); 
        } else if("sum".equals(qName)){  
            config.put("sum", sum); 
        } else if("dbytes".equals(qName)){  
            config.put("dbytes", dbytes); 
        }  
        TagName = null; 
    }  
	
	 public void characters(char[] ch, int start, int length) throws SAXException {  
	        if(TagName!=null){  
	            String content = new String(ch,start,length);  
	            if("ver".equals(TagName)){  
	            	ver = content;
	            }else if("len".equals(TagName)){  
	            	len = content;
	            }else if("sum".equals(TagName)){  
	            	sum = content;
	            }else if("dbytes".equals(TagName)){  
	            	dbytes = content; 
	            } 
	        }  
	    }  
	
	
	public Map<String,String> getConfig() {
		return config;
	}

}

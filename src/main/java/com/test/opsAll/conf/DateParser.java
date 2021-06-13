package com.test.opsAll.conf;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class DateParser extends StdDeserializer<Date>{

	public  DateParser(Class<?> vc) {
		super(vc);		
	}
	
	public  DateParser() {
		this (null);	
	}

	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		String pattern = "yyyy-MM-DD HH:mm:ss.SSSz";
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern);		
		String dateStr = p.getText();
		Date date1 = null;
		try {
			date1=simpleDateFormat.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return date1;
	}

}

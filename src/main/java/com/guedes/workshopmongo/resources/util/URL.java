package com.guedes.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URL {
	
	public static String decodeParam(String text) {
		try {
			return URLEncoder.encode(text,"UFT-8");
			
		} catch (UnsupportedEncodingException e) {
			return " ";
		}
		
	}

}

package com.saucedemo.utils;

public class CreateURL {

	
public final static String baseURI = "https://reqres.in/api";
	
	public static String getBaseURI() {
		return baseURI;
	}
	
	public static String getBaseURI(String resource) {
		return baseURI + resource;
	}
	
	
	
	
}

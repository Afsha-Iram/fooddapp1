package com.food.app.Exception;

public class ResourceNotFoundException extends RuntimeException {
	
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String Rname;
	private String Fname;
	private Object Fvalue;
	public ResourceNotFoundException(String rname, String fname, Object fvalue) {
		super();
		Rname = rname;
		Fname = fname;
		Fvalue = fvalue;
	}
	public String getRname() {
		return Rname;
	}
	public String getFname() {
		return Fname;
	}
	public Object getFvalue() {
		return Fvalue;
	}
	
}

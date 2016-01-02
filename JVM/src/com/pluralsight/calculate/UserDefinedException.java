package com.pluralsight.calculate;

public class UserDefinedException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserDefinedException(String reason,String values)
	{
		super(reason+values);
	}
	public UserDefinedException(String reason, String values, Throwable th) {
		// TODO Auto-generated constructor stub
		super(reason+values, th);
	}
	
}

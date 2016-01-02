package com.pluralsight.calculate;

public class Divide {
	int result;
public void div(int a , int b) throws UserDefinedException
{
	String 	res ="asd"+a;
	try{

	result= Integer.valueOf(res)/b;
	}
	catch(NumberFormatException ude)
	{
		throw new UserDefinedException("use valid numbers",res, ude);
	}
}
}

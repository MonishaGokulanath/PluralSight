package com.pluralsight.calculate;

public class Test {
public static void main(String args[])
{
Divide divide = new Divide();
try {
	divide.div(123, 456);
} catch (UserDefinedException e) {
	// TODO Auto-generated catch block
System.out.println(e.getCause().getMessage());
}
}
}

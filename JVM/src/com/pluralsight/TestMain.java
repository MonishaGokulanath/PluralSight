package com.pluralsight;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class TestMain {
public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
{
Class cl = Car.class;
try {
	Car car = (Car)cl.newInstance();
	Class car1=car.getClass();
	Method drive=car1.getMethod("drive",char.class,int.class);
	Object object =drive.invoke(car,'A',100);
	System.out.println(object.toString());
	
} catch (InstantiationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}

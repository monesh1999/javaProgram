package example.demo;

public class Casting {
	public static void main(String[] args) {
		
		
		int num = 10;
		double result = num; // Automatic conversion
		
		System.out.println(num);
		System.out.println(result); 
		
		double res = 9.88d;
		int my = (int) res;
		System.out.println(res);
		System.out.println(my);
		
		byte b =10;
		short s = 200;
        long l = 100000L;
        float f = 3.14f;
        double d = 99.99;
        char c = 'A';
        boolean flag = true;
		int Myint = 10;
		//Auto-boxing
//		The automatic conversion of primitive types to the object of their 
//		corresponding wrapper classes is known as autoboxing. 
//		For example: conversion of int to Integer, long to Long, double to Double, etc. 
//		
		Double dObj = d;
		Character cObj = c;
		Boolean flagObj = flag;
		Float fObj =f;
		Long lObj =l;
		Short sObj = s;
		Integer num1 = Myint;
		Byte obj = b;
		System.out.println(num1);
		System.out.println(obj);
		System.out.println(cObj);
		System.out.println(dObj);
		System.out.println(flagObj);
		System.out.println(fObj);
		System.out.println(lObj);
		System.out.println(sObj);

	}

}

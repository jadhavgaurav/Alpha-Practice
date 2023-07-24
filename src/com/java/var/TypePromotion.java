package com.java.var;

public class TypePromotion 	{
	public static void main(String[] args) {
		//Rule 1
		char a= 'a';
		char b= 'b';
		byte c = 15;
		System.out.println((int) (a));
		System.out.println((int) (b));
		System.out.println(a+b+c);

		//Rule 2
		int num = 10;
		float num2 = 20.5f;
		long num3 = 10;
		long num4 = 50;
		float ans = num+num2+num4+num3;

		int $ = 24;


	}
}

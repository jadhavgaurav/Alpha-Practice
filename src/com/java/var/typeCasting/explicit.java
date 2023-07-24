package com.java.var.typeCasting;

public class explicit {
	public static void main(String[] args) {
		float num1 = 535.654f;
//		int num2 = num1;
		int num2 = (int) num1; // float is converted into int
								// it is called xplicit Type Casting

		long num3 = num2;
		System.out.println(num3);

	}
}

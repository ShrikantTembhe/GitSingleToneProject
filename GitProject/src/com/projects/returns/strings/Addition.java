package com.projects.returns.strings;

import java.util.Scanner;

public class Addition {

	public int a;
	public int b;

	public int addition(int x, int y) {
		this.a = x;
		this.b = y;

		return x + y;
	}

	public static void main(String arsg[]) {
		Addition ad = new Addition();
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter first number");
		int s = sobj.nextInt();
		System.out.println("Enter second number");
		int k = sobj.nextInt();

		int add = ad.addition(s, k);
		System.out.println("Addition is>>" + add);
	}
}
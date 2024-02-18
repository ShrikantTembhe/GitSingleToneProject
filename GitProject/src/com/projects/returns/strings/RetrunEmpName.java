package com.projects.returns.strings;

public class RetrunEmpName {

	public static String getEmployeeName(String name) {
		System.out.print("Employee_Name & Designation>>");
		return name;
	}

	public static void main(String args[]) {
		// RetrunEmpName re = new RetrunEmpName();

		String name = RetrunEmpName.getEmployeeName("Shrikant_Backend_Developer");
		System.out.println(name);
	}
}
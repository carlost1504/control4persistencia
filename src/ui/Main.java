package ui;

import model.InfretructureDepartment;

public class Main {

	public static void main(String[] args) {
		InfretructureDepartment t=new InfretructureDepartment();
		t.lectorData();
		System.out.println(t.tString().toString());
		t.calculateArea();
		t.saveText();
		System.out.println(t.tString1().toString());
	}

}

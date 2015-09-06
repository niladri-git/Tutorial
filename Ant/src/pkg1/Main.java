package pkg1;

import pkg2.NewPkgClass;
import external.ExtLib;

public class Main {

	public static void main(String args[]) {
	
		System.out.println("This is Main");
		
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		Class3 c3 = new Class3();
		NewPkgClass n1 = new NewPkgClass();
		ExtLib e1 = new ExtLib();
		
		c1.print();
		c2.print();
		c3.print();
		n1.print();
		e1.print();
	}
}
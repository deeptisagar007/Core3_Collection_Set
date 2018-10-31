package com.marlabs.questions;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Demo2 demo = new Demo2();
		demo.diaplay();
		System.out.println("Main End	");
	}

}

class Demo {
	int i = 1;
}

class Demo1 extends Demo {

}

class Demo2 extends Demo1 {
	{
		i = 20;
	}

	public void diaplay() {
		System.out.println("In " + i);
	}
}
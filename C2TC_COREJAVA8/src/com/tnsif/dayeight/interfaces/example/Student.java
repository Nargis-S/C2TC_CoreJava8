package com.tnsif.dayeight.interfaces.example;

public class Student implements Coder{
	@Override
	public void rules() {
		System.out.println("Morning wakeup at "+wakeupTime);
		System.out.println("And do the program practice");
	}
}
package com.tnsif.dayeight.interfaces.example;

public class Trainer implements Coder{
	@Override
	public void rules() {
		System.out.println("Morning wake up at "+wakeupTime);
		System.out.println("And check the student program");
	}
}
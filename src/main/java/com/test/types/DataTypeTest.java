package com.test.types;

import org.testng.annotations.Test;

import com.mentorstudies.automationframework.common.TestClassUtil;

public class DataTypeTest extends TestClassUtil{

	@Test(dataProvider = "defaultDP")
	public void greet(String name, int age) {
		System.out.println("Hey " + name + ", I am Just " + age + " years Old.");
	}

	@Test(dataProvider = "defaultDP")
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	@Test(dataProvider = "defaultDP")
	public void genderTest(char gender) {
		String genderString = (gender == 'M' ? "Male" : (gender == 'F' ? "Female" : "Very Bad"));
		System.out.println("I am a " + genderString);
	}
	
	@Test(dataProvider = "defaultDP")
	public void slapTest(boolean slapme) {
		String slapMeString = slapme ? "Yes I will Slap You" : "You are so good, I can't slap You";
		System.out.println(slapMeString);
	}
	

}

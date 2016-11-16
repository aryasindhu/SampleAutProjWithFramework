package com.test.sampletestcase;

import org.testng.annotations.Test;

import com.mentorstudies.automationframework.common.TestClassUtil;

public class TestClass1 extends TestClassUtil {

	@Test
	public void test1() {
		System.out.println("Hello There ! I am Test 1.");
	}

	@Test
	public void test2() {
		System.out.println("Hello There ! I am Test 2.");
	}

	@Test
	public void test3(String greetName) {
		System.out.println("Hello There ! I am Test 3.");
	}
}

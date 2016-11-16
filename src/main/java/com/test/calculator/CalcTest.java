package com.test.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mentorstudies.automationframework.common.TestClassUtil;

public class CalcTest extends TestClassUtil {

	@Test(dataProvider = "defaultDP")
	public void add(int x, int y, int expectedSum) {

		int actualSum = x + y;
		Assert.assertEquals(actualSum, expectedSum, "Addition is Wrong");
	}

}

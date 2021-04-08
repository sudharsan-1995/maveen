package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public  class Sampletestng{
	@BeforeClass
	private void before1() {
		System.out.println("before class");

	}
	@Test(invocationCount=2)
    private void tc1() {
		System.out.println("method 1");

	}
	@Test(priority=5,invocationCount=10)
	private void tc2() {
		System.out.println("method 2");

	}
	@Test(priority=-2)
    private void tc3() {
		System.out.println("method 3");
		
}
	@Test(priority=-1)
    private void tc4() {
		System.out.println("method 4");
	}
	@Test(priority=-4)	
	private void tc5() {
		System.out.println("method 5");
	}
	@Test(priority=-3)
     private void tc6() {
	System.out.println("method 6");
	
}
	@AfterClass
	private void after() {
		System.out.println("after");
	}
}

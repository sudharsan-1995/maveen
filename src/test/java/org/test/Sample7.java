package org.test;

import org.junit.Test;

import junit.framework.Assert;

public class Sample7 {
@Test
public void test() {
	System.out.println("method1");
	
}
@Test
public void tc1() {
	System.out.println("method2");

}
@Test
public void tc2() {
	Assert.assertTrue(false);
	System.out.println("method3");
}
@Test
public void tc3() {
	Assert.assertTrue(false);
	System.out.println("method3");
}
}

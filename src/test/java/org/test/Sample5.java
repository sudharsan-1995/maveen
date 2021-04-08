package org.test;


import org.junit.Ignore;
import org.junit.Test;

public class Sample5 {

	
@Test
public void test() {
	System.out.println("method1");
	
}
@Ignore
@Test
public void tc1() {
	System.out.println("hi");

}
@Ignore
@Test
public void tc2() {
	System.out.println("hi1");
}
@Test
public void tc3() {
	System.out.println("method 4");

}
}

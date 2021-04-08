package org.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({Sample.class,Sample5.class,Sample6.class,Sample7.class,Sample8.class})
public class Suiteclass {
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(Suite.class);
		int failureCount = runClasses.getFailureCount();
		
		System.out.println("failurecount:"+failureCount);
		
		
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("ignorecount:"+ignoreCount);
		
		int runCount = runClasses.getRunCount();
		System.out.println("totalruncount:"+runCount);
		
		List<Failure> failures = runClasses.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
			
		}
	}
	
	
}

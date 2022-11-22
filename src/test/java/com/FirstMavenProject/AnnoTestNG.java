package com.FirstMavenProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnoTestNG {
	
	
	@Test
	@BeforeTest
	public void test4() {
		System.out.println("This is before test");
	}
	
	@BeforeClass
	public void test1() {
		System.out.println("This is before class");
	}
	
	
	@Test
	@BeforeMethod
	public void test6() {
		System.out.println("This is before method");
	}
	
	@Test(description="I am printing the test case name")
	public void test2() {
		System.out.println("This is Test 1");
	}
	
	@Test(dependsOnMethods="test2")
	public void test7() {
		System.out.println("This is Test 2");
	}
	
	
	@Test
	@AfterMethod
	public void test8() {
		System.out.println("This is after method");
	}
	
	
	@AfterClass
	public void test3() {
		System.out.println("This is after class");
	}
	
	
	@Test
	@AfterTest
	public void test5() {
		System.out.println("This is after test");
	}

}

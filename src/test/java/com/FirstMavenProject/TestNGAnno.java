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

public class TestNGAnno {
	
	@BeforeClass
	public void test1() {
		System.out.println("This is Before Class annotation");
	}
	
	@Test
	@BeforeTest
	public void test4() {
		System.out.println("This is Before Test annotation");
	}
	
	@Test
	@BeforeMethod
	public void test7() {
		System.out.println("This is Before Method annotation");
	}
	
	@Test
	public void test2() {
		System.out.println("This is Test 1 annotation"); // 2sec
	}
	
	@Test(dependsOnMethods = "test2")
	public void test5() {
		System.out.println("This is Test 2 annotation"); // 15min
	}
	
	@Test
	public void test6() {
		System.out.println("This is Test 3 annotation"); // 5sec
	}
	
	@Test
	@AfterMethod
	public void test8() {
		System.out.println("This is After method annotation");
	}
	
	@Test
	@AfterTest
	public void test9() {
		System.out.println("This is After Test annotation");
	}
	
	@AfterClass
	public void test3() {
		System.out.println("This is After Class annotation");
	}

}

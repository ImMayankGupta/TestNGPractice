package com.FirstMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");  
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("New York");
		
		driver.findElement(By.name("q")).submit();
		
		
		//driver.findElement(By.xpath("//h3[text()='New York City - Wikipedia']")).click();
		driver.findElement(By.xpath("//h1[text()='esuifdgweiu']")).click();
		
		driver.close();
	}

}

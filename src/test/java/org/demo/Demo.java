package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.facebook.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	//WebElement text = driver.findElement(By.id("email"));
	//text.sendKeys("Gayu");

	//WebElement pass = driver.findElement(By.id("pass"));
	//pass.sendKeys("gayu@123");
	
	//WebElement btnclick = driver.findElement(By.name("login"));
		//btnclick.click();
	
	
	
	WebElement btn = driver.findElement(By.xpath("//a[text()='Create new account']"));
	btn.click();
	
	WebElement firstuser = driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
	firstuser.sendKeys("Gayathri");

	
}
}

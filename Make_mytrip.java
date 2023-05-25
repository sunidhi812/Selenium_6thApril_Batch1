package com.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_mytrip {
	public void login() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GSUNIDHI\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div/p")).click();
		driver.findElement(By.name("username")).sendKeys("8688567917");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button/span")).click();
		driver.findElement(By.name("otp")).sendKeys("923809");
		driver.findElement()
		//C:\Users\GSUNIDHI\AppData\Local\Google\Chrome\User Data

	}
}

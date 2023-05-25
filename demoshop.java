package com.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class demoshop {
	static WebDriver driver;
	@Test(priority=1)
	public void login(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GSUNIDHI\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("sunidhigovindaswamy@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("sunidhi");
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}
	@Test(priority=2)
	public void search() {
		driver.findElement(By.id("small-searchterms")).sendKeys("Computing and Internet");
		driver.findElement(By.linkText("computing-and-internet")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-13\"]")).click();


	}
}
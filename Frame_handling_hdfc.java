package com.Demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame_handling_hdfc {

	WebDriver driver;
	@AfterTest
	public void close_browser() {
		driver.close();
		driver.quit();
	}

	@Test(priority=1,enabled=true)
	public void frame_handling_hdfc_netbanking() {

		//driver.switchTo().frame("login_page");
		//int Number_of_frames= driver.findElements(By.tagName("frame")).size();
		//System.out.println("====Number_of_frames in hdfc netbanking ====>" + Number_of_frames);
		//driver.switchTo().frame(0);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("login_page")));
		driver.findElement(By.name("fldLoginUserId")).sendKeys("123456");
		driver.switchTo().defaultContent();

		//driver.switchTo().frame("login_page");
		boolean isdisplayed_privacy_link = driver.findElement(By.linkText("Privacy Policy")).isDisplayed();
		System.out.println(isdisplayed_privacy_link);
		boolean isenabled_privacy_link = driver.findElement(By.linkText("Privacy Policy")).isEnabled();
		System.out.println(isenabled_privacy_link);
		driver.findElement(By.linkText("Privacy Policy")).click();
		String page_title= driver.getTitle();
		System.out.println(page_title);


	}




	@BeforeTest
	public void launch_browser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// by default
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		String title_hdfc= driver.getTitle();
		System.out.println(title_hdfc);
		Thread.sleep(2000);
		//Assert.assertEquals("Rediffmail", title_rediff);
		//System.out.println("rediff same title ");

	}



}
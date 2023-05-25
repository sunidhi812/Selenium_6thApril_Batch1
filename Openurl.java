package com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GSUNIDHI\\eclipse-workspace\\Selenium\\src\\Driver\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://chromedriver.storage.googleapis.com/index.html?path=113.0.5672.63/");

	}

}

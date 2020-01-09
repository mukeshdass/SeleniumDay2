package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");

		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("mukeshdass");

		WebElement uPass = driver.findElement(By.id("password"));
		uPass.sendKeys("9874461123");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@name='login']"));
		btnlogin.click();

	}

}

package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");

		WebElement sign = driver.findElement(By.xpath("//i[@id='i-icon-profile']"));
		sign.click();

		WebElement src = driver.findElement(By.id("src"));
		src.sendKeys("chennai");

		WebElement des = driver.findElement(By.id("dest"));
		des.sendKeys("Aruppukottai");
		driver.quit();

	}

}

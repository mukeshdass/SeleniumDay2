package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement chrm = driver.findElement(By.xpath("//input[@name='q']"));
		chrm.sendKeys("Greens Technology");
		
		WebElement btn = driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
		btn.click();
		//driver.quit();
		

}

}

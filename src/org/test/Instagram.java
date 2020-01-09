package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en)");
		Thread.sleep(2000);
		WebElement clickbtn = driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));
		clickbtn.click();

		WebElement usrName = driver.findElement(By.name("username"));
		usrName.sendKeys("mukeshdass");
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("mukeshdass123");
		Thread.sleep(2000);

		WebElement btnlogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnlogin.click();
	}

}

package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\SeleniumDay2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");

		WebElement btnlog = driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']"));
		btnlog.click();

		WebElement userId = driver.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']"));
		userId.sendKeys("12564745");

		WebElement uspswd = driver.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']"));
		uspswd.sendKeys("mukesh");

		WebElement btnlogin = driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']"));
		btnlogin.click();
	}

}

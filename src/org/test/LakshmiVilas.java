package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LakshmiVilas {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\SeleniumDay3\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
			WebElement txtUser = driver.findElement(By.id("navbar_username"));
			txtUser.sendKeys("mukesh");
			WebElement txtPass = driver.findElement(By.id("navbar_password"));
			txtPass.sendKeys("dfksfs");
			WebElement btn = driver.findElement(By.id("cb_cookieuser_navbar"));
			btn.click();
			WebElement loginCl = driver.findElement(By.xpath("/html/body/div[1]/div/div/table[1]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[3]/input"));
			loginCl.click();
	}

}

package testNG;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class test {
	WebDriver d;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bebom\\eclipse-workspaces-new\\testNG\\Drivers_2021\\chromedriver.exe");
		d = new ChromeDriver();

	}

	@AfterClass
	public void afterClass() {
		d.quit();

	}

	@BeforeMethod
	public void beforeMethod() {
		Date da = new Date();
		System.out.println("Start Time:" + da);

	}

	@AfterMethod
	public void afterMethod() {
		Date da = new Date();
		System.out.println("End Time :" + da);

	}

	@Test
	public void test1() {
		System.out.println("Thread ID is :" + Thread.currentThread().getId());
		d.get("https://www.facebook.com/");

		WebElement u = d.findElement(By.id("email"));
		u.sendKeys("bebom");
		WebElement p = d.findElement(By.id("pass"));
		p.sendKeys("uthy");
		WebElement l = d.findElement(By.id("loginbutton"));
		l.click();

	}

	@Test
	public void test2() {
		System.out.println("Thread ID is :" + Thread.currentThread().getId());
		d.get("https://www.facebook.com/");
		WebElement u = d.findElement(By.id("email"));
		u.sendKeys("raf");
		WebElement p = d.findElement(By.id("pass"));
		p.sendKeys("mur");
		WebElement l = d.findElement(By.id("loginbutton"));
		l.click();

	}

}

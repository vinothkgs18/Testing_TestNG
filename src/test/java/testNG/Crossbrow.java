package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrow {

	@Parameters({ "browser" })
	@Test
	public void 3(String browser) {
		WebDriver d;

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\bebom\\eclipse-workspaces-new\\testNG\\Driver\\chromedriver.exe");
			d = new ChromeDriver();
		} else {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\bebom\\eclipse-workspaces-new\\testNG\\Driver\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
		}
		d.get("https://www.facebook.com/");
	}

}

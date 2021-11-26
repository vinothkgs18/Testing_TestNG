package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@Test(groups = "Smoke")
	public void tc1() {
		System.out.println("TC-1");
	}

	@Test(groups = "Smoke")
	public void tc2() {
		System.out.println("TC-2");
	}

	@Test
	public void tc3() {
		System.out.println("TC-3");
	}

	@BeforeMethod
	public void bM() {
		System.out.println("Before Methods");
	}

	@BeforeClass
	public void bC() {
		System.out.println("Before Class");
	}

	@BeforeSuite
	public void bS() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void bT() {
		System.out.println("Before Test");
	}

	@BeforeGroups(groups = "Smoke")
	public void bG() {
		System.out.println("Before Group");
	}

	// -------------------------------------------------------

	@AfterMethod
	public void aM() {
		System.out.println("After Methods");
		System.out.println("--------------");
	}

	@AfterClass
	public void aC() {
		System.out.println("After Class");

	}

	@AfterSuite
	public void aS() {
		System.out.println("After Suite");

	}

	@AfterTest
	public void aT() {
		System.out.println("After Test");

	}

	@AfterGroups
	public void aG() {
		System.out.println("After Group");
		System.out.println("--------------");
	}

}

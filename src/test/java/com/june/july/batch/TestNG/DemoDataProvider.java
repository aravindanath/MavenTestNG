package com.june.july.batch.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider extends LaunchBrowser {
	
	@BeforeMethod
	public void openUrl() {
		driver.get("https://www.myntra.com/login");
	}
	
	
	@Test(dataProvider="getData")
	public void login(String userName, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='email']")).clear();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[2]/button")).click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[8][2];
		data[0][0] = "aravindnath.dm@myntra.com";
		data[0][1] = "myntra@123";
		data[1][0] = "ankush@myntra.com";
		data[1][1] = "myntra#123";
		data[2][0] = "lekya@myntra.com";
		data[2][1] = "myntra#123";
		data[3][0] = "prince@myntra.com";
		data[3][1] = "myntra#123";
		data[4][0] = "leyana@myntra.com";
		data[4][1] = "myntra#123";
		data[5][0] = "priyanka@myntra.com";
		data[5][1] = "myntra#123";
		data[6][0] = "kiran@myntra.com";
		data[6][1] = "myntra#123";
		data[7][1] = "richardsx@gmail.com";
		data[7][0] = "1134sf";
		return data;

		
	}
}

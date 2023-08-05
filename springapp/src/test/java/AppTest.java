package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception
	 {
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		//driver=new FirefoxDriver();
	}

	@Test
//Maximize the window
	public void maximizepage() throws InterruptedException
	{
		driver.manage().window().maximize();
	}
	/*@Test
//Moving to iamneo.ai website
	public void neopage() throws InterruptedException
	{
		driver.get("http://iamneo.ai");
		Thread.sleep(1000);
	}*/
	
	/*
	@Test
//Moving to FACEBOOK
	public void nextPage() throws InterruptedException 
	{
		 	
		 //driver.get("https://www.facebook.com/");
		 driver.navigate().to("https://www.facebook.com/");
		 Thread.sleep(1000);

	}*/
	@Test
//Back to iamNeo
	public void backPage() throws InterruptedException 
	{
		 driver.navigate().back();

	}
	@Test
//Current URL
    public void currentURL() throws InterruptedException 
	{
		System.out.println(driver.getCurrentUrl());
	}
    @Test
//Navigate Forward
    public void forwardpage() throws InterruptedException
	{
		driver.navigate().forward();
		Thread.sleep(1000);
	}
    @Test
//Reload page
    public void reloadpage() throws InterruptedException{
		driver.navigate().refresh();
		Thread.sleep(1000);
	}
	@AfterTest
//Close the Browser
	public void afterTest() 
	{
		driver.quit();
	}

}

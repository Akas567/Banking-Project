package com.gtpl.pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	public static Logger punch;;
	public static WebDriver sDriver;

	
	
@BeforeClass
public void setup()
{
	 driver=new ChromeDriver();
	 punch=LogManager.getLogger("GTPLBanking");
	 punch.info("maximize the window");
	driver.manage().window().maximize();
	punch.info("implicit wait for 20 second");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	punch.info("Login to the browser");
	driver.get("https://demo.guru99.com/V1/index.php");
	sDriver = driver;
}

@AfterClass
public void teardown()
{
	punch.info("closing the browser");
   driver.quit();
}
}
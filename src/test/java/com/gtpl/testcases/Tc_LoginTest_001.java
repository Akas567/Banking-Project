package com.gtpl.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.gtpl.pageobject.BaseClass;
import com.gtpl.pageobject.LoginPage;
import com.gtpl.utilities.ReadConfig;

@Listeners (com.gtpl.utilities.ListenersImplementationClass.class)

public class Tc_LoginTest_001 extends BaseClass { 
	
	
	
	
@Test	
public void loginTest() throws IOException
{	

	ReadConfig read=new ReadConfig();
	 String usid = read.toFetchDataFromPropertyFile("username");
	 String paswd = read.toFetchDataFromPropertyFile("password");
	
	
	 
	
String expectedtitle="GTPL Bank Manager HomePage";
 LoginPage log=new LoginPage(driver);
 punch.info("enter username");
 log.username(usid);
 punch.info("enter password");
 log.password(paswd);
 punch.info("enter login");
 log.login();
 punch.info("verify the title");
 String actualTitle = driver.getTitle();
 Assert.assertEquals(expectedtitle,actualTitle);
 punch.info("title is verified");


		


	}

}

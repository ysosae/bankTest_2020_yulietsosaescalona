package com.bankProject.testCases;


import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.bytedeco.javacpp.tools.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class BaseClass {

	public String baseURl = "http://demo.guru99.com/V1/index.php";

	public String username = "mngr288998";

	public String password = "ApadYjE";

	public static WebDriver driver;
	
	public static Logger logger;

	@BeforeClass
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();	
		
		/*logger= ("ebanking");
		PropertyConfigurator.*/
		

	}

	@AfterClass

	public void tearDown() {

		driver.close();
	}

}

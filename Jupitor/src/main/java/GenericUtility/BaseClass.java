package GenericUtility;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public FileUtility flib = new FileUtility();
	public JavaUtility jlib = new JavaUtility();
	public WebDriverutility wlib = new WebDriverutility();
	public WebDriver driver;
	@BeforeSuite(alwaysRun = true)
	public void config_BS() throws Throwable 
	{

		System.out.println("----Connect to Database----");
	}

	//@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)

	public void  config_BC() throws Throwable
	{
		String chrome;
		String BROWSER ="chrome";
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		//	WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);				
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
	
	
		System.out.println("----launch the browser---");
		String URL = "https://jupiter.cloud.planittesting.com/#/";
		driver.get(URL);
		System.out.println("----launch the browser---");
		}
	

	
	
	@AfterClass(alwaysRun = true)
	public void config_Ac()
	{

	        driver.quit(); 
	   }
	
	

	
	@AfterSuite(alwaysRun = true)
	public void config_AS() throws Throwable
	{
		System.out.println("----disconnected from Database---");
	}








}

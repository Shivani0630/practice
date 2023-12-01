package JupitorUsingPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class JupitorUsingPom extends BaseClass {
	@Test
	public void FirstTestcases()
	{
		
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		String Forename="Forename is required";
		String Email="Email is required";
		String ErrorMessage="Message is required";
		 String ele1 = driver.findElement(By.xpath("//span[@id='forename-err']")).getText();
		 String ele2 = driver.findElement(By.xpath("//span[@id='email-err']")).getText();	
		 String ele3 = driver.findElement(By.xpath("//span[@id='message-err']")).getText();
		 Assert.assertEquals(ele1,Forename);
		 Assert.assertEquals(ele2,Email);
		 Assert.assertEquals(ele3,ErrorMessage);
		 System.out.println("Error Message is verified");
		 System.out.println(ele1+" "+ele2+" "+ele3);
     	driver.findElement(By.xpath("//input[@name='forename']")).sendKeys("Shivani");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shivuishu0630@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("good application");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		String Expected="Thanks Shivani";
		String accepted = driver.findElement(By.xpath("//strong[text()='Thanks Shivani']")).getText();
		Assert.assertEquals(accepted,Expected);
		System.out.println("Errors are gone");

	}
	@Test
	public void SecondTestcase()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://jupiter.cloud.planittesting.com/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		driver.findElement(By.xpath("//input[@name='forename']")).sendKeys("Chethan");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chethan@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("bad application");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		String Expected="Thanks Chethan";
		String accepted = driver.findElement(By.xpath("//strong[text()='Thanks Chethan']")).getText();
		Assert.assertEquals(accepted,Expected);
		System.out.println("Validated Successful submission message");
	}

}



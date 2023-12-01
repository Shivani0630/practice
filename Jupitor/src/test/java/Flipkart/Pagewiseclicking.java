package Flipkart;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Pagewiseclicking {
	@Test
	public void pageflipkart()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jupiter.cloud.planittesting.com/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone14");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		  WebElement ele = driver.findElement(By.xpath("//a[@class='ge-49M _2Kfbh8']"));
//		  Actions act1 = new Actions(driver);
//			act1.moveToElement(ele).click().perform();
		  String pagenum="3";
			org.openqa.selenium.Point locPoint= ele.getLocation();
			int x = locPoint.getX();
			int y = locPoint.getY();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy("+x+","+y+")");
			WebElement page = driver.findElement(By.xpath("//a[text()='"+pagenum+"']"));
			 Actions act1 = new Actions(driver);
			act1.moveToElement(page).click().perform();
			
	}

}

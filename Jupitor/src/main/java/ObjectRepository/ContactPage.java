package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ContactPage 
{
	@FindBy(xpath = "//a[text()='Submit']")
	private WebElement submit;
	
	public ContactPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubmit() {
		return submit;
	}
	public void sumbit()
	{
		submit.click();
	}

}

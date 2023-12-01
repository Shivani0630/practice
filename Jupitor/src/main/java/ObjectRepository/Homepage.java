package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath = "//a[text()='Contact']")
	private WebElement contact;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getContact() {
		return contact;
	}
	public void contact()
	{
		contact.click();
	}

}

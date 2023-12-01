package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactErrormessagepage {
	@FindBy(xpath = "//span[@id='forename-err']")
	private WebElement firstname;
	
	@FindBy(xpath = "//span[@id='email-err']")
	private WebElement lastname;
	
	@FindBy (xpath = "//span[@id='message-err']")
	private WebElement messag;
	
public void ContactErrormessagepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getMessag() {
	return messag;
}


}

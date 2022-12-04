package Module2_Login;
//pom class 3

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomePage
{
	@FindBy(xpath = "//div[contains(text(),'No')]") private WebElement NoImGood;
	
	public UpstoxWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickUpstoxWelcomePageNoImGood() 
	{
		NoImGood.click();
	}

}

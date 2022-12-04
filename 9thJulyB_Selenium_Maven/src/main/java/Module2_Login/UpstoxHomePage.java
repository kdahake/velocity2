package Module2_Login;
//pom class 4

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePage 
{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userID;
	
	public UpstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getUpstoxHomePageActUserID() 
	{
		String text = userID.getText();
		return text;
	}
	
//	public void verifyUpstoxHomePageUserIDs(String expUserID)
//	{
//		String actUserID = userID.getText();
//		
//		if (actUserID.contains(expUserID))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//	}
	

}

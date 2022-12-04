package Module2_Login;
//pom class 1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin1Page
{
	//step1: variable declaration
	@FindBy(xpath="//input[@id='userCode']") private WebElement UN;       //private WebElement UN= driver.findElement(By.xpath(""))
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;    //private WebElement PWD= driver.findElement(By.xpath(""))
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement singnInBtn;  //private WebElement signInBtn= driver.findElement(By.xpath(""))
	
	//step2: variable initialization
	public UpstoxLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);              //diffClassName.methodName(webdriverObject, this->Keyword);
	}
	
	
	//step3: variable usage
	public void inpUpstoxLogin1PageUsername(String username) 
	{
		UN.sendKeys(username);	
	}
	
	public void inpUpstoxLogin1PagePassword(String password)
	{
		PWD.sendKeys(password);
	}
		
	public void clickUpstoxLogin1PageLoginBtn() 
	{
		singnInBtn.click();
	}

}

package LibraryFiles;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	public WebDriver driver;                //scope--->project
	public void initializeBrowser() throws IOException
	{
		
		 driver=new ChromeDriver();
		driver.get(UtilityClass.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}

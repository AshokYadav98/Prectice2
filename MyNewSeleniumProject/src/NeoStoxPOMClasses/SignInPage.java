package NeoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class SignInPage
{
	@FindBy(xpath = "(//input[@type='number'])[1]")private WebElement Textbox;
	@FindBy(xpath = "(//a[text()='Sign In'])[2]")private WebElement signinbutton;
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Entermobilenumber(WebDriver driver,String MOnum)
	{     
		 Utility.Wait(driver, 1000);
		 Textbox.sendKeys(MOnum);
		 
		 Reporter.log("Entering mobile number", true);
	}
	public void Clickonsignbutton(WebDriver driver)
	{
		Utility.Wait(driver, 1000);
		signinbutton.click();
	}

}

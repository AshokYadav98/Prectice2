package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException 
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				
	     driver.manage().window().maximize();
				
	     driver.get(("https://vctcpune.com/selenium/practice.html"));
	     
	     WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
	     
         Actions act=new Actions(driver);
	     
	     act.scrollToElement(dropdown).perform();
	     
	     
//	     Select s=new Select(dropdown);
//	     
//	     s.selectByIndex(3);
	     
	     Thread.sleep(1000);
//	     
	     driver.findElement(By.xpath("(//select[@name='dropdown-class-example']//option)[4]")).click();
	     
	     
	     
	     
	     
	    
	     
	//     act.click(dropdown).perform();
	     
//	     act.sendKeys(Keys.ARROW_DOWN).perform();
//	     Thread.sleep(1000);
//	     act.sendKeys(Keys.ARROW_DOWN).perform();
//	     Thread.sleep(1000);
//	     act.sendKeys(Keys.ARROW_DOWN).perform();
//	     Thread.sleep(1000);
//	     act.sendKeys(Keys.ENTER).perform();
//	     
	     
	     
//	     for(int i=1;i<=3;i++)
//	     {
//	    	 act.sendKeys(Keys.ARROW_DOWN).perform();
//	         Thread.sleep(1000);
//	    	 
//	     }
//	     act.sendKeys(Keys.ENTER).perform();
	     
}

}

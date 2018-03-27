package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Action.Logout_Data;

public class Logoutinspects extends Browser {
	static WebElement element=null;
	static By click=By.linkText("Constitution");
	//static driver.findElement(By.linkText("Constitution")).click();
	 //static By Cli=By.id("cd");
	 static By username=By.name(Logout_Data.username); 
	 static By pass=By.name(Logout_Data.password);
	 static By login=By.xpath(Logout_Data.login);
	 static By logout=By.xpath(Logout_Data.logout);
	 static By loginpage=By.xpath(Logout_Data.loginpage);
	 public Logoutinspects(WebDriver driver)
		{
			super();
		}
	 public static WebElement Click()
		{
			element= driver.findElement(click);
			return element;
		}
	 public static WebElement Username()
		{
			element= driver.findElement(username);
			return element;
		}
	 public static WebElement Pass()
		{
			element= driver.findElement(pass);
			return element;
		}
	 public static WebElement Login()
		{
			element= driver.findElement(login);
			return element;
		}
	 public static WebElement Logout()
		{
			element= driver.findElement(logout);
			return element;
		}
	 public static WebElement Loginpage()
		{
			element= driver.findElement(loginpage);
			return element;
		}	

}

package DevopsAssignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SeleniumGrid
{
	public WebDriver driver;
  @Parameters({"bname"})
  @Test
  public void crossBrowserTest(String bname) throws MalformedURLException, InterruptedException 
  {
	  System.out.println("RemoteWebdriver Connectivity gets Started!");
	  if(bname.equals("Chrome"))
	  {
		  
		  ChromeOptions options=new ChromeOptions();
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  System.out.println("Chrome Session Starts!");
	  }
	  else
	  {
		  if(bname.equals("Firefox"))
		  {
			  
			  FirefoxOptions options=new FirefoxOptions();
			  driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
			  System.out.println("Firefox Session Starts!");
		  }
		  else
		  {
			  if(bname.equals("Edge"))
			  {
				  
				  EdgeOptions options=new EdgeOptions();
				  driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
				  System.out.println("Edge Session Starts!");
			  }
		  }
	  }
	  System.out.println("RemoteWebDriver Connectivity Completed!");
	  Thread.sleep(6000);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(2000);
	  System.out.println("Title :" +driver.getTitle());
	  
	  driver.close();
	  
	  
  }
}

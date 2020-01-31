package inhertance_searchflight_example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	public WebDriver driver;
	   public WebDriverWait wait;
	   
	   public void lauch_browser(String browsername)
	   {
		   switch (browsername) 
		   {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
			 driver=new ChromeDriver();
			break;

		default:
			System.out.println("browser name mismatch");
			break;
		}
	   }
		   public void load_app(String url)
		   {
			   driver.get(url);
			   driver.manage().window().maximize();
			   
		   }
		   public void set_timeout(int time_in_sec)
		   {
			   driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
			   wait=new WebDriverWait(driver, time_in_sec);
		   }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
	
	public static void main(String [] args) {
		//create driver object for chrome browser
		
		//we will strictly implement methods for webdriver
		
		/*Class name = x;//create object for chrome driver 
		
		x driver = new x();*/
		//invoke.exe file first
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\chromedriver.exc");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.getTitle();
		
		
	}

}

package commonFunctions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Common_Functions {
	WebDriver driver;
	String base_url = "https://www.google.com";
	
	@BeforeTest
	public void launch_test()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(base_url);
	}

}

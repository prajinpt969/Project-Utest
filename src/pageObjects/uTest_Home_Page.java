package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class uTest_Home_Page {
WebDriver driver;

	By bat_text=By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/a");
	public uTest_Home_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void click_become_a_tester()
	{
		driver.findElement(bat_text).click();
	}

}

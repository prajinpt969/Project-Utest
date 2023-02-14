package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_Search_Page {
	WebDriver driver;
	By g_search_text=By.xpath("//*//input[@name='q']");
	By utest=By.xpath("//*//h3[text()='uTest - The Professional Network for Testers']");
	public Google_Search_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void google_search(String key_text)
	{
		driver.manage().window().maximize();
		driver.findElement(g_search_text).sendKeys(key_text,Keys.ENTER);
	}
	public void clickutest()
	{
		driver.findElement(utest).click();
	}

}

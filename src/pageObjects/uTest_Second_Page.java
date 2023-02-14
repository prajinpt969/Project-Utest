package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uTest_Second_Page {

WebDriver driver;
	
	By map=By.xpath("//button[@type='button']");
	By city=By.id("city");
	By zip=By.id("zip");
	//By country1=By.xpath("//input[@type='search']");
	By country=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]");
	By country1=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input");
	By nxtpage=By.xpath("//*[contains(text(),'Next: Devices')]");
	public uTest_Second_Page(WebDriver driver) {
		this.driver=driver;
	}
	public void textcity() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("city")));
		Thread.sleep(3000);
		driver.findElement(city).clear();
		Thread.sleep(1000);
		driver.findElement(city).sendKeys("Kakkanad Kerala, India");
		Thread.sleep(1000);
		driver.findElement(city).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(city).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(city).sendKeys(Keys.TAB);
	
	/*	List<WebElement> list = driver.findElements(By.id("city"));
		//System.out.println("Auto Suggest List ::" + list.size());
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i).getText());			
			if(list.get(i).getText().equals("Kakkanad"))
			{
				list.get(i).click();
				break;
			}
		}
	*/
	}
	public void textzip() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(zip).clear();
		driver.findElement(zip).sendKeys("682037");
		Thread.sleep(1000);
		driver.findElement(zip).sendKeys(Keys.TAB);
	}
	public void textcountry() throws InterruptedException {
		driver.findElement(country).click();
		driver.findElement(country1).sendKeys("India");
		/*List<WebElement> list = driver.findElements(country1);
		//System.out.println("Auto Suggest List ::" + list.size());
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i).getText());			
			if(list.get(i).getText().equals("India"))
			{
				list.get(i).click();
				break;
			}
		}*/
		
	//	JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,25)", "");
		
		//	driver.findElement(country).sendKeys("India",Keys.TAB);
		//  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//	wait.until(ExpectedConditions . elementToBeClickable (By.xpath("//*[contains(text(),'Next: Devices')]")));
		
			
	}
	/*public void clicksatelite() throws InterruptedException {
		System.out.println("pass4");
		Thread.sleep(2000);
		WebElement cotry=driver.findElement(country);
		Select dropdown1=new Select(cotry);
		dropdown1.selectByVisibleText("Canada");
		driver.findElement(map).click();
	}*/
	public void clickNextSecond() {
		driver.findElement(nxtpage).click();
	}
}

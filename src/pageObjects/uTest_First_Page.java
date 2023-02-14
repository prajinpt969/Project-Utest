package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class uTest_First_Page {
	WebDriver driver;
	
	By fname=By.id("firstName");
	By lname=By.id("lastName");
	By email=By.id("email");
	By month=By.xpath("//select[@id='birthMonth']");
	By monthpick=By.xpath("//*[@id=\"birthMonth\"]/option[6]");
	By day=By.xpath("//select[@id='birthDay']");
	By daypick=By.xpath("//*[@id=\"birthDay\"]/option[10]");
	By year=By.xpath("//select[@id='birthYear']");
	By yearpick=By.xpath("//*[@id=\"birthYear\"]/option[11]");
	By language=By.xpath("//*[@id=\"languages\"]/div[1]/input");
	By nxtlocation=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");
	public uTest_First_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void nameverification(String text1,String text2) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(fname).sendKeys(text1);
		driver.findElement(lname).sendKeys(text2);
	}
	public void emailverification(String text3) {
		driver.findElement(email).sendKeys(text3);
	}
	public void DateOfBirth() {
		driver.findElement(day).click();
		driver.findElement(monthpick).click();
		
		driver.findElement(day).click();
		driver.findElement(daypick).click();
		
		driver.findElement(year).click();
		driver.findElement(yearpick).click();
	}
	public void language(String text4,String text5) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(language).sendKeys(text4,Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(language).sendKeys(text5,Keys.TAB);
	}
	public void clickNextFirst() {
		driver.findElement(nxtlocation).click();
	}

}

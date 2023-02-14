package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class uTest_Third_Page {
	
WebDriver driver;
	
	By your_Mobile_device=By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span");
	By your_Mobile_device1=By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]");
	By your_model=By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]");
	By your_model1=By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div[1]/input");
	By os=By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]");
	By os1=By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div[1]/input");
	By click=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div");
	public uTest_Third_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void slctcomputr() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(your_Mobile_device).click();
		Thread.sleep(1000);
		driver.findElement(your_Mobile_device1).sendKeys("Xiaomi",Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(your_model).click();
		Thread.sleep(1000);
		driver.findElement(your_model1).sendKeys("Redmi Note 7",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(os).click();
		Thread.sleep(1000);
		driver.findElement(os1).sendKeys("Android 10",Keys.TAB);
	}
	public void clickNextThird() {
		driver.findElement(click).click();
	}

}

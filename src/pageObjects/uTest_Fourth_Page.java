package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class uTest_Fourth_Page {

	WebDriver driver;
	By pswd=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[3]/div[1]/input");
	By cpswd=By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input");
	
	By cb1=By.xpath("//*/div/div[2]/div/div[2]/div/form/div[4]/label/input");
	By cb2=By.xpath("//*/div/div[2]/div/div[2]/div/form/div[5]/label/input");
	By cb3=By.xpath("//*/div/div[2]/div/div[2]/div/form/div[6]/label/input");
	
	By fclick=By.xpath("//*/div/div[2]/div/div[2]/div/div/div/a");
	
	public uTest_Fourth_Page(WebDriver driver) {
		this.driver=driver;
	}

	public void password(String password,String cpassword) {
		driver.findElement(pswd).sendKeys(password,Keys.TAB);
		driver.findElement(cpswd).sendKeys(cpassword,Keys.TAB);
	}

	public void checkbox() {
		driver.findElement(cb1).click();
		driver.findElement(cb2).click();
		driver.findElement(cb3).click();
	}

	public void finalclick() {
		driver.findElement(fclick).click();
		
	}
}

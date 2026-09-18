package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_Code.Base_Class;

public class ActionClass extends Base_Class  {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		HitUrl("https://www.amazon.in/");
		
		Actions  act = new Actions(driver);
		WebElement TD = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		act.moveToElement(TD).click().build().perform();
		act.moveToElement(TD).contextClick().build().perform();
		
		WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		act.moveToElement(search).click().sendKeys("mobile").doubleClick().build().perform();
		
		// keyboard action
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		 
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
	}

}

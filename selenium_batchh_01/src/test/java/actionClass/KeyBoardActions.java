package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_Code.Base_Class;

public class KeyBoardActions extends Base_Class{

	public static void main(String[] args) throws InterruptedException {

		launch_browser("chrome");
		HitUrl("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id=\"_R_1h6kqsqppb6amH1_\"]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(email).click().sendKeys("abcd").build().perform();
		
		//Keyboard actions
		
		//page down hote yani⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣⇣
		//act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		driver.findElement(By.xpath("(//div[@role=\"button\"])[1]")).click();
		
		
		
	}

}

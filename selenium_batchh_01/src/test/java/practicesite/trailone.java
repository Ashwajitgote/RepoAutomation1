package practicesite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

import dynamic_Code.Base_Class;

public class trailone extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		HitUrl("https://the-internet.herokuapp.com/");
		//Actions abc = new Actions(driver);

		Thread.sleep(3000);
		WebElement RN = driver.findElement(By.xpath("//a[text()='Dynamic Loading']"));
		RN.click();

		Thread.sleep(3000);
		WebElement BM = driver.findElement(By.cssSelector("a[href=\"/dynamic_loading/1\"]"));
		BM.click();

		Thread.sleep(3000);
		WebElement KP = driver.findElement(By.cssSelector("#start button"));
		KP.click();
	}

}

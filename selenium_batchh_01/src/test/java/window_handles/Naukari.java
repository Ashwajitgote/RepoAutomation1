package window_handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import dynamic_Code.Base_Class;

public class Naukari extends Base_Class {

	public static void main(String[] args) {

		launch_browser("chrome");
		HitUrl("https://www.naukri.com/");

		JavascriptExecutor("window.scrollBy(0,document.body.scrollHeight)");

		driver.findElement(By.xpath("//a[text()='About us']")).click();

		Set<String> window_id = driver.getWindowHandles();

		Iterator<String> id = window_id.iterator();

		String parent_id = id.next();
		System.out.println("the parent id is as:" + parent_id);

		String child_id = id.next();
		System.out.println("the child id is as:" + child_id);

		driver.switchTo().window(child_id);
		driver.findElement(By.xpath("//a[text()='LEARN MORE']")).click();

		driver.switchTo().window(parent_id);
		driver.findElement(By.xpath("//a[text()='Careers']")).click();

	}

}

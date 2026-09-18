package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import dynamic_Code.Base_Class;

public class Alerts extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		HitUrl("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
		Alert SA = driver.switchTo().alert();
		System.out.println(SA.getText());
		Thread.sleep(3000);
		SA.accept();
		
		System.out.println("----------------------------");
		
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Alert CA = driver.switchTo().alert();
		System.out.println(CA.getText());
		Thread.sleep(3000);
		CA.dismiss();
		
		System.out.println("--------------------------");
		
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Alert PA = driver.switchTo().alert();
		System.out.println(PA.getText());
		Thread.sleep(3000);
		PA.sendKeys("i'm tester");
		PA.accept();

	}

}

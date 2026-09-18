package practice_test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_Code.Base_Class;

public class Real_test extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		HitUrl("https://www.saucedemo.com/");

		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		username.click();
		username.sendKeys("standard_user");

		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.click();
		pass.sendKeys("secret_sauce");

		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();

		Thread.sleep(3000);
		WebElement cart = driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		cart.click();
		// to scroll
		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)\r\n" + "");

		Thread.sleep(3000);
		WebElement second_cart = driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
		second_cart.click();

		js.executeScript("window.scrollTo(0,0)\r\n" + "");

		WebElement cartop = driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"] "));
		cartop.click();

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);
		WebElement checkout = driver.findElement(By.xpath("//button[@id=\"checkout\"]"));
		checkout.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id=\"first-name\"]"));
		name.click();
		name.sendKeys("ashwajit");
		
		WebElement name1 = driver.findElement(By.xpath("//input[@id=\"last-name\"]"));
		name1.click();
		name1.sendKeys("alex");
		
		WebElement code = driver.findElement(By.xpath("//input[@id=\"postal-code\"]"));
		code.click();
		code.sendKeys("55210");
		
		WebElement con = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		con.click();
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement finish = driver.findElement(By.xpath("//button[@id=\"finish\"]"));
		finish.click();
	}

}

package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartusedWebElementMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		driver.get("https://affiliate.flipkart.com/login");
		WebElement email = driver.findElement(By.cssSelector("input#inputEmail"));
		email.click();
		email.sendKeys("amey12@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.click();
		pass.sendKeys("123654");

		WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
		login.click();

		System.out.println(email.getAttribute("value"));

		System.out.println(pass.getAttribute("type"));

		System.out.println(login.getLocation().x);
		System.out.println(login.getLocation().y);
		System.out.println(pass.getLocation().x);
		System.out.println(pass.getLocation().y);

		System.out.println(login.getSize());

		System.out.println(login.getTagName());

		System.out.println(login.isDisplayed());

		System.out.println(login.isEnabled());

		System.out.println(login.isSelected());

	}

}

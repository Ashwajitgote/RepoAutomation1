package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");

		// id()
		driver.findElement(By.id("nav-flyout-anchor"));

		// Name()
		driver.findElement(By.name("legalEUAtf"));

		// className
		driver.findElement(By.className("value"));

		// linkTest
		driver.findElement(By.linkText("Today's Deal"));

		// Partial Linktest
		driver.findElement(By.partialLinkText("prelo"));

		// css ( cascading style sheet
		// tagname and id value
		driver.findElement(By.cssSelector("div#nav-main"));

		// tagname and classvalue
		driver.findElement(By.cssSelector("div.nav-sprite.nav-progressive-atrribute"));

		// tagname and atrribute
		driver.findElement(By.cssSelector("form[action=\"/s/ref=nb-sb-noss\"]"));

		// tagname and multiple value
		driver.findElement(By.cssSelector("form[action=\"/s/ref=nb-sb-noss\"][role=\"search\"]"));

	}

}

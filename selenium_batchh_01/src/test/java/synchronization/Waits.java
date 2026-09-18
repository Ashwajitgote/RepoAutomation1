package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// to maximize window
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/vivo-v60-5g-mist-gray-256-gb/p/itmf7d9e4b7bf0b2?pid=MOBHEGQSNBQAUVG3&lid=LSTMOBHEGQSNBQAUVG3ZUSIYH&marketplace=FLIPKART");
		String source = driver.getPageSource();
		System.out.println(source);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		// explicit web driver wait

		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.visibilityOfElementLocated("by locator"));

		// fluentwait

		// FluentWait<WebDriver>wait = new
		// FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchFieldException.class);

	}

}

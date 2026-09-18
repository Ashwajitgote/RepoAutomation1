package dynamic_Code;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Base_Class {
	public static WebDriver driver;

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
			    
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	}

	public static void HitUrl(String Url) {
		driver.get(Url);

		System.out.println("the title of the webpage is as:" + driver.getTitle());
	}

	public static void TakeScreenShot(String ScreenShot_name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./Screenshot/" + ScreenShot_name + ".png");
		org.openqa.selenium.io.FileHandler.copy(source, target);
	}

	public static void JavascriptExecutor(String scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scroll);
	}

}

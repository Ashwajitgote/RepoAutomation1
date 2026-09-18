package dynamic_Code;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicRobotClass {

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

	public static void robot(By locator, String path) throws Throwable {

		driver.findElement(locator).click();

		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		Robot r = new Robot();

		r.delay(3000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.delay(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}

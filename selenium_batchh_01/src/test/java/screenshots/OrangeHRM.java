package screenshots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamic_Code.Base_Class;

public class OrangeHRM extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./Screenshot/launchbrowserss.png");

		FileHandler.copy(source, target);

		HitUrl("https://mvnrepository.com/");

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);

		File target1 = new File("./Screenshot/HitUrlss1.png");

		FileHandler.copy(source1, target1);

		launch_browser("edge");
		HitUrl("https://www.fastrack.in/product/fastrack-jupiter-r3-smart-watch-with-black-silicone-strap-38204pp01k.html");
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);

		File target2 = new File("./ScreenShot/HitUrlss2.png");

		FileHandler.copy(source2, target2);
	}

}

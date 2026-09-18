package javaSE;

import org.openqa.selenium.JavascriptExecutor;

import dynamic_Code.Base_Class;

public class JavaScriptExecutor extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		HitUrl("https://www.railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);
		// To refresh
		js.executeScript("window.history.go(0)");

		Thread.sleep(3000);
		// To Back
		js.executeScript("window.history.back()");

		Thread.sleep(3000);
		// To forward
		js.executeScript("window.history.forward()");

		Thread.sleep(3000);
		// to top
		js.executeScript("window.scrollTo(0,0)");

	}

}

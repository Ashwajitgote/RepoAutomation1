package automateWebApp;

import dynamic_Code.Base_Class;

public class OrangeHRM extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");

		HitUrl("https://www.flipkart.com/");

		TakeScreenShot("ss4");

		launch_browser("chrome");
		HitUrl("https://www.siteofsites.co/?p=1");
		TakeScreenShot("ss5");
		JavascriptExecutor("window.scrollBy(0,document.body.scrollHeight)");

	}

}

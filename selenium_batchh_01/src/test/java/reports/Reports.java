package reports;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_Code.Base_Class;

public class Reports extends Base_Class {

	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) throws Throwable {

		ExtentSparkReporter ESR = new ExtentSparkReporter(projectpath+"\\Reports\\generatedReports2\\");

		ESR.config().setDocumentTitle("Automation report");
		ESR.config().setReportName("testing report");
		ESR.config().setTheme(Theme.STANDARD);

		// system configuration set
		ExtentReports ER = new ExtentReports();
		ER.attachReporter(ESR);
		ER.setSystemInfo("OS", "window");
		ER.setSystemInfo("browser", "chrome");
		ER.setSystemInfo("domain", "Ecommerce domain");
		ER.setSystemInfo("application", "amazon");
		ER.setSystemInfo("client", "amazonclient");
		ER.setSystemInfo("Qa", "Ashwajit");

		// Extent Test -- it create the test cases
		ExtentTest ET = ER.createTest("HitUrl");
		ET.log(Status.INFO, "amzon Url");

		ExtentTest ET1 = ER.createTest("search functionality");
		ET1.log(Status.PASS, "Test Pass");

		ExtentTest ET2 = ER.createTest("send data");
		ET2.log(Status.FAIL, "Test failed");

		ExtentTest ET3 = ER.createTest("clicked on search button");
		ET3.log(Status.SKIP, "amazon Url");

		launch_browser("chrome");
		HitUrl("https://www.amazon.in/");

		TakeScreenShot("Reportss1");
		ET.addScreenCaptureFromPath(projectpath+"/Screenshot/Reportss1/"+"png");
		
		ER.flush();

	}

}

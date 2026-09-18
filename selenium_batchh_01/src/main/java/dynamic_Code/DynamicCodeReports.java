package dynamic_Code;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicCodeReports {

	public static String projectpath = System.getProperty("user.dir");
	public static ExtentTest ET;
	public static ExtentReports ER;
	static public WebDriver driver;

	public static void reports(String DocTitle, String ReportName, String App, String ClientName) {

		ExtentSparkReporter ESR = new ExtentSparkReporter(projectpath + "\\Reports\\generatedReports\\Report.html");

		// Configuration set
		ESR.config().setDocumentTitle(DocTitle);
		ESR.config().setReportName(ReportName);
		ESR.config().setTheme(Theme.STANDARD);

		// System configuration set
		ER = new ExtentReports();
		ER.attachReporter(ESR);

		ER.setSystemInfo("OS", "Window");
		ER.setSystemInfo("Browser", "Chrome");
		ER.setSystemInfo("Domail", "Ecommerce Domain");
		ER.setSystemInfo("Application", "App");
		ER.setSystemInfo("Client", "ClientName");
		ER.setSystemInfo("QA", "Harsha");

	}

	public static void testCases(String testname, String testinfo ,String ScreenShot_name) {

		ET = ER.createTest(testname);
		ET.log(Status.INFO, testinfo);
      
		ET.addScreenCaptureFromPath(projectpath+"\\Reports\\"+ScreenShot_name+".png");
	}

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		}

		System.out.println("The browser launched is as:" + browser);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	public static void HitUrl(String url) {

		driver.get(url);
		System.out.println("The title of webpaage is as :" + driver.getTitle());
	}


	










}


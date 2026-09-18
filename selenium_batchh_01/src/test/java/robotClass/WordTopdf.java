package robotClass;

import org.openqa.selenium.By;

import dynamic_Code.DynamicRobotClass;

public class WordTopdf extends DynamicRobotClass {

	public static void main(String[] args) throws Throwable {
 launch_browser("chrome");
		HitUrl("https://www.ilovepdf.com/word_to_pdf");
		robot(By.xpath("//a[@id=\"pickfiles\"]"), "\"C:\\Users\\hp\\Downloads\\Ashwajit_Gote_Tester_Resume.docx\"");
	}

}

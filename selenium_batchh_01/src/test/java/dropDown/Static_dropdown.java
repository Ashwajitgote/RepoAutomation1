package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dynamic_Code.Base_Class;

public class Static_dropdown extends Base_Class {

	public static void main(String[] args) {

		launch_browser("chrome");
		HitUrl("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");

		JavascriptExecutor("window.scrollBy(0,500)");

		WebElement gender = driver.findElement(By.cssSelector("input#female"));
		gender.click();

		WebElement month = driver.findElement(By.cssSelector("select#dob_month"));
		month.click();
		Select s = new Select(month);
		s.selectByIndex(3);

		WebElement date = driver.findElement(By.cssSelector("select#dob_date"));
		date.click();
		Select s1 = new Select(date);
		s1.selectByIndex(14);

		WebElement year = driver.findElement(By.cssSelector("select#dob_year"));
		year.click();
		Select s2 = new Select(year);
		s2.deselectByIndex(1930);

	}

}

package synchronization;
                                                                           // practice 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicLoading {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.cssSelector("#start button")).click();
		WebDriverWait driver1 = new WebDriverWait(driver, Duration.ofSeconds(7));
		WebElement finishText = driver1.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		System.out.println(finishText.getText());
		
        
     
		
		
		//System.out.println(finishText.getText());
		//driver.findElement(By.id("finish")).getText();
		//WebElement finishText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// driver.findElement(By.cssSelector("#start button")).click();

	}

}

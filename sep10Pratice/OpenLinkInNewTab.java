package sep10Pratice;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkInNewTab {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.com");
		WebElement eleSearch = driver.findElement(By.name("q"));
		eleSearch.sendKeys("Selenium testing tutorial");
		eleSearch.sendKeys(Keys.ENTER);
		
		WebElement eleLink = driver.findElement(By.xpath("//h3[text()='Selenium Tutorial - Javatpoint']"));

		//open the link in new tab
		Actions actions = new Actions(driver); 
		actions.keyDown(Keys.LEFT_CONTROL) 
		       .click(eleLink) 
		       .keyUp(Keys.LEFT_CONTROL) 
		       .build() 
		       .perform(); 
		
		driver.close();

	}

}

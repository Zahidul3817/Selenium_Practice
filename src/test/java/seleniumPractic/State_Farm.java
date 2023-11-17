package seleniumPractic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class State_Farm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.statefarm.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='quote-main-zip-code-input']")).sendKeys("12345");
		driver.findElement(By.id("quote-main-zip-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Insurance")).click();

	}

}

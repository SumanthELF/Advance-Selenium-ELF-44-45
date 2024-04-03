package demo.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		driver.findElement(By.id("vertical-tab-0")).click();

		driver.findElement(By.id("fl_email")).sendKeys("sanjana12@gmail.com");
		driver.findElement(By.id("fl_password")).sendKeys("Abcd1234#");
		driver.findElement(By.className("MuiButton-label")).click();

		driver.findElement(By.xpath("//div[text()='s']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		driver.findElement(By.cssSelector("button[tabindex='0'")).click();

	}
}

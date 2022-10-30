package mavenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Access_FaceBookTest {
	
	@Test

	public void mOne() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Program successfully completed");
		driver.close();

	}

}

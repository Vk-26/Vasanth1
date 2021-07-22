package Org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenBrowserLaunch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishnu Vardhan\\eclipse-workspace\\Mavensample1\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement searchbox = driver.findElement(By.id("search"));
		searchbox.sendKeys("Maven launch");
		WebElement Btnclick = driver.findElement(By.id("search-icon-legacy"));
		Btnclick.click();
	}

}

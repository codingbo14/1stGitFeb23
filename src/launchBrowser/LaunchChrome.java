package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		// Scanner snc = new Scanner(System.in);

		// lunch chrome
		WebDriver driver = new ChromeDriver();
		// fetch website
		driver.get("https://www.google.com/");
		// maximize browser
		driver.manage().window().maximize();
		
	
		// type selenium
		driver.findElement(By.name("q")).sendKeys("selenium");
		//click search button
		Thread.sleep(3000);
		//closes browser
		driver.close();
		
	}

}

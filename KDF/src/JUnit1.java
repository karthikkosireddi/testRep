import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit1 {

	public static void main(String[] args) throws InterruptedException {


		// Southwest Airlines
		System.out.println("Start my Test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Training\\SDET-Nov2019\\KDF\\Drivers\\chromedriver.exe");

		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize(); 
		myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		myD.navigate().to("https://southwest.com/");
		
		
		// TC 001
		Thread.sleep(2000);
		
	    myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();

	    myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).click();

	    // myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("BOS");

	    myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();

	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();
	  
	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();


		// TC 002
		
	    myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();

	    myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).click();

	    // myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("LAX");

	    myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();

	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();
	  
	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();

	    
	    System.out.println("End my Test");
	}

}

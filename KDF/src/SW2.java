import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SW2 {
	WebDriver myD;

	@Before // Gets executed before every test
	public void myBeforeTest() throws InterruptedException {
		System.out.println(">>>>>>>>> This is BEFORE my Test");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Training\\SDET-Nov2019\\KDF\\Drivers\\chromedriver.exe");
		myD = new ChromeDriver();
		myD.manage().window().maximize(); 
		myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		myD.navigate().to("https://southwest.com/");
		
		Thread.sleep(2000);

	}
	
	@Test // This is one of my tests 
	public void myTest1() {
		System.out.println("This is My Test1 ");

	    myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();

	    myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).click();

	    // myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("BOS");

	    myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();

	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();
	  
	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();


	}
	
	@Test // This is one of my tests 
	public void myTest2() {

		System.out.println("This is My Test2 ");

	    myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();

	    myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).click();

	    // myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("LAX");

	    myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();

	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();
	  
	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();


	}
	
	@Test // This is one of my tests 
	public void myTest3() {

		System.out.println("This is My Test3 ");

	    myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();

	    myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).click();

	    // myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("EWR");

	    myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();

	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();
	  
	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();


	}
	
	@Test // This is one of my tests 
	public void myTest4() {
		System.out.println("This is My Test4 ");

	    myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).click();

	    myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).click();

	    // myD.findElement(By.cssSelector(".swa-g-selected:nth-child(1)")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("ASDSDF");

	    myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();

	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();
	  
	    myD.findElement(By.cssSelector(".swa-icon_plus-circle > .swa-icon--icon")).click();

	    myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();


	}
	
	@After // This gets executed after each test
	public void myAfterTest() {
		myD.quit();
		System.out.println("This is After my Test");
	}

}

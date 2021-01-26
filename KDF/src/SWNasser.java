import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWNasser {
	WebDriver myD;
	@Before // Gets executed before every test
	public void myBeforeTest() throws InterruptedException {
		System.out.println(">>>>>>>>> This is BEFORE my Test");

		//System.setProperty("webdriver.chrome.driver", "C:\\Training\\SDET-Nov2019\\KDF\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasser\\eclipse-workspace\\Drivers\\chromedriver.exe");
		myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		myD.navigate().to("https://southwest.com/");

		Thread.sleep(2000);
		System.out.println("End of Before");
	}

	@Test // This is one of my tests, with Dallas and SFO as inputs
	public void myTest1() throws InterruptedException {
		System.out.println(" This is one of my tests, with Dallas and SFO as inputs");

		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("tex");
		Thread.sleep(2000);
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode--item-3")).click();

		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("sfo");
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode--item-1")).click();

		myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
		myD.findElement(By.xpath("//ul[@id='LandingAirBookingSearchForm_adultPassengersCount--menu']/li[6]/button[@type='button']")).click();
		myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();

	}

	@Test // This is one of my tests, trying to select departure and return dates
	public void myTest2() throws InterruptedException {
		System.out.println("This is one of my tests, trying to select departure and return dates ");
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("tex");
		Thread.sleep(2000);
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode--item-3")).click();


		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("sfo");
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode--item-1")).click();

		myD.findElement(By.id("LandingAirBookingSearchForm_departureDate")).click();
		myD.findElement(By.id("LandingAirBookingSearchForm_departureDate")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_departureDate")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("calendar-112-2020-11-16")).click();

		myD.findElement(By.id("LandingAirBookingSearchForm_returnDate")).click();
		myD.findElement(By.id("LandingAirBookingSearchForm_returnDate")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_returnDate")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("calendar-115-2020-12-23")).click();
				
		Thread.sleep(7000);
		myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
		Thread.sleep(7000);
		myD.findElement(By.xpath("//ul[@id='LandingAirBookingSearchForm_adultPassengersCount--menu']/li[6]/button[@type='button']")).click();
		myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();
	}

	@Test // This is one of my tests with CHicago and Panama City as inputs and increasing adults count by 2
	public void myTest3() throws InterruptedException {
		System.out.println("This is one of my tests with CHicago and Panama City as inputs and increasing adults count by 2 ");
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("ind");
		Thread.sleep(2000);
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode--item-1")).click();


		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("pen");
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode--item-2")).click();

		myD.findElement(By.id("LandingAirBookingSearchForm_departureDate")).click();
		myD.findElement(By.id("LandingAirBookingSearchForm_departureDate")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_departureDate")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("calendar-112-2020-11-18")).click();
		

		myD.findElement(By.id("LandingAirBookingSearchForm_returnDate")).click();
		myD.findElement(By.xpath("//div[@class='swa-app-layout']//div[@class='print-mode--application']/div[2]/div[4]/div[@class='flyout-portal']/div[@role='tooltip']/div/div//div[@class='calendar']//button[@class='actionable actionable_button actionable_icon-only actionable_light button calendar-controls--button calendar-controls--next']/span[@role='presentation']/span[@role='presentation']")).click();
		myD.findElement(By.id("LandingAirBookingSearchForm_returnDate")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_returnDate")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("calendar-115-2021-01-10")).click();	
				
		Thread.sleep(4000);
		myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
		myD.findElement(By.xpath("//ul[@id='LandingAirBookingSearchForm_adultPassengersCount--menu']/li[2]/button[@type='button']")).click();
		myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();

	}

	@Test // This is one of my tests with Nashville and Philadelphia as inputs
	public void myTest4() throws InterruptedException {
		System.out.println("This is one of my tests with Nashville and Philadelphia as inputs ");
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode")).sendKeys("ill");
		Thread.sleep(2000);
		myD.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode--item-4")).click();
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.CONTROL + "a");
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys(Keys.DELETE);
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode")).sendKeys("ind");
		myD.findElement(By.id("LandingAirBookingSearchForm_destinationAirportCode--item-2")).click();

		myD.findElement(By.id("LandingAirBookingSearchForm_adultPassengersCount")).click();
		myD.findElement(By.xpath("//ul[@id='LandingAirBookingSearchForm_adultPassengersCount--menu']/li[1]/button[@type='button']")).click();
		myD.findElement(By.id("LandingAirBookingSearchForm_submit-button")).click();

	}

	@After // This gets executed after each test
	public void myAfterTest() {
		myD.quit();
		System.out.println("This is After my Test");
	}

}

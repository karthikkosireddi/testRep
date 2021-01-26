import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExecutor {
	static WebDriver myD;

	public static String runTestStep(String fKW, String fEID, String fTD) throws Exception{
		String testOutput;
		// myD = fDriver;
		/*
		if (fKW.equals("openBrowser")) {
			openBrowser(fTD);
		}
			else if (fKW.equals("closeBrowser")) {
				closeBrowser();
			} 
				else if (fKW.equals("navigateBrowser")) {
					navigateBrowser(fTD);
				} 
		} 
		*/
		testOutput = "Nothing";
		switch (fKW) {
			case "openBrowser" :
				openBrowser(fTD);
				break;
				
			case "closeBrowser" :
				closeBrowser();
				break;
				
			case "navigateBrowser" :
				navigateBrowser(fTD);
				break;
				
			case "typeText" :
				typeText(fEID, fTD);
				break;
				
			case "clickElement" :
				clickElement(fEID);
				break;
				
			case "clickLink" :
				clickLink(fTD);
				break;
			
			case "verifyText" :
				testOutput = verifyText(fEID, fTD);
				break;
				
			default :
				System.out.println("Keyword is missing " + fKW);
		}
		return testOutput;
	}
		
	public static void openBrowser(String browserType) {
	
		 //System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nasser\\eclipse-workspace\\Drivers\\chromedriver.exe");
		
		
		 myD = new ChromeDriver();
			 
	}
	
	public static void navigateBrowser(String fURL) {
		myD.navigate().to(fURL);
	}
	
	public static void closeBrowser() {
		myD.close();
	}
	
	public static void typeText(String fEID, String fText) {
		myD.findElement(By.xpath(fEID)).clear();
		myD.findElement(By.xpath(fEID)).sendKeys(fText);
	}
	
	public static void clickElement(String fEID) {
		myD.findElement(By.xpath(fEID)).click();
	}
	
	public static void clickLink(String fLinkText) {
		myD.findElement(By.linkText(fLinkText)).click();
	}

	public static String verifyText(String fEID, String fText) throws Exception{
		Thread.sleep(3000);
		if (fText.equals(myD.findElement(By.xpath(fEID)).getText())){
			return "Pass";
		} else {
			return "Fail";
		}
	}
	
	public static void takeAScreenShot(String tcID, String tsID) throws IOException {
		File scrFile = ((TakesScreenshot)myD).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\Nasser\\git\\TestGit\\firstWebProj\\" + tcID + "_" + tsID + ".png"));
		com.google.common.io.Files.copy(scrFile, new File("C:\\Users\\Nasser\\git\\TestGit\\firstWebProj\\ScrnShot\\" + tcID + "_" + tsID + ".png"));
	}
}

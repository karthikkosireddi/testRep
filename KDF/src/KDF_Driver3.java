import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KDF_Driver3 {
	// Global Class Variables
	String xTC[][], xTS[][]; 
	String xlPath = "C:\\Training\\SDET-Nov2019\\KDF\\KDF2.xls";
	int xTC_r, xTS_r;
	String vTCID, vTC_Execute;
	String vTSID, vTS_KW, vTS_EID, vTS_TestData; 
	
	@Before
	public void myBefore() throws Exception{
		
		// Read the Excel into a 2D Array of type string 
		System.out.println("~~~~~~~~~ STARTING TO READ EXCEL ~~~~~~~~~~~~~ ");
		xTC = Utilities.readXL(xlPath, "TestCases");
		xTS = Utilities.readXL(xlPath, "TestSteps");
		
		xTC_r = xTC.length;
		System.out.println("     >>> Number of Test Cases : " + xTC_r);
		
		xTS_r = xTS.length;
		System.out.println("     >>> Number of Test Steps : " + xTS_r);
		
		System.out.println("~~~~~~~~~ DONE READING EXCEL ~~~~~~~~~~~~~ ");
	}
	
	@Test
	public void myTest(){
		System.out.println("~~~~~~~~~ STARTING TO RUN MAIN TEST ~~~~~~~~~~~~~ ");
		
		
		// Go through Each row Test Case. [MAIN TEST]
		for (int i = 1; i<xTC_r ; i++) {
			
			// See if Execute is Y
			vTCID = xTC[i][0];
			vTC_Execute = xTC[i][3];
			if (vTC_Execute.equalsIgnoreCase("Y")) {
				System.out.println("-------- Now executing for" + vTCID);
				//Then, go to each row in Test Steps
				for (int j = 0; j < xTS_r ; j++) { 
					// load TS variables
					vTSID = xTS[j][0];
					vTS_KW = xTS[j][3]; 
					vTS_EID = xTS[j][4];
					vTS_TestData = xTS[j][5];
					
					//See for a matching TCID 
					if (vTCID.equals(vTSID)) {
						System.out.println("    --- Keyword is " + vTS_KW);
						SeleniumExecutor.runTestStep(vTS_KW, vTS_EID, vTS_TestData);
					}
				}

			} else {
				System.out.println("-------- SKIPPING FOR : " +vTCID);
			}
					
		}		

		
		
		System.out.println("~~~~~~~~~ DONE RUNNING MAIN TEST ~~~~~~~~~~~~~ ");
	}
	
	@After
	public void mAfter(){
		System.out.println("~~~~~~~~~ STARTING TO WRITE EXCEL ~~~~~~~~~~~~~ ");
		
		
		System.out.println("~~~~~~~~~ DONE WRITING EXCEL ~~~~~~~~~~~~~ ");
	}
	
}

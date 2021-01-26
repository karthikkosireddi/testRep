import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HF1 {
	// Global Class Variables
	String xTC[][], xTS[][], xEMap[][], xTD[][]; 
	String xlPath = "C:\\Users\\Nasser\\git\\TestGit\\firstWebProj\\ExelFiles\\HF1.xls";
	String xlPath_Res1 = "C:\\Users\\Nasser\\git\\TestGit\\firstWebProj\\ExelFiles\\HF1_Res_TS.xls";
	String xlPath_Res2 = "C:\\Users\\Nasser\\git\\TestGit\\firstWebProj\\ExelFiles\\HF1_Res_TC.xls";
	int xTC_r, xTS_r, xEMap_r, xTD_r;
	String vTCID, vTC_Execute;
	String vTSID, vTS_KW, vTS_EID, vTS_TestData; 
	String testOutput, tcResult, tsResult;
	long tsTime, sTime, eTime;
	
	@Before
	public void myBefore() throws Exception{
		
		// Read the Excel into a 2D Array of type string 
		System.out.println("~~~~~~~~~ STARTING TO READ EXCEL ~~~~~~~~~~~~~ ");
		xTC = Utilities.readXL(xlPath, "TestCases");
		xTS = Utilities.readXL(xlPath, "TestSteps");
		xTD = Utilities.readXL(xlPath, "TestData");
		xEMap = Utilities.readXL(xlPath, "ElementMap");
		
		xTC_r = xTC.length;
		System.out.println("     >>> Number of Test Cases : " + xTC_r);
		
		xTS_r = xTS.length;
		System.out.println("     >>> Number of Test Steps : " + xTS_r);
		
		xTD_r = xTD.length;
		System.out.println("     >>> Number of Test Data : " + xTD_r);
		
		xEMap_r = xEMap.length;
		System.out.println("     >>> Number of Elements are : " + xEMap_r);
		
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
				tcResult = "Pass";
				System.out.println("-------- Now executing for" + vTCID);
				//Then, go to each row in Test Steps
				for (int j = 0; j < xTS_r ; j++) { 
					// load TS variables
					vTSID = xTS[j][0];
					//vTS_KW = xTS[j][3]; 
					//vTS_EID = xTS[j][4];
					//vTS_EID = getEID(xTS[j][4]);
					//vTS_TestData = xTS[j][5];
					
					//See for a matching TCID 
					if (vTCID.equals(vTSID)) {
						vTS_KW = xTS[j][3]; 
						//vTS_EID = xTS[j][4];
						vTS_EID = getEID(xTS[j][4]);
						vTS_TestData = getTD(xTS[j][5]);
						tsResult = "Pass";
						sTime = System.currentTimeMillis();
						System.out.println("    --- Keyword is " + vTS_KW);
						try {
							testOutput = SeleniumExecutor.runTestStep(vTS_KW, vTS_EID, vTS_TestData);
							if (testOutput.equals("Fail")) {
								tcResult = "Fail";
								tsResult = "Fail";
								xTS[j][6] = "Verification Error : ";
							}
						} catch (Exception e) {
							System.out.println(">>>> Error " + e);
							xTC[i][5] = "Fail";
							xTS[j][8] = "Fail";
							xTS[j][6] = "Error : " + e;
						}
						xTC[i][5] = tcResult;
						xTS[j][8] = tsResult;
						eTime = System.currentTimeMillis();
						xTS[j][10] = String.valueOf((eTime - sTime)/1000);
					}
				}

			} else {
				System.out.println("-------- SKIPPING FOR : " +vTCID);
			}
					
		}		

		
		
		System.out.println("~~~~~~~~~ DONE RUNNING MAIN TEST ~~~~~~~~~~~~~ ");
	}
	
	@After
	public void mAfter() throws Exception{
		System.out.println("~~~~~~~~~ STARTING TO WRITE EXCEL ~~~~~~~~~~~~~ ");
		Utilities.writeXL(xlPath_Res1, "TestSteps", xTS);
		Utilities.writeXL(xlPath_Res2, "TestCases", xTC);
		
		System.out.println("~~~~~~~~~ DONE WRITING EXCEL ~~~~~~~~~~~~~ ");
	}
	
	public String getEID(String fEID) {
		for (int a = 1; a < xEMap_r ; a++) {
			if (fEID.equals(xEMap[a][1])) {
				return xEMap[a][2];
			}
		}	
		return fEID;
	}
	
	public String getTD(String fTD) {
		for (int b = 1; b < xTD_r ; b++) {
			if (fTD.equals(xTD[b][0])) {
				return xTD[b][1];
			}
		}	
		return fTD;
	}
	
}

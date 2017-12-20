package Xero;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;


public class XeroDriver {

	static WebDriver driver;
	public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		String dtTablePath = "/Users/Keerthi/Desktop/TestSuit.xls";

		String[][] recData = XeroReUsMethods.readExcel(dtTablePath, "Sheet1");
		String testCase, flag, firefox, chrome;
		for(int i = 1; i <recData.length; i++)
		{
			
			   flag = recData[i][1];
			   if(flag.equalsIgnoreCase("Y"))
			   {
				   firefox = recData[i][3];
				   if(firefox.equalsIgnoreCase("Y"))
				   {
					   testCase = recData[i][2];
					   XeroReUsMethods.startReport(testCase, "/Users/Keerthi/Documents/Dec192017/Report/");
					   System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
					   driver=new FirefoxDriver();
					   Method tc = XeroAutomationScripts.class.getMethod(testCase);
					   tc.invoke(tc);
					   driver.quit();
					   XeroReUsMethods.bw.close();
				}
				
				chrome = recData[i][4];
				if(chrome.equalsIgnoreCase("Y"))
				{
					testCase = recData[i][2];
					XeroReUsMethods.startReport(testCase, "/Users/Keerthi/Documents/Dec192017/Report/");
					System.setProperty("webdriver.chrome.driver", "/Users/Keerthi/Documents/chromedriver");
					driver=new ChromeDriver();
					Method tc = XeroAutomationScripts.class.getMethod(testCase);
					tc.invoke(tc);
					driver.quit();
					XeroReUsMethods.bw.close();
				}
				
				
				
			}
			


		}
		




	}


		
		
	}




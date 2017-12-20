package Xero;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class XeroAutomationScripts extends XeroReUsMethods
{
	
	
	public static void Login_To_Xero() throws IOException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(1);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            String username = cell1.toString();
            String pwd= cell2.toString();
            
            WebDriver driver;
       		System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
       		driver=new FirefoxDriver();
       		driver.get("https://login.xero.com");
       		WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
       		WebElement password = driver.findElement(By.id("password"));
       		WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
       		enterText(userName,username,"UserName");
       		enterText(password,pwd,"UserName");
       		clickObj(cobj,"Login");
       		driver.close();
            fStream.close();
            
            
           } 
		   catch (Exception e) 
		   {
            // TODO Auto-generated catch block
            e.printStackTrace();
           }
    
	
	}
	
	public static void Incorrect_Password() throws IOException
	{
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(2);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            String username = cell1.toString();
            String pwd= cell2.toString();
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://login.xero.com");
            WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
            enterText(password,pwd,"Password");
            clickObj(cobj,"Login");
	
            fStream.close();
            driver.close();
    
        } 
		   catch (Exception e) 
		   {
         // TODO Auto-generated catch block
         e.printStackTrace();
		   }
	}

	public static void Incorrect_Email() throws IOException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(1);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            
            String username = cell1.toString();
            String pwd= cell2.toString();
            
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://login.xero.com");
            WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
            enterText(password,pwd,"Password");
            clickObj(cobj,"Login");
            fStream.close();
            driver.close();
    
        } 
		   catch (Exception e) 
		   {
         // TODO Auto-generated catch block
         e.printStackTrace();
		   }
	}

	public static void Forgot_Password() throws IOException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(1);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            
            String username = cell1.toString();
            String pwd= cell2.toString();
            
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://login.xero.com");
            WebElement Frgtpwd = driver.findElement(By.xpath(".//*[@id='contentTop']/div[2]/div[1]/a"));
            clickObj(Frgtpwd,"Login");
            driver.get("https://login.xero.com/ForgottenPassword");
            WebElement userName = driver.findElement(By.xpath("//*[@id='UserName']"));
            WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']/a/span"));
            enterText(userName,username,"UserName");
            clickObj(cobj,"SendLink");
            driver.close();
            fStream.close();
            driver.close();
    
        } 
		   catch (Exception e) 
		   {
         // TODO Auto-generated catch block
         e.printStackTrace();
		   }
	}
	
	public static void Detail_Free_Trail() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(1);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            String username = cell1.toString();
            String pwd= cell2.toString();
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://www.xero.com/us/");
            WebElement Freetrail = driver.findElement(By.xpath("html/body/div[6]/header/nav/div[2]/div/div[1]/div/div/ul/li[1]/a"));
            clickObj(Freetrail,"Free Trail");
            driver.get("https://www.xero.com/us/signup/");
            //driver.switchTo().frame("html/body/div[6]/main/div[1]/div/div/form");
            WebElement FirstName = driver.findElement(By.name("FirstName"));
            FirstName.clear();
            enterText(FirstName,"kkk","UserName");
            WebElement LastName = driver.findElement(By.name("LastName"));
            LastName.clear();
            enterText(LastName,"sss","LastName");
            WebElement Email = driver.findElement(By.name("EmailAddress"));
            enterText(Email,"keerthig.shet@gmail.com","Email");
            WebElement Phone = driver.findElement(By.name("PhoneNumber"));
            enterText(Phone,"1234567890","Phone");
            WebElement Country = driver.findElement(By.name("LocationCode"));
            Select sel=new Select(Country);
            sel.selectByVisibleText("United States");
            WebElement Chkbox = driver.findElement(By.name("TermsAccepted")); 
            clickObj(Chkbox,"chkbox");	
            fStream.close();
            driver.close();
    
        } 
		   catch (Exception e) 
		   {
         // TODO Auto-generated catch block
         e.printStackTrace();
         }
	}
	
	public static void Free_Trail_Error() throws IOException, InterruptedException
	{
		
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
	driver=new FirefoxDriver();
	driver.get("https://www.xero.com/us/");
	WebElement Freetrail = driver.findElement(By.xpath("html/body/div[6]/header/nav/div[2]/div/div[1]/div/div/ul/li[1]/a"));
	clickObj(Freetrail,"Free Trail");
	driver.get("https://www.xero.com/us/signup/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.querySelector(\".btn.btn-primary.btn-disabled\").click()");
	
	}
	
	public static void Terms_link() throws IOException
	{
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		WebElement Freetrail = driver.findElement(By.xpath("html/body/div[6]/header/nav/div[2]/div/div[1]/div/div/ul/li[1]/a"));
		clickObj(Freetrail,"Free Trail");
		driver.get("https://www.xero.com/us/signup/");
		WebElement TermUse = driver.findElement(By.linkText("terms of use"));
		clickObj(TermUse,"TermUse");
		driver.close();
	}
	public static void Privacy_link() throws IOException
	{
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		WebElement Freetrail = driver.findElement(By.xpath("html/body/div[6]/header/nav/div[2]/div/div[1]/div/div/ul/li[1]/a"));
		clickObj(Freetrail,"Free Trail");
		driver.get("https://www.xero.com/us/signup/");
		WebElement PrivacyPolicy = driver.findElement(By.linkText("privacy policy"));
		clickObj(PrivacyPolicy,"PrivacyPolicy");
		driver.close();
	}
	public static void Offer_details() throws IOException
	{
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		WebElement Freetrail = driver.findElement(By.xpath("html/body/div[6]/header/nav/div[2]/div/div[1]/div/div/ul/li[1]/a"));
		clickObj(Freetrail,"Free Trail");
		driver.get("https://www.xero.com/us/signup/");
		WebElement offerdetails = driver.findElement(By.linkText("offer details"));
		clickObj(offerdetails,"offerdetails");
		driver.close();
	}
	
	public static void accountantorbookkeeper() throws IOException
	{
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.xero.com/us/");
		WebElement Freetrail = driver.findElement(By.xpath("html/body/div[6]/header/nav/div[2]/div/div[1]/div/div/ul/li[1]/a"));
		clickObj(Freetrail,"Free Trail");
		driver.get("https://www.xero.com/us/signup/");
		WebElement accountantorbookkeeper = driver.findElement(By.linkText("accountant or bookkeeper"));
		clickObj(accountantorbookkeeper,"accountantorbookkeeper");
		driver.close();
	}
	public static void Login_To_Logout() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(1);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            String username = cell1.toString();
            String pwd= cell2.toString();
            
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://login.xero.com");
            WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
            enterText(password,pwd,"Password");
            clickObj(cobj,"Login");
            driver.get("https://go.xero.com/Dashboard/default.aspx");
            Thread.sleep(20000);
            WebElement profile = driver.findElement(By.xpath(".//*[@id='xero-nav']/div/div[1]/div[2]/a"));
            clickObj(profile,"profile"); 
            WebElement Logout = driver.findElement(By.cssSelector(".xn-h-profile-card-navigation-item.grid-3.logout>a"));
            clickObj(Logout,"Logout");
            fStream.close();
            driver.close();
    
        } 
		   catch (Exception e) 
		   {
         // TODO Auto-generated catch block
         e.printStackTrace();
           }
	}
	public static void Tabs() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(1);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            String username = cell1.toString();
            String pwd= cell2.toString();
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
        	driver=new FirefoxDriver();
        	driver.get("https://login.xero.com");
        	WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
        	WebElement password = driver.findElement(By.id("password"));
        	WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
        	enterText(password,pwd,"Password");
        	clickObj(cobj,"Login");
        	driver.get("https://go.xero.com/Dashboard/default.aspx");
        	Thread.sleep(20000);
        	WebElement dsh = driver.findElement(By.xpath("//*[@id='Dashboard']"));
        	clickObj(dsh,"dsh");
        	WebElement acc = driver.findElement(By.xpath("//*[@id='Accounts']"));
        	clickObj(acc,"acc");
        	WebElement pay = driver.findElement(By.xpath(".//*[@id='Payroll']"));
        	clickObj(pay,"pay");
        	WebElement Repo = driver.findElement(By.xpath(".//*[@id='Reports']"));
        	clickObj(Repo,"Repo");
        	WebElement ctc = driver.findElement(By.xpath(".//*[@id='Contacts']"));
        	clickObj(ctc,"ctc");
        	WebElement set = driver.findElement(By.xpath(".//*[@id='Settings']"));
        	clickObj(set,"set");
        	WebElement plus = driver.findElement(By.xpath(".//*[@id='quicklaunchTab']"));
        	clickObj(plus,"plus");
        	WebElement files = driver.findElement(By.xpath(".//*[@id='xero-nav']/div[2]/div[2]/div[2]/ul/li[2]/a"));
        	clickObj(files,"files");
        	Thread.sleep(2000);
        	WebElement inbox = driver.findElement(By.xpath(".//*[@id='xero-nav']/div[2]/div[2]/div[2]/ul/li[3]/a"));
        	clickObj(inbox,"inbox");
        	Thread.sleep(2000);
        	WebElement search = driver.findElement(By.xpath(".//*[@id='xero-nav']/div[2]/div[2]/div[2]/ul/li[4]/a"));
        	clickObj(search,"search");
        	Thread.sleep(20000);
        	WebElement qnmrk = driver.findElement(By.xpath(".//*[@id='xero-nav']/div[2]/div[2]/div[2]/ul/li[5]/a"));
        	clickObj(qnmrk,"qnmrk");
        	fStream.close();
            driver.close();

} 
   catch (Exception e) 
   {
 // TODO Auto-generated catch block
 e.printStackTrace();
   }
	}
	
	public static void imageupload() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(1);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            String username = cell1.toString();
            String pwd= cell2.toString();WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://login.xero.com");
            WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
            enterText(password,pwd,"Password");
            clickObj(cobj,"Login");
            driver.get("https://go.xero.com/Dashboard/default.aspx");
            Thread.sleep(20000);
            WebElement profile = driver.findElement(By.xpath(".//*[@id='xero-nav']/div/div[1]/div[2]/a"));
            clickObj(profile,"profile"); 
            Thread.sleep(20000);
            WebElement profImg = driver.findElement(By.cssSelector(".xn-h-profile-card-navigation-item.grid-3.profile>a"));
            clickObj(profImg,"profImg");
            driver.get("https://my.xero.com/!xkcD/Settings/User");
            Thread.sleep(20000);
            driver.findElement(By.xpath("html/body/div[4]/form/div/div[2]/div/div[1]/span/div/div[1]/span/div/div[2]/div/div/div[2]/div/div/div/div[2]/div/a/span[1]"))
            .click();
            driver.findElement(By.xpath("html/body/div[15]/div[2]/span/div/div/div/span/div/div[3]/div/span/div/div/div/div/div/table[1]/tbody/tr/td[2]/table/tbody/tr/td[2]/div/input"))
            .sendKeys("/Users/Keerthi/Documents/vase.jpg");
            WebElement upld=driver.findElement(By.xpath("html/body/div[15]/div[3]/div/div/div[2]"));
            clickObj(upld,"upld");
            fStream.close();
            driver.close();
    
        } 
		   catch (Exception e) 
		   {
         // TODO Auto-generated catch block
         e.printStackTrace();
         }
	}
	
	public static void Login_To_MyXero() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(1);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            String username = cell1.toString();
            String pwd= cell2.toString();WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
        	driver=new FirefoxDriver();
        	driver.get("https://login.xero.com");
        	WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
        	WebElement password = driver.findElement(By.id("password"));
        	WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
        	enterText(password,pwd,"Password");
        	clickObj(cobj,"Login");
        	driver.get("https://go.xero.com/Dashboard/default.aspx");
        	Thread.sleep(20000);
        	WebElement Xro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/h2/a"));
        	clickObj(Xro,"Xro"); 
        	WebElement MyXro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/a/span"));
        	clickObj(MyXro,"Xro");
        	driver.get("https://my.xero.com/!xkcD/Dashboard");
        	Thread.sleep(20000);
        	WebElement Addorg = driver.findElement(By.xpath("html/body/div[4]/form/div/section[2]/div/a"));
        	clickObj(Addorg,"Addorg");
        	driver.get("https://my.xero.com/!xkcD/Organisation/Setup");
        	driver.findElement(By.name("OrganisationName")).sendKeys("self"); 
        	WebElement cc=driver.findElement(By.name("CountryCode"));
        	Select sel=new Select(cc);
        	sel.selectByVisibleText("United States");
        	driver.findElement(By.name("CountryCode")).sendKeys("(UTC-05:00) Eastern Time (US & Canada)");
        	driver.findElement(By.name("IndustryFreeText")).sendKeys("WebDevelopment");
        	WebElement prevsw=driver.findElement(By.name("PreviousSoftwareAnswer"));
        	Select sel1=new Select(prevsw);
        	sel1.selectByVisibleText("Wave");
        	WebElement Strial= driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div/div[2]/div/div/a[1]"));
        	clickObj(Strial,"Strial");
        	fStream.close();
        	driver.close();
            
                } 
        		   catch (Exception e) 
        		   {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 }
	}
	public static void Login_To_Buynow() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(1);
            HSSFCell cell1 = row.getCell(0);
            HSSFCell cell2 = row.getCell(1);
            String username = cell1.toString();
            String pwd= cell2.toString();WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
        	driver=new FirefoxDriver();
        	driver.get("https://login.xero.com");
        	WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
        	WebElement password = driver.findElement(By.id("password"));
        	WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
        	enterText(password,pwd,"Password");
        	clickObj(cobj,"Login");
        	driver.get("https://go.xero.com/Dashboard/default.aspx");
        	Thread.sleep(20000);
        	WebElement Xro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/h2/a"));
        	clickObj(Xro,"Xro"); 
        	WebElement MyXro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/a/span"));
        	clickObj(MyXro,"Xro");
        	driver.get("https://my.xero.com/!xkcD/Dashboard");
        	Thread.sleep(20000);
        	WebElement Addorg = driver.findElement(By.xpath("html/body/div[4]/form/div/section[2]/div/a"));
        	clickObj(Addorg,"Addorg");
        	driver.get("https://my.xero.com/!xkcD/Organisation/Setup");
        	Thread.sleep(2000);
        	WebElement org=driver.findElement(By.name("OrganisationName"));
        	enterText(org,"self","Organization");
        	Thread.sleep(20000);
        	driver.findElement(By.id("countryCmb-inputEl")).click();
        	driver.findElement(By.id("cmbTimeZone-inputEl")).click(); 
        	driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div/div[1]/span/div/div[3]/span/div/table[1]/tbody/tr/td[2]/table/tbody/tr/td[1]/input")).sendKeys("Accounting");
        	driver.findElement(By.id("combo-1029-inputEl")).sendKeys("Other");
        	WebElement Buynow= driver.findElement(By.xpath(".//*[@id='simplebutton-1036']"));
        	clickObj(Buynow,"Buynow");
        	fStream.close();
        	driver.close();
            
                } 
        		   catch (Exception e) 
        		   {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 }
	}
	public static void Login_To_Buynow_Starter() throws IOException, InterruptedException
	{
		

		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet


            HSSFRow row = sheet.getRow(2);
            HSSFCell cell1 = row.getCell(1);
            HSSFCell cell2 = row.getCell(2);
            HSSFCell cell3 = row.getCell(3);
            HSSFCell cell4 = row.getCell(4);
            HSSFCell cell5 = row.getCell(5);
            HSSFCell cell6 = row.getCell(6);
            HSSFCell cell7 = row.getCell(7);
            
            String username = cell1.toString();
            String pwd= cell2.toString();
            String street=cell3.toString();
            String city=cell4.toString();
            String state=cell5.toString();
            String zip=cell6.toString();
            String address=cell7.toString();
            
            
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://login.xero.com");
            WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
        	WebElement password = driver.findElement(By.id("password"));
        	WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
        	enterText(password,pwd,"Password");
        	clickObj(cobj,"Login");
        	driver.get("https://go.xero.com/Dashboard/default.aspx");
        	Thread.sleep(20000);
        	WebElement Xro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/h2/a"));
        	clickObj(Xro,"Xro"); 
        	WebElement MyXro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/a/span"));
        	clickObj(MyXro,"Xro");
        	driver.get("https://my.xero.com/!xkcD/Dashboard");
        	Thread.sleep(20000);
        	WebElement Addorg = driver.findElement(By.xpath("html/body/div[4]/form/div/section[2]/div/a"));
        	clickObj(Addorg,"Addorg");
        	driver.get("https://my.xero.com/!xkcD/Organisation/Setup");
        	Thread.sleep(20000);
        	WebElement org=driver.findElement(By.name("OrganisationName"));
        	enterText(org,"self","Organization");
        	Thread.sleep(20000);
        	driver.findElement(By.id("countryCmb-inputEl")).click();
        	driver.findElement(By.id("cmbTimeZone-inputEl")).click(); 
        	Thread.sleep(20000);
        	driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div/div[1]/span/div/div[3]/span/div/table[1]/tbody/tr/td[2]/table/tbody/tr/td[1]/input")).sendKeys("Accounting");
        	driver.findElement(By.id("combo-1029-inputEl")).sendKeys("Other");
            WebElement Buynow= driver.findElement(By.xpath(".//*[@id='simplebutton-1036']"));
        	clickObj(Buynow,"Buynow");
        	Thread.sleep(20000);
        	String url = driver.getCurrentUrl();
        	System.out.println("url is" +url);
        	driver.get(url);
        	WebElement Starter= driver.findElement(By.xpath(".//*[@id='PRODUCTOPTION/ORG/SOLO']/div[1]/label"));
        	clickObj(Starter,"Starter");
        	WebElement ContBill= driver.findElement(By.xpath(".//*[@id='frmMain']/div/div[2]/div/main/div[10]/button"));
        	clickObj(ContBill,"ContBill");
        	driver.get("https://my.xero.com/MyXero/V2/SelectOrganisationBillingPlan.aspx");
        	WebElement Addr= driver.findElement(By.xpath(".//*[@id='POAddress']"));
        	enterText(Addr,address,"Addr");
        	WebElement cityn= driver.findElement(By.xpath(".//*[@id='POCity']"));
        	enterText(cityn,city,"city");
        	WebElement state1= driver.findElement(By.xpath(".//*[@id='PORegionDropdown']"));
        	Select sel2=new Select(state1);
        	sel2.selectByVisibleText(state);
        	WebElement zipc= driver.findElement(By.xpath(".//*[@id='POPostalCode']"));
        	enterText(zipc,zip,"zip"); 
        	WebElement contpay= driver.findElement(By.xpath(".//*[@id='frmMain']/div/div/div/main/div[3]/div/div[2]/div/button"));
        	clickObj(contpay,"Contpay");
        	fStream.close();
        	driver.close();
            
        } 
		   catch (Exception e) 
		   {
         // TODO Auto-generated catch block
         e.printStackTrace();
         }
	}
	public static void Login_To_Buynow_Standard() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(2);
            HSSFCell cell1 = row.getCell(1);
            HSSFCell cell2 = row.getCell(2);
            HSSFCell cell3 = row.getCell(3);
            HSSFCell cell4 = row.getCell(4);
            HSSFCell cell5 = row.getCell(5);
            HSSFCell cell6 = row.getCell(6);
            HSSFCell cell7 = row.getCell(7);
            
            String username = cell1.toString();
            String pwd= cell2.toString();
            String street=cell3.toString();
            String city=cell4.toString();
            String state=cell5.toString();
            String zip=cell6.toString();
            String address=cell7.toString();
            
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://login.xero.com");
            WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
            enterText(password,pwd,"Password");
            clickObj(cobj,"Login");
            driver.get("https://go.xero.com/Dashboard/default.aspx");
            Thread.sleep(20000);
            WebElement Xro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/h2/a"));
            clickObj(Xro,"Xro"); 
            WebElement MyXro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/a/span"));
            clickObj(MyXro,"Xro");
            driver.get("https://my.xero.com/!xkcD/Dashboard");
            Thread.sleep(20000);
            WebElement Addorg = driver.findElement(By.xpath("html/body/div[4]/form/div/section[2]/div/a"));
            clickObj(Addorg,"Addorg");
            driver.get("https://my.xero.com/!xkcD/Organisation/Setup");
            Thread.sleep(20000);
            WebElement org=driver.findElement(By.name("OrganisationName"));
            enterText(org,"self","Organization");
            Thread.sleep(20000);
            driver.findElement(By.id("countryCmb-inputEl")).click();
            driver.findElement(By.id("cmbTimeZone-inputEl")).click(); 
            Thread.sleep(20000);
            driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div/div[1]/span/div/div[3]/span/div/table[1]/tbody/tr/td[2]/table/tbody/tr/td[1]/input")).sendKeys("Accounting");
            driver.findElement(By.id("combo-1029-inputEl")).sendKeys("Other");
            WebElement Buynow= driver.findElement(By.xpath(".//*[@id='simplebutton-1036']"));
            clickObj(Buynow,"Buynow");
            Thread.sleep(20000);
            String url = driver.getCurrentUrl();
            driver.get(url);
            WebElement ContBill= driver.findElement(By.xpath(".//*[@id='frmMain']/div/div[2]/div/main/div[10]/button"));
            clickObj(ContBill,"ContBill");
            driver.get("https://my.xero.com/MyXero/V2/SelectOrganisationBillingPlan.aspx");
            WebElement Addr= driver.findElement(By.xpath(".//*[@id='POAddress']"));
            enterText(Addr,address,"Addr");
            WebElement cityn= driver.findElement(By.xpath(".//*[@id='POCity']"));
            enterText(cityn,city,"city");
            WebElement state1= driver.findElement(By.xpath(".//*[@id='PORegionDropdown']"));
            Select sel2=new Select(state1);
            sel2.selectByVisibleText(state);
            WebElement zipc= driver.findElement(By.xpath(".//*[@id='POPostalCode']"));
            enterText(zipc,zip,"zip"); 
            WebElement contpay= driver.findElement(By.xpath(".//*[@id='frmMain']/div/div/div/main/div[3]/div/div[2]/div/button"));
            clickObj(contpay,"Contpay");
            fStream.close();
            driver.close();
    
        } 
		   catch (Exception e) 
		   {
         // TODO Auto-generated catch block
         e.printStackTrace();
           }
	}
	public static void Login_To_Buynow_Premium() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(2);
            HSSFCell cell1 = row.getCell(1);
            HSSFCell cell2 = row.getCell(2);
            HSSFCell cell3 = row.getCell(3);
            HSSFCell cell4 = row.getCell(4);
            HSSFCell cell5 = row.getCell(5);
            HSSFCell cell6 = row.getCell(6);
            HSSFCell cell7 = row.getCell(7);
            
            String username = cell1.toString();
            String pwd= cell2.toString();
            String street=cell3.toString();
            String city=cell4.toString();
            String state=cell5.toString();
            String zip=cell6.toString();
            String address=cell7.toString();
            
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
        	driver=new FirefoxDriver();
        	driver.get("https://login.xero.com");
        	WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
        	WebElement password = driver.findElement(By.id("password"));
        	WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
        	enterText(password,pwd,"Password");
        	clickObj(cobj,"Login");
        	driver.get("https://go.xero.com/Dashboard/default.aspx");
        	Thread.sleep(20000);
        	WebElement Xro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/h2/a"));
        	clickObj(Xro,"Xro"); 
        	WebElement MyXro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/a/span"));
        	clickObj(MyXro,"Xro");
        	driver.get("https://my.xero.com/!xkcD/Dashboard");
        	Thread.sleep(20000);
        	WebElement Addorg = driver.findElement(By.xpath("html/body/div[4]/form/div/section[2]/div/a"));
        	clickObj(Addorg,"Addorg");
        	driver.get("https://my.xero.com/!xkcD/Organisation/Setup");
        	Thread.sleep(20000);
        	WebElement org=driver.findElement(By.name("OrganisationName"));
        	enterText(org,"self","Organization");
        	Thread.sleep(20000);
        	driver.findElement(By.id("countryCmb-inputEl")).click();
        	driver.findElement(By.id("cmbTimeZone-inputEl")).click(); 
        	Thread.sleep(20000);
        	driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div/div[1]/span/div/div[3]/span/div/table[1]/tbody/tr/td[2]/table/tbody/tr/td[1]/input")).sendKeys("Accounting");
        	driver.findElement(By.id("combo-1029-inputEl")).sendKeys("Other");
        	WebElement Buynow= driver.findElement(By.xpath(".//*[@id='simplebutton-1036']"));
        	clickObj(Buynow,"Buynow");
        	Thread.sleep(20000);
        	String url = driver.getCurrentUrl();
        	driver.get(url);
        	WebElement premium= driver.findElement(By.xpath(".//*[@id='PRODUCTOPTION/ORG/PRO']/div[1]/label/span"));
        	clickObj(premium,"premium");
        	WebElement ContBill= driver.findElement(By.xpath(".//*[@id='frmMain']/div/div[2]/div/main/div[10]/button"));
        	clickObj(ContBill,"ContBill");
        	driver.get("https://my.xero.com/MyXero/V2/SelectOrganisationBillingPlan.aspx");
        	WebElement Addr= driver.findElement(By.xpath(".//*[@id='POAddress']"));
        	enterText(Addr,address,"Addr");
        	WebElement cityn= driver.findElement(By.xpath(".//*[@id='POCity']"));
        	enterText(cityn,city,"city");
        	WebElement state1= driver.findElement(By.xpath(".//*[@id='PORegionDropdown']"));
        	Select sel2=new Select(state1);
        	sel2.selectByVisibleText(state);
        	WebElement zipc= driver.findElement(By.xpath(".//*[@id='POPostalCode']"));
        	enterText(zipc,zip,"zip"); 
        	WebElement contpay= driver.findElement(By.xpath(".//*[@id='frmMain']/div/div/div/main/div[3]/div/div[2]/div/button"));
        	clickObj(contpay,"Contpay");
        	fStream.close();
        	driver.close();
    
        } 
		   catch (Exception e) 
		   {
         // TODO Auto-generated catch block
         e.printStackTrace();
         }
	}

	public static void Login_To_Buynow_Fileconversion() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(2);
            HSSFCell cell1 = row.getCell(1);
            HSSFCell cell2 = row.getCell(2);
            HSSFCell cell3 = row.getCell(3);
            HSSFCell cell4 = row.getCell(4);
            HSSFCell cell5 = row.getCell(5);
            HSSFCell cell6 = row.getCell(6);
            
            String username = cell1.toString();
            String pwd= cell2.toString();
            String cardnumber=cell3.toString();
            String crdexpryno=cell4.toString();
            String cardcvvno =cell5.toString();
            String cname=cell6.toString();
            
            WebDriver driver;
        	System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
        	driver=new FirefoxDriver();
        	driver.get("https://login.xero.com");
        	WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
        	WebElement password = driver.findElement(By.id("password"));
        	WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
        	enterText(password,pwd,"Password");
        	clickObj(cobj,"Login");
        	driver.get("https://go.xero.com/Dashboard/default.aspx");
        	Thread.sleep(20000);
        	WebElement Xro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/h2/a"));
        	clickObj(Xro,"Xro"); 
        	WebElement MyXro = driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/a/span"));
        	clickObj(MyXro,"Xro");
        	driver.get("https://my.xero.com/!xkcD/Dashboard");
        	Thread.sleep(20000);
        	WebElement Addorg = driver.findElement(By.xpath("html/body/div[4]/form/div/section[2]/div/a"));
        	clickObj(Addorg,"Addorg");
        	driver.get("https://my.xero.com/!xkcD/Organisation/Setup");
        	Thread.sleep(2000);
        	WebElement org=driver.findElement(By.name("OrganisationName"));
        	enterText(org,"self","Organization");
        	driver.findElement(By.id("countryCmb-inputEl")).click();
        	driver.findElement(By.id("cmbTimeZone-inputEl")).click(); 
        	driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div/div[1]/span/div/div[3]/span/div/table[1]/tbody/tr/td[2]/table/tbody/tr/td[1]/input")).sendKeys("Accounting");
        	driver.findElement(By.id("combo-1029-inputEl")).sendKeys("Other");
        	WebElement fileconv= driver.findElement(By.linkText("Move from QuickBooks for free."));
        	clickObj(fileconv,"fileconv");
        	WebElement filebut= driver.findElement(By.xpath(".//*[@id='conversionCheckbox-inputEl']"));
        	clickObj(filebut,"filebut");
        	WebElement Buynow= driver.findElement(By.xpath(".//*[@id='simplebutton-1036']"));
        	clickObj(Buynow,"Buynow");
        	driver.get("https://my.xero.com/MyXero/V2/BillingPlanSummary.aspx");
        	WebElement crddetails=driver.findElement(By.xpath(".//*[@id='card-element']"));
        	enterText(crddetails,cardnumber,"cardnumber");
        	WebElement crdexpry=driver.findElement(By.xpath(".//*[@id='card-expiry']"));
        	enterText(crdexpry,crdexpryno,"crdexpry");
        	WebElement crdcvv=driver.findElement(By.xpath(".//*[@id='card-cvc']"));
        	enterText(crdcvv,cardcvvno,"cardcvv");
        	WebElement crdhldrname=driver.findElement(By.xpath(".//*[@id='cardholder-name']"));
        	enterText(crdhldrname,cname,"crdhldrname");
        	WebElement button=driver.findElement(By.xpath(".//*[@id='authoriseStripeButton']"));
        	clickObj(button,"button");
        	fStream.close();
        	driver.close();
        	
            
    
        } 
		   catch (Exception e) 
		   {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
          }
	}

	public static void Sub_Bill() throws IOException, InterruptedException
	{
		
		try {
            FileInputStream fStream = new FileInputStream(new File("/Users/Keerthi/Desktop/sample.xls"));

            // Create workbook instance referencing the file created above
            HSSFWorkbook workbook = new HSSFWorkbook(fStream);

            // Get your first or desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0); // getting first sheet

            HSSFRow row = sheet.getRow(2);
            HSSFCell cell1 = row.getCell(1);
            HSSFCell cell2 = row.getCell(2);
            String username = cell1.toString();
            String pwd= cell2.toString();
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "/Users/Keerthi/Documents/workspace/Selenium_Training/bin/geckodriver");
            driver=new FirefoxDriver();
            driver.get("https://login.xero.com");
            WebElement userName = driver.findElement(By.xpath("//*[@id='email']"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement cobj=driver.findElement(By.xpath("//*[@id='submitButton']"));
            enterText(userName,username,"UserName");
            enterText(password,pwd,"Password");
            clickObj(cobj,"Login");
            driver.get("https://go.xero.com/Dashboard/Default.aspx");
            Thread.sleep(20000);
            WebElement Accts=driver.findElement(By.xpath(".//*[@id='Accounts']"));
            clickObj(Accts,"Accts");
            WebElement purch=driver.findElement(By.xpath(".//*[@id='xero-nav']/div[2]/div[2]/div[1]/ul/li[2]/ul/li[3]/a"));
            clickObj(purch,"purch");
            driver.get("https://go.xero.com/Accounts/Payable/Dashboard/");
            fStream.close();
            driver.close();
    
        } 
		   catch (Exception e) 
		   {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
		   }
	}
	



}

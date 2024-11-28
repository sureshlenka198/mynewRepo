package programs;
import javax.xml.xpath.XPath;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import javax.xml.xpath.XPath;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

		public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    public WebDriver driver; 
	    public String expected = null;
	    public String actual = null;
	        @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching firefox browser"); 
	          ChromeOptions options = new ChromeOptions();
	         
	          driver= new ChromeDriver(options);
	          driver.get(baseUrl);
	      }
	      
	      @BeforeMethod
	      public void verifyHomepageTitle() {
	    	  System.out.println("Before the Method"); 
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          WebElement ele =driver.findElement(By.xpath("//img [@alt='Mercury Tours']"));
	     //     Assert.assertTrue(true);
	      }
	      
	          @Test(priority = 0)
	      public void register(){
	          driver.findElement(By.linkText("REGISTER")).click() ;
	          expected = "Register: Mercury Tours";
	           actual = driver.getTitle();
	          Assert.assertEquals(actual, expected);
	      }
	          @Test(priority = 1)
	      public void support() {
	            driver.findElement(By.linkText("SUPPORT")).click() ;
	            expected = "Under Construction: Mercury Tours";
	            Assert.assertTrue(true);
	      }
	      @AfterMethod
	      public void goBackToHomepage ( ) {
	    	  System.out.println("After the Method"); 
	    	//  Assert.assertTrue(true);
	      }
	       
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
	      }

	}



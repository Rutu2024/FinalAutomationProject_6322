package harmanAudio;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Infinity 
{
	//Once you run this project and if you want run second time please remove all cart items address manually otherwise some testcase will fail.
			//This is live site some time some new advertise is presence in some pages that time code is not working properly
			//Due to live site some items may be added or removed from site that this can be fail.
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws Exception 
	{
		//Launch chrome brosure
		System.setProperty("webdriver.chrome.driver", "D:\\TEATING THINGS\\automation testins\\brosure extention\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		//maximize window
		driver.manage().window().maximize();	
		//url 
		driver.get("https://www.harmanaudio.in/infinity");
		Thread.sleep(2000);
		//my account
	    driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/a/span[1]")).click();
	    Thread.sleep(2000);
	    //sign in
	    driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	     //Email Id
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div/form/div[1]/input")).sendKeys("rutudatir1998@gmail.com");
		 Thread.sleep(2000);       
		 //Password
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div/form/div[2]/input")).sendKeys("RutsPik@24");
		 Thread.sleep(2000);
		 //Click Button
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_login\"]/button")).click();
		 Thread.sleep(2000);
	}

	
  @Test(priority=1)
  public void Smoketesting() throws Exception 
  {	
	        // home button
	        driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div[1]/div/div[3]/div[1]/a/span")).click();
	        Thread.sleep(1000);  
	        //step:1 Create Object Of Actions class
			Actions a= new Actions(driver);
			Thread.sleep(1000);  
			//Step :2 Create Object of list with Webelment
			List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"navigation\"]/nav/div/ul/li"));
			Thread.sleep(1000);  
			//Step:3 Store Size of List
			int listSize=ls.size();
			System.out.println("No Of Modules:"+listSize);
			Thread.sleep(1000);  
			//Step:4 Foor loop
			for(int i=1; i<=listSize; i++)
			{
			//Wait
			Thread.sleep(1000);
			//Display Module'Name
			System.out.println(driver.findElement(By.xpath("//*[@id=\"navigation\"]/nav/div/ul/li["+i+"]")).getText());
			Thread.sleep(2000);  
			//Performance Mouse Hover
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/nav/div/ul/li["+i+"]"))).click().perform();
			}
  }
	
  
  @Test(priority=2)
		  public void module1_PROFESSIONAL_mousehover() throws InterruptedException 
		  {	
			  //	mouse hover
			  driver.findElement(By.xpath("//*[@id=\"navigation\"]/nav/div/ul/li[6]/a[2]/span")).click();
			  Thread.sleep(1000);
			  //   step 1 Create Object Of Actions class
			  Actions a= new Actions(driver);
			  Thread.sleep(1000);  
			  //   Step :2 Create Object of list with Webelment
			  List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"main\"]/div/div/nav/ul/li"));
			  Thread.sleep(1000);  
			  //   Step:3 Store Size of List
			  int listSize=ls.size();
			  System.out.println("No Of Modules:"+listSize);
			  Thread.sleep(1000);  
			  //   Step:4 Foor loop
			  for(int i=1; i<=listSize; i++)
			  {
				  //Wait
				  Thread.sleep(1000);  
				  //Display Module'Name
				  System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/nav/ul/li["+i+"]")).getText());				
				  Thread.sleep(1000);  
				  //Performance Mouse Hover
				  a.moveToElement(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/nav/ul/li["+i+"]"))).click().perform();
			  }
		  }
  
 
  @Test(priority=3)
  public void module2_BRANDS() throws InterruptedException 
  {	
	  //brand main (on navigation bar)
	  driver.findElement(By.xpath("//*[@id=\"navigation\"]/nav/div/ul/li[1]/a[2]/span")).click();		
	  Thread.sleep(2000);  
	  //cookies
	  driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();		
	  Thread.sleep(2000);  
	  //price check box
	  driver.findElement(By.xpath("//*[@id=\"primary\"]/div[4]/div[1]/div/div[1]/div[2]/div/div/div/ul/li[1]/div/ul/li[1]")).click();		
	  Thread.sleep(2000); 
	  //device compatibility check box
	  driver.findElement(By.xpath("//*[@id=\"primary\"]/div[4]/div[1]/div/div[1]/div[2]/div/div/div/ul/li[3]/div/ul/li")).click();		
	  Thread.sleep(2000); 
	  //view details
	  driver.findElement(By.xpath("//*[@id=\"bcrcMiaaiqYvAaaadnGetKZthR\"]/div[4]/div[3]/a")).click();		
	  Thread.sleep(2000); 
	  //color change
	  driver.findElement(By.xpath("//*[@id=\"product-content\"]/div[3]/ul/li/div/ul/li[6]/a")).click();		
	  Thread.sleep(2000); 
	  //set quantity
	  driver.findElement(By.xpath("//*[@id=\"Quantity\"]")).clear();
	  driver.findElement(By.xpath("//*[@id=\"Quantity\"]")).sendKeys("2");
	  Thread.sleep(2000);
	  //brand
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();		
	  Thread.sleep(2000); 
  }
  
  
  @Test(priority=4)
  public void module3_FEATURED() throws Exception 
  {	
	  //brand main (on navigation bar)
	  driver.findElement(By.xpath("//*[@id=\"navigation\"]/nav/div/ul/li[8]/a[2]")).click();		
	  Thread.sleep(2000);  
	  //brand option
	  driver.findElement(By.xpath("//*[@id=\"primary\"]/div[4]/div[1]/div/div[1]/div[2]/div/div/div/ul/li[1]/div/ul/li[1]")).click();		
	  Thread.sleep(2000); 
	  // Screenshort
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File src=ts.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(src,new File(".\\Infinity_features_compare_product.png"));
	  Thread.sleep(2000);
  }
  
  
	  @Test(priority=5)
	  public void module4_SearchBar() throws Exception 
	  {	
		  //Search bar
		  driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("JBL T450BT");
		  Thread.sleep(2000);
		  //click search 
		  driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/input[2]")).click();
		  Thread.sleep(2000);
		  //change colour
		  driver.findElement(By.xpath("//*[@id=\"product-content\"]/div[3]/ul/li/div/ul/li[3]/a")).click();
		  Thread.sleep(2000);
		  //set quantity
		  driver.findElement(By.xpath("//*[@id=\"Quantity\"]")).clear();
		  driver.findElement(By.xpath("//*[@id=\"Quantity\"]")).sendKeys("2");
		  Thread.sleep(2000);
		  //add to cart
		  driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
		  Thread.sleep(2000);
	  }
  
	  
	 @Test(priority=6)
	  public void module5_SHOPPING_CART() throws InterruptedException 
	  {	
		  //Bag and view shoping cart
		  driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/div[2]/div[3]/a")).click();
		  Thread.sleep(2000);
		  //Check out
		  driver.findElement(By.xpath("//*[@id=\"order-summary-container\"]/div[2]/div/div[2]/a")).click();
		  Thread.sleep(2000);
		  //frist Name
		  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/div[3]/div[4]/div[3]/div[2]/input")).sendKeys("Rutuja");
		  Thread.sleep(2000);
			//Last name
		  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/div[3]/div[4]/div[4]/div[2]/input")).sendKeys("Datir");
		  Thread.sleep(2000);
		  //Address Line 1
		  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/div[3]/div[4]/div[5]/div[2]/input")).sendKeys("L.I.C. Colony, Nalwadi, Wardha");
		  Thread.sleep(2000);
		  //City
		  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/div[3]/div[4]/div[7]/div[2]/input")).sendKeys("Wardha");
		  Thread.sleep(2000);
		  //state
		  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/div[3]/div[4]/div[8]/div[2]/select")).sendKeys("Maharashtra");
		  Thread.sleep(2000);
		  //Pin Code
		  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/div[3]/div[4]/div[9]/div[2]/input")).sendKeys("442001");
		  Thread.sleep(2000);
		  //Phone No
		  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/div[3]/div[4]/div[11]/div[2]/input")).sendKeys("7972596149");
		  Thread.sleep(2000);
	  }
	 
	 
	 @Test(priority=7)
	  public void module6_Addresses() throws InterruptedException
	  {	
		 //url
		 driver.get("https://www.harmanaudio.in/cart");
		 //account
		 driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/a")).click();
		 Thread.sleep(2000);
		 //my account
		 driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/ul/li[1]/a")).click();
		 Thread.sleep(2000);
		 //address
		 driver.findElement(By.xpath("//*[@id=\"primary\"]/div/div/ul/li[2]/a")).click();
		 Thread.sleep(2000);
		 //create account
		 driver.findElement(By.xpath("//*[@id=\"addresses\"]/div/a")).click();
		 Thread.sleep(2000);
        //address name
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_address_addressid\"]")).sendKeys("Nalwadi, wardha");
		 Thread.sleep(2000);
		 //frist name
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_address_firstname\"]")).sendKeys("Rutuja");
		 Thread.sleep(2000);
		//Last name
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_address_lastname\"]")).sendKeys("Datir");
		 Thread.sleep(2000);
		//Address 1 
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_address_address1india\"]")).sendKeys("Lic colony, nalwadi, wardha");
		 Thread.sleep(2000);
		//state
		 Select s1= new Select(driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_address_states_stateIN\"]")));
		 s1.selectByVisibleText("Maharashtra");
		 Thread.sleep(2000);
		//city
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_address_city\"]")).sendKeys("Wardha");
		 Thread.sleep(2000);
		//postel code
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_address_zip\"]")).sendKeys("442001");
		 Thread.sleep(2000);
		//phone number
		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_address_phone\"]")).sendKeys("7972596149");
		 Thread.sleep(2000);
		//create ACCOUNT button
		 driver.findElement(By.xpath("//*[@id=\"edit-address-form\"]/fieldset/div[12]/button[1]")).click();
		 Thread.sleep(2000);
	    //my ACCOUNT
	     driver.findElement(By.xpath("//*[@id=\"main\"]/section/div/div[1]/div/div[3]/div[2]/a/span")).click();
	     Thread.sleep(2000);
	  }
	
	 
	 @Test(priority=8)
	  public void module7_Service_Center() throws InterruptedException, IOException
	  {	
		//Support
		 driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[4]")).click();
		 Thread.sleep(2000);
		 //Support-service center
		 driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[4]/ul/div/ul/li[4]/a")).click();
		 Thread.sleep(2000);
		 //Address
		 driver.findElement(By.xpath("//*[@id=\"scl-address\"]")).sendKeys("Nagpur, Maharashtra, India");
		 Thread.sleep(2000);
		//Radious
		 driver.findElement(By.xpath("//*[@id=\"scl-radius\"]")).sendKeys("20 miles");
		 Thread.sleep(2000);
		//Fielter restult by product
		 driver.findElement(By.xpath("//*[@id=\"scl-product-selectized\"]")).sendKeys("AKG N30");
		 Thread.sleep(2000);
		// Screenshort
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src,new File(".\\Infinity_service_center.png"));
		  Thread.sleep(2000);
        //	mouse hover
		  //   step 1 Create Object Of Actions class
		  Actions a= new Actions(driver);
		  Thread.sleep(1000);  
		  //   Step :2 Create Object of list with Webelment
		  List<WebElement> ls=driver.findElements(By.xpath("/html/body/header/section[2]/div/div[2]/nav/ul/li"));
		  Thread.sleep(1000);  
		  //   Step:3 Store Size of List
		  int listSize=ls.size();
		  System.out.println("No Of Modules:"+listSize);
		  Thread.sleep(1000);  
		  //   Step:4 Foor loop
		  for(int i=1; i<=listSize; i++)
		  {
			  //Wait
			  Thread.sleep(1000);  
			  //Display Module'Name
			  System.out.println(driver.findElement(By.xpath("/html/body/header/section[2]/div/div[2]/nav/ul/li["+i+"]")).getText());				
			  Thread.sleep(1000);  
			  //Performance Mouse Hover
			  a.moveToElement(driver.findElement(By.xpath("/html/body/header/section[2]/div/div[2]/nav/ul/li["+i+"]"))).click().perform();
		  }
	  }
	 
	 
	  @Test(priority=9)
	  public void Logout() throws Exception 
	  {
		//Home
		  driver.get("https://www.harmanaudio.in/account");
		  Thread.sleep(2000);  
	    //My account
		  driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/a/span[1]")).click();
		  Thread.sleep(2000);
		//signout
		  driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/ul/li[4]/a")).click();
		  Thread.sleep(2000);  
	  }

	  
	  @Test(priority=10)
		public void module8_Other_Country_Social_Media() throws Exception 
		  {	
			//url 
			driver.get("https://www.infinityspeakers.com/");
			Thread.sleep(3000);

			  driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/ul/li/a")).click();
			  Thread.sleep(4000);
			  
			  	//How to scroll
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//Scroll To Bottom
					Thread.sleep(2000);
			
					// FacebooK
					driver.findElement(By.xpath("//*[@id=\"footer-social\"]/div/div/div/div/ul/li[1]/a")).click();
					  Thread.sleep(4000);
					  //twiter
				    driver.findElement(By.xpath("//*[@id=\"footer-social\"]/div/div/div/div/ul/li[2]/a")).click();
					  Thread.sleep(4000);
					  //youtube
				   driver.findElement(By.xpath("//*[@id=\"footer-social\"]/div/div/div/div/ul/li[4]/a")).click();
					  Thread.sleep(4000);			
			  
			   
			//Store all window in ArrayList
				ArrayList<String>newTab= new ArrayList<String>(driver.getWindowHandles());
				
				//Switch to new TAB(youtube)
				driver.switchTo().window(newTab.get(1));
				System.out.println("New Tab Title: "+driver.getTitle());
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/tp-yt-paper-tab[2]/div")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/tp-yt-paper-tab[3]/div")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/tp-yt-paper-tab[4]/div")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"tabsContent\"]/tp-yt-paper-tab[5]/div")).click();
				Thread.sleep(2000);
				//close youtube tab
				driver.close();
				Thread.sleep(3000);
				
				//Switch to Parent Tab
				driver.switchTo().window(newTab.get(0));
				//Switch to new TAB(twiter)
				driver.switchTo().window(newTab.get(2));
				System.out.println("New Tab Title: "+driver.getTitle());
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div/nav/div/div[2]/div/div[2]/a/div/span")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div/div[2]/nav/a[2]/div/div[2]/span")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div/div[2]/nav/a[1]/div/div[2]/span")).click();
				Thread.sleep(2000);
				//close twiter tab
				driver.close();
				Thread.sleep(3000);
				
				//Switch to Parent Tab
				driver.switchTo().window(newTab.get(0));
				//Switch to new TAB(facebook)
				driver.switchTo().window(newTab.get(3));
				System.out.println("New Tab Title: "+driver.getTitle());
				Thread.sleep(2000);
				// Screenshort
				  TakesScreenshot ts=(TakesScreenshot)driver;
				  File src=ts.getScreenshotAs(OutputType.FILE);
				  FileHandler.copy(src,new File(".\\Infinity_facebook_page.png"));
				  Thread.sleep(2000);
				//close facebook tab
				driver.close();
				Thread.sleep(3000);
				
				//Switch to Parent Tab
				driver.switchTo().window(newTab.get(0));
		  }
	  
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }
}
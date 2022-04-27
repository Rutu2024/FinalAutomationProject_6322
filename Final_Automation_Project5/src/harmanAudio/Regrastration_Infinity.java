package harmanAudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Regrastration_Infinity 
{
	WebDriver driver;
  @Test
  public void Regrastration() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\TEATING THINGS\\automation testins\\brosure extention\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		//maximize window
		driver.manage().window().maximize();	
	     // url
	    driver.get("https://www.harmanaudio.in/infinity");
	    Thread.sleep(3000);
       //my account
        driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/a/span[1]")).click();
        Thread.sleep(2000);
	   //sign up
	    driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/ul/li[2]/a")).click();
	    Thread.sleep(2000); 
	    // Enter First name
	    driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_firstname\"]")).sendKeys("Rutuja");
	    Thread.sleep(2000);
	    // Enter Last name
	    driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_lastname\"]")).sendKeys("Datir");
	    Thread.sleep(2000);
	    //Enter email
	    driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_email\"]")).sendKeys("rutudatir1998@gmail.com");
	    Thread.sleep(2000);
	    //Enter conferm email
	    driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_emailconfirm\"]")).sendKeys("rutudatir1998@gmail.com");
	    Thread.sleep(2000);
	    //Enter password
	    driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_login_password\"]")).sendKeys("RutsPik@24");
	    Thread.sleep(2000);
	    //Enter conferm password
	    driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_login_passwordconfirm\"]")).sendKeys("RutsPik@24");
	    Thread.sleep(2000);
	    // click second check box 
	    driver.findElement(By.xpath("//*[@id=\"RegistrationForm\"]/fieldset[2]/div[6]/div/label[2]")).click();
	    Thread.sleep(2000);  
	    // click login 
	    driver.findElement(By.xpath("//*[@id=\"RegistrationForm\"]/fieldset[2]/div[7]/button")).click();
	    Thread.sleep(2000);   
  }
}

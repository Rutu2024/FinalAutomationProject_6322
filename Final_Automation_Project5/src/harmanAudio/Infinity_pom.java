package harmanAudio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Infinity_pom 
{
	//url
	public void url(WebDriver driver)
	{
		driver.get("https://www.harmanaudio.in/infinity");
	}
	//acount
	public void myaccount(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/a/span[1]")).click();
	}
	//sign in
	public void signin(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/ul[2]/li[6]/ul/li[1]/a")).click();
	}
	//user name/email
	public void username(WebDriver driver, String usn)
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div/form/div[1]/input")).sendKeys(usn);
	}
	//password
	public void password(WebDriver driver, String pwd)
	{
		driver.findElement(By.xpath("//*[@id=\"dwfrm_login_password\"]")).sendKeys(pwd);
	}
	//login
	public void loginbutton(WebDriver driver)
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div/form/button")).click();
	}
	//logout
	public void logout(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"primary\"]/h1/span/a")).click();
	}
	}
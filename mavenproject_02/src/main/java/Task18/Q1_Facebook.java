package Task18;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q1_Facebook {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		//open facebook page
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);		
		//click create new account
	    driver.findElement(By.xpath( "//a[@data-testid='open-registration-form-button']")).click();
	    
	  Thread.sleep(2000);
	  // send the firstname and lastname
	  driver.findElement(By.name("firstname")).sendKeys("Test");
	  driver.findElement(By.name("lastname")).sendKeys("User");
	  
	 driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
	 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testuser@test.com");
	 
	 driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
	 
	 //dropdown for date of birth
	 
	 WebElement dateElement= driver.findElement(By.id("day"));
	 Select day = new Select(dateElement);
	 day.selectByVisibleText("10");
	
	WebElement monthElement = driver.findElement(By.id("month"));
	Select month = new Select(monthElement);
	month.selectByVisibleText("Jun");
	 
	 WebElement yearElement= driver.findElement(By.id("year"));
	 Select year = new Select(yearElement);
	 year.selectByVisibleText("1998");
	 
	//radio button for gender
	 driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();//for female 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();//for male
	 
      //signup 
	 
	 driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	 
	 System.out.println("facebook login sucessfully");
	 
	 driver.close();
	 
	  
	}
}

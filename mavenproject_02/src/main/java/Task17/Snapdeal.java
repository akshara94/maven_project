package Task17;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Snapdeal {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com");
		
		Thread.sleep(2000);
		
		//signin button
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div")).click();
		
		
		//hold it 3 second
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		 //click Login button
		 
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]")).click();
		
		//Create id
		
	     driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("akshara11@outlook.com");
	     
	     driver.findElement(By.xpath("//button[@id='checkUser']")).click();
	     
	     driver.findElement(By.xpath("//input[@id='j_password']")).sendKeys("qqq0719");
	     
	     driver.findElement(By.xpath("//input[@id='j_name']")).sendKeys("Akshara");
	     
	     driver.findElement(By.xpath("//input[@id='j_number']")).sendKeys("9876543210");
	     
	     Thread.sleep(2000);	  
	     
	     //click signin button
	    
	     driver.findElement(By.xpath("//button[@id='userSignup']")).click();
	    
	     
	     System.out.println("loged successfully");
		
	     driver.close();
		

	}

}

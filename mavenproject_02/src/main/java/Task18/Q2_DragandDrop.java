package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2_DragandDrop {

	public static void main(String[] args) throws Exception {
		
	
				WebDriver driver = new ChromeDriver();
				
			  driver.manage().window().maximize();

				
               driver.get("https://jqueryui.com/droppable/");
				
			  //drag and drop id
				
				driver.switchTo().frame(0);
				
				WebElement source = driver.findElement(By.id("draggable"));
				WebElement target = driver.findElement(By.id("droppable"));
				
				Thread.sleep(2000);
				
				//create an action obj
				
				Actions action = new Actions(driver);
				
				String colourBeforeDnD = target.getCssValue("color");
				
				//action.dragAndDrop(source, target).build().perform();
				
				action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();

				String colorAfterDnD = target.getCssValue("color");
				
				System.out.println("Color before Drag and Drop : "+ colourBeforeDnD);
				
				System.out.println("Color after Drag and Drop : "+ colorAfterDnD);
			}
}

		

	



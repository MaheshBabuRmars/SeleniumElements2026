package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest {
	
	WebDriver driver = new ChromeDriver();
	
	@Test (enabled = false)
	public void actionstest_MouseHover() {
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		
		Actions action = new Actions(driver);
		
		WebElement image2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
		action.moveToElement(image2).perform();

		// Caption appears in the same figure after hover (e.g. "name: user2")
		WebElement hoverCaption = driver.findElement(By.xpath("(//div[@class='figcaption'])[2]/h5"));
		String hoverValue = hoverCaption.getText();
		System.out.println("Hover value: " + hoverValue);

		driver.quit();
	}
	
	@Test (enabled = true)
	public void dragAndDropTest() {
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
		
		action.dragAndDrop(source, target).perform();
		
		driver.quit();
	}
	
	
}



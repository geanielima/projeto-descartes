package testeautomatizado;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class CodePenPages {

	WebDriver driver= new FirefoxDriver();
	public CodePenPages(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void visitCodePen(String url) {
		driver.get(url);
	}
	
	public void LongClick() {
		driver.switchTo().frame("result");
		WebElement square = driver.findElement(By.className("square"));
		Actions actions = new Actions(driver); 
		actions.moveToElement(square); 
	    actions.clickAndHold().perform(); 
	}
	
	public void validateSquareSize(int height,int width) throws InterruptedException {
		Thread.sleep(1000);
		WebElement squareExpand = driver.findElement(By.className("expand"));
		Assert.assertEquals(squareExpand.getSize().height,height);
	    Assert.assertEquals(squareExpand.getSize().width, width);
	}
}
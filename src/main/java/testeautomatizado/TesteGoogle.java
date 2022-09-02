package testeautomatizado;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class TesteGoogle {
    @Test
	public  void teste() throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\geani\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.get("https://codepen.io/choskim/pen/RLYebL");
		
		driver.switchTo().frame("result");
		WebElement element = driver.findElement(By.className("square"));
		Actions actions = new Actions(driver); 
		actions.moveToElement(element); 
	    actions.clickAndHold().perform(); 
	    
	    
	    Thread.sleep(10000);
	    WebElement element2 = driver.findElement(By.className("expand"));
	    Assert.assertEquals(element2.getSize().height,225);
	    Assert.assertEquals(element2.getSize().width, 225);
	}
}

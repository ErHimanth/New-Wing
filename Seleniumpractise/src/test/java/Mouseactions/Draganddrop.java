package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	}
	@Test
	public void alert() throws InterruptedException
	{
		Actions ac = new Actions(driver);
		driver.switchTo().frame(0);
		
	   WebElement  drag = driver.findElement(By.id("draggable"));
	   WebElement drop = driver.findElement(By.id("droppable"));
	
		
		ac.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	

}

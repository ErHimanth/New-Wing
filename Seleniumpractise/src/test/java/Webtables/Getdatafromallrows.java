package Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Getdatafromallrows {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
	}
	@Test
	public void counttables()
	{
		 String part1 = "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		 String part2 = "]/td[1]";
		 for(int i=1;i<=36;i++)
		 {
			String value= driver.findElement(By.xpath(part1+i+part2)).getText(); 
			System.out.println(value);
		 }
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	

}

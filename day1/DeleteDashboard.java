package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteDashboard {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li")).click();
	    driver.findElement(By.xpath("//input[@class='search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input']")).sendKeys("Vigneshwari",Keys.ENTER);
	    Thread.sleep(3000);
	    WebElement findElement = driver.findElement(By.xpath("//span[@class='highlightSearchText']"));
	    driver.executeScript("arguments[0].click();", findElement);
	    WebElement findElement1 = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
	    driver.switchTo().frame(findElement1);
	    driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled ignore-click-mJ-Am8AMeu menuTrigger']")).click();
		
		
	    driver.findElement(By.xpath("//span[text()='Delete']")).click();
	    driver.findElement(By.xpath("//button[text()='Delete']")).click();
	}

}

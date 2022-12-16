package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Anu");
		WebElement title = driver.findElement(By.id("title"));
		Select titleDropDrop=new Select(title);
		titleDropDrop.selectByVisibleText("Mrs");
		driver.findElement(By.id("middleName")).sendKeys("S");
		driver.findElement(By.id("lastName")).sendKeys("S");
		WebElement sexDropDown = driver.findElement(By.id("sex"));
		Select dropDown=new Select(sexDropDown);
		dropDown.selectByVisibleText("Female");
		WebElement employmentStatusDropDown = driver.findElement(By.id("employmentStatus"));
		Select dropDown1=new Select(employmentStatusDropDown);
		dropDown1.selectByVisibleText("Full-time");
		driver.findElement(By.id("age")).sendKeys("23");
		WebElement martialStatus = driver.findElement(By.id("maritalStatus"));
		Select martialDropDown=new Select(martialStatus);
		martialDropDown.selectByVisibleText("Single");
		driver.findElement(By.id("numberOfDependents")).sendKeys("4");
		driver.findElement(By.id("username")).sendKeys("Anu");
		driver.findElement(By.id("email")).sendKeys("Anu@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		//driver.close();

	}

}

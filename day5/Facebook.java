package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Anu**0986");
		WebElement birthdayDay = driver.findElement(By.id("day"));
		Select birthday=new Select(birthdayDay);
		birthday.selectByVisibleText("5");
		WebElement birthMonth = driver.findElement(By.id("month"));
		Select birthdayMonth=new Select(birthMonth);
		birthdayMonth.selectByVisibleText("Oct");
		WebElement birthYear = driver.findElement(By.id("year"));
		Select birthdayYear=new Select(birthYear);
		birthdayYear.selectByVisibleText("1999");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		//driver.close();
		

	}

}

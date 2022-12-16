package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		WebElement registed = driver.findElement(By.id("REGISTERED_BY"));
        Select dropDown=new Select(registed);
        dropDown.selectByVisibleText("Myself");
        driver.findElement(By.id("NAME")).sendKeys("Anu");
        driver.findElement(By.id("genderfemale")).click();
        WebElement birthday = driver.findElement(By.id("DOBDAY"));
        Select dropDown1=new Select(birthday);
        dropDown1.selectByVisibleText("4");
        WebElement birthMonth = driver.findElement(By.id("DOBMONTH"));
        Select dropDown2=new Select(birthMonth);
        dropDown2.selectByVisibleText("Oct");
        WebElement birthYear = driver.findElement(By.id("DOBYEAR"));
        Select dropDown3=new Select(birthYear);
        dropDown3.selectByVisibleText("1999");
        WebElement religion = driver.findElement(By.id("RELIGION"));
        Select dropDown4=new Select(religion);
        dropDown4.selectByVisibleText("Hindu");
        WebElement mother = driver.findElement(By.id("MOTHERTONGUE"));
        Select dropDown5=new Select(mother);
        dropDown5.selectByVisibleText("Tamil");
        WebElement country = driver.findElement(By.id("COUNTRY"));
        Select dropDown6=new Select(country);
        dropDown6.selectByVisibleText("India");
        driver.findElement(By.id("MOBILENO")).sendKeys("9876543210");
        driver.findElement(By.id("EMAIL")).sendKeys("Anu@gmail.com");
        
	}

}

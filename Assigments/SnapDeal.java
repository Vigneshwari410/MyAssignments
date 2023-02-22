package week8.day5.Assigments;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[@class='catText'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//picture[@class='picture-elem']"));
		for (int i = 0; i < findElements.size(); i++) {
			findElements.get(i).getText();
		}
		System.out.println("count"+findElements.size());
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		//driver.findElement(By.xpath("//span[@class='arrow ']")).click();
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
		WebElement findElement = driver.findElement(By.xpath("(//input[@class='input-filter'])[1]"));
		findElement.clear();
		Thread.sleep(3000);
		findElement.sendKeys("900");
	    WebElement findElement2 = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		findElement2.clear();
		findElement2.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(3000);
		WebElement mouse = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions act = new Actions(driver);
		act.moveToElement(mouse).build().perform();
		WebElement findElement3 = driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])/div"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		String findElement5 = findElement4.getText();
		System.out.println(findElement5);
		WebElement findElement6 = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		String findElement7 = findElement6.getText();
		System.out.println(findElement7);
		//File picture = driver.getScreenshotAs(OutputType.FILE);
		//File fs = new File("./snap/img.png");
		//FileHandler.copy(picture, fs);
		driver.close();
	}

}

package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("https://www.facebook.com/");
		//add implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//maximize the browser
		driver.manage().window().maximize();
		//create new account button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		//enter first name as DAYA
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("DAYA");
		//enter last name as NANDHAN
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NANDHAN");
		//enter mobile number as 9962232099
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9962232099");
		//enter your password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("logambal");
		//select date
		WebElement date =driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select datedd = new Select(date);
		datedd.selectByVisibleText("25");
		//select month
		WebElement month =driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select monthdd = new Select(month);
		monthdd.selectByVisibleText("Nov");
		//select year
		WebElement year =driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select yeardd = new Select(year);
		yeardd.selectByVisibleText("2001");
		//click on gender
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		//close the browser
		driver.close();
		
		
	}	
				
			
	}
	

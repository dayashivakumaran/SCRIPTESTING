package week5day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tamilmatrimony1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

				driver.get("https://www.tamilmatrimony.in/");

				driver.manage().window().maximize();

				WebElement forDD = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));

				Select forDropDown = new Select(forDD);

				forDropDown.selectByVisibleText("Myself");		

				driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("DAYA");

				driver.findElement(By.xpath("//input[@id='gendermale']")).click();

				WebElement DateDD = driver.findElement(By.xpath("//select[@id='DOBDAY']"));

				Select DateDropDown = new Select(DateDD);

				DateDropDown.selectByIndex(25);

				Select month = new Select(driver.findElement(By.xpath("//select[@id='DOBMONTH']")));

				month.selectByVisibleText("Nov");

				Select year = new Select(driver.findElement(By.xpath("//select[@id='DOBYEAR']")));

				year.selectByVisibleText("2001");

				WebElement religionDD = driver.findElement(By.xpath("//select[@id='RELIGION']"));

				Select RelDropDown = new Select(religionDD);

				RelDropDown.selectByVisibleText("Hindu");


				Select motherTongue = new Select(driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")));

				motherTongue.selectByVisibleText("Tamil");


				Select country = new Select(driver.findElement(By.xpath("//select[@id='COUNTRY']")));

				country.selectByVisibleText("India");


				Select countryCode = new Select(driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']")));

				countryCode.selectByVisibleText("+91");

				driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9962232099");

				driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("dayashivakumaran@gmail.com");

				driver.findElement(By.xpath("//input[@name='PASSWD1']")).sendKeys("logambal");

				System.out.println("Title of Page: " + driver.getTitle());

				//driver.close();
	}


	

}

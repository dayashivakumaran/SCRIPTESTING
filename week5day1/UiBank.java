package week5day1;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class UiBank {
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();

			driver.get("https://uibank.uipath.com/");

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.findElement(By.xpath("//button[@class='btn btn-white btn-xl get-started-button']")).click();

			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("DAYA");

			WebElement findElement = driver.findElement(By.xpath("//select[@id='title']"));

			Select Title=new Select(findElement);

			Title.selectByVisibleText("Mr");

			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("NANDHAN");

			WebElement findElement2 = driver.findElement(By.xpath("//select[@name='gender']"));

			Select Gender=new Select(findElement2);

			Gender.selectByVisibleText("Male");

			WebElement findElement3 = driver.findElement(By.xpath("//select[@name='employmentStatus']"));

			Select Employee=new Select(findElement3);

			Employee.selectByVisibleText("Full-time");

			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DAYA");

			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dayashivakumaran@gmail.com");

			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("logambal");

			System.out.println("Title of Page: " + driver.getTitle());

			driver.close();





		}


}

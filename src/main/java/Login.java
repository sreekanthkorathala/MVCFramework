import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
@Test()
	
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseurl="https://www.amazon.in/";
		driver.navigate().to(baseurl);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7997750351");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("sreekvkr@0910");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
}

		@Test
		public void open() throws InterruptedException {
			Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/li[3]/a")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id=\"zg-ordered-list\"]/li[4]/span/div/span/a/span/div/img")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		}
		@Test
		public void logout() throws InterruptedException {
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
			 Thread.sleep(3000);
			 js.executeScript("window.scrollBy(0,1000)");
			 driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[29]/a")).click();
			
		}
}

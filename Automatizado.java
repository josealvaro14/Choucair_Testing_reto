package Choucair_reto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatizado {
	
	private WebDriver driver;
	
	By registerLinklocator = By.linkText("Empleos");
	By registerpagelocator = By.xpath("//img[@src=https://www.choucairtesting.com/wp-content/uploads/2019/07/banner.png]");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chrome_driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
		}
	@After
	public void teardown() throws Exception {
		driver.quit();
     	}
	@Test
	public void categoriaempleos(){
		driver.findElement(registerLinklocator).click();
	    if(driver.findElement(registerpagelocator).isDisplayed()) {
	      }
	    else {
	    	System.out.print("IMAGEN NO PRESENTE");
	    	}
		 }
	}
	
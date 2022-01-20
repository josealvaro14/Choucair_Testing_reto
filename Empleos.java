package Choucair_reto;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empleos {

private WebDriver driver;

@Before
public void setUp(){
	System.setProperty("webdriver.chrome.driver","./src/test/resources/chrome_driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
    }	
@SuppressWarnings("deprecation")
@Test
public void categoriaempleos(){
	WebElement searchbox = driver.findElement(By.name("q"));
	searchbox.clear();
	searchbox.sendKeys("choucair testing");
	searchbox.submit();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@After 
public void teardown() {
	driver.quit();
  }
}
package com.iplacex.BancoPlatinium;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTestNG {
	private WebDriver driver;
	
  @Test
  public void f() {
    WebElement cuadroBusqueda = driver.findElement(By.name("q"));
    cuadroBusqueda.sendKeys(null);
    cuadroBusqueda.click();
    
    cuadroBusqueda.submit();
    
    driver.manage().timeouts().implicitlyWait(10. TimeUnit.SECONDS);
    
    assertEquals("", driver.getTitle());
  }

  @BeforeTest
  public void BeforeTest() {
    System.setProperties("webdriver.chrome.driver", "C:\\Users\\gtx 1050ti\\OneDrive\\Escritorio\\Poryecto Banco");
    driver = new Chromedriver();
    driver.manage().window().maximize();
    driver.get("http://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
    driver.quit();
  }

}

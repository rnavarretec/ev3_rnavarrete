package StepDefinition;

import org.openga.selenium.By;
import org.openga.selenium.WebDriver;
import org.openga.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps 
{
	WebDriver driver;
	
    @Given ("Abrir Chrome")
    public void abrir_Chrome(){
    	System.out.println("En este paso abre el navegador google Chrome");
    	System.setProperty("webdriver.chrome.driver", "C:\Users\gtx 1050ti\OneDrive\Escritorio\Poryecto Banco");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com");
    }

    @When ("ingresa Username {String} y Password {String}")
    public void ingresa_User_name_y_Password(String string, String string2){
    	System.out.println("En este paso ingresa las credenciales de usuario");
       	System.out.println("En este paso ingresa el nombre de usuario y contraseña");
    	driver.findElement(By.id("username")).sendKeys(string);
     	driver.findElement(By.id("username")).sendKeys(string2);
    }	
    @Then ("inicia sesion")
    public void inicia_sesion(){
    	System.out.println("En este paso iniscia sesion con los datos ingresados en MyTest.feature");
    	driver.findElement(By.id("loginbtn")).click();
    }
}



 




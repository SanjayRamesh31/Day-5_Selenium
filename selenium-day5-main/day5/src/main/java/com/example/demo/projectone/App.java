 
package com.example.demo.projectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Atchaya");
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Subramanian");
    	driver.findElement(By.id("input-email")).sendKeys("atchayaachu630@gmail.com");
    	driver.findElement(By.id("input-password")).sendKeys("Atchaya@10");
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
    	
    	
    }
}

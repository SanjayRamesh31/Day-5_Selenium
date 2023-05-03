package com.example.demo.projectone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day51 {

    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://jqueryui.com/droppable/");
    	driver.manage().window().maximize();
    	System.out.print("Switched");
         driver.switchTo().frame(0);
       WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
	   WebElement drop= driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
	    Actions act= new Actions(driver);
         act.dragAndDrop(drag,drop).build().perform();
         Thread.sleep(5000);
	    
	    driver.switchTo().defaultContent();
	    WebElement button=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[3]/a"));
	    button.click();
    }
}

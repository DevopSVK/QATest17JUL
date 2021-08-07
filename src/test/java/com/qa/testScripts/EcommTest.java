// Generated by Selenium IDE
package com.qa.testScripts;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class EcommTest {
  @Test
  public void setUp()  throws InterruptedException
  {
    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
     driver.get("http://172.31.37.152:8181/");
    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
    Thread.sleep(2000); 
    driver.manage().window().setSize(new Dimension(1550, 838));
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".hero-content > .btn")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Shop")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Dresses")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".col-12:nth-child(1) .hover-img")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".col-12:nth-child(1) .btn")).click();
  }
}

package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {
    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();
        oikeaTunnusJaSalasana(driver);
        //oikeaTunnusVaaraSalasana(driver);
        //olematonTunnus(driver);
        //rekisteroi(driver);
        //rekisteroiJaUlos(driver);
    }
    
    public static void oikeaTunnusJaSalasana(WebDriver driver) {
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }
    
    public static void oikeaTunnusVaaraSalasana(WebDriver driver){
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akke");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }
    
    public static void olematonTunnus(WebDriver driver){
        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("ekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akke");
        element = driver.findElement(By.name("login"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());
    }
    
    public static void rekisteroi(WebDriver driver){
        driver.get("http://localhost:8090");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("register new user"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("hirvi");
        element = driver.findElement(By.name("password"));
        element.sendKeys("harju");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("harju");
        element = driver.findElement(By.name("add"));
        element.submit();
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );
    }
    
    public static void rekisteroiJaUlos(WebDriver driver){
        driver.get("http://localhost:8090");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("register new user"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("hirvi");
        element = driver.findElement(By.name("password"));
        element.sendKeys("harju");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("harju");
        element = driver.findElement(By.name("add"));
        element.submit();
        
        System.out.println("==");
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        
        System.out.println("==");
        System.out.println(driver.getPageSource());
        element = driver.findElement(By.linkText("logout"));
        element.click();
        
        System.out.println("==");
        System.out.println(driver.getPageSource());
    }
}

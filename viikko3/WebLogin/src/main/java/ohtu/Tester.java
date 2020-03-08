package ohtu;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/emma/Asiakirjat/chromedriver_linux64/chromedriver");
        
        WebDriver driver = new ChromeDriver();

        Random r = new Random();
        
        driver.get("http://localhost:4567");
        
        sleep(2);
        
        // KIRJAUTUMINEN
//        WebElement element = driver.findElement(By.linkText("login"));
//        element.click();
//
//        sleep(2);

        // Toimiva kirjautuminen
//        element = driver.findElement(By.name("username"));
//        element.sendKeys("pekka");
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("akkep");
//        element = driver.findElement(By.name("login"));
//        
        // Väärä salasana
//        element = driver.findElement(By.name("username"));
//        element.sendKeys("pekka");
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("pekka");
//        element = driver.findElement(By.name("login"));
//        
        



        // REKISTERÖITYMINEN
        
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();
        
        sleep(2);
        
        element = driver.findElement(By.name("username"));
        element.sendKeys("chispa" + r.nextInt(100000));
        element = driver.findElement(By.name("password"));
        element.sendKeys("salasana1");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("salasana1");
        element = driver.findElement(By.name("signup"));
        
        
        sleep(2);
        element.submit();

        // KIRJAUTUMINEN ULOS
        sleep(2);
        
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        sleep(2);
        element = driver.findElement(By.linkText("logout"));
        element.click();
                
        sleep(3);
        
        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}

package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nadzeya_Ilyina\\Documents\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://controlc.com/");

        //I Can Win
        /*
        WebElement title = driver.findElement(By.id("paste_title"));
        title.sendKeys("helloweb");

        WebElement inputText = driver.findElement(By.id("input_text"));
        inputText.sendKeys("Hello from WebDriver");
        */

        //Bring It On
        /*
        WebElement title = driver.findElement(By.id("paste_title"));
        title.sendKeys("how to gain dominance among developers");

        WebElement inputText = driver.findElement(By.id("input_text"));
        inputText.sendKeys(
                "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");
        WebElement hHighlighting = driver.findElement(By.id("codeSyntax"));
        hHighlighting.sendKeys("Yes");

        WebElement submit = driver.findElement(By.xpath("//*[@value='Submit']"));
        submit.submit();
        */
        Thread.sleep(600000);
        driver.quit();
    }
}

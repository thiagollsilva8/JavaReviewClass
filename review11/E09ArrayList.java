package review11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class E09ArrayList {

    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.amazon.com/");

        List<WebElement> allATags = webDriver.findElements(By.xpath("//a"));

        for (WebElement e : allATags) {
            if (!e.getText().isEmpty()) {
                System.out.println(e.getText());
            }
        }

        webDriver.close();

    }
}
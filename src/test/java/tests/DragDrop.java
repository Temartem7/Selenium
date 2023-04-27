package tests;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop extends BaseClass {

    @Test
    public void slide() throws InterruptedException {
        getDriver().get("https://omayo.blogspot.com/p/page3.html");
//        WebElement minPrice = getDriver().findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
//        WebElement maxPrice = getDriver().findElement(By.xpath("//a[@aria-labelledby='price-max-label']"));
//        Actions act = new Actions(getDriver());
//        Thread.sleep(3000);
//        act.dragAndDropBy(minPrice,200,0).build().perform();
//        Thread.sleep(3000);
    }
}

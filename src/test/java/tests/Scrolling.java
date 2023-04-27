package tests;

import actionDriver.Action;
import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolling extends BaseClass {

    Action action = new Action();
    @Test
    public void testScrolling()throws InterruptedException{
        getDriver().get("http://omayo.blogspot.com/p/page3.html");
        WebElement username = getDriver().findElement(By.name("userid"));
        JavascriptExecutor js= (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",username );
        Actions actions = new Actions(getDriver());
        actions.moveToElement(username).build().perform();
        username.sendKeys("Hello");
        Thread.sleep(3000);
    }

    @Test
    public void testActionScrolling() throws InterruptedException {
        getDriver().get("http://omayo.blogspot.com/p/page3.html");
        WebElement username = getDriver().findElement(By.name("userid"));
        action.moveToElement(getDriver(),username);
        username.sendKeys("Hello");
        Thread.sleep(3000);
    }

}

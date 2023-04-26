package tests;

import actionDriver.Action;
import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert extends BaseClass {

    Action action = new Action();
    @Test
    public void testAlertHandle() {
        getDriver().get("https://omayo.blogspot.com/");
        WebElement ele = getDriver().findElement(By.id("alert1"));
        ele.click();
        org.openqa.selenium.Alert alert = getDriver().switchTo().alert();
        String alertMsg = alert.getText();
        alert.accept();
        System.out.println(alertMsg);
    }

    @Test
    public void testActionAlertHandle() {
        getDriver().get("https://omayo.blogspot.com/");
        WebElement ele = getDriver().findElement(By.id("alert1"));
        ele.click();
       action.alertHandle(getDriver());
       action.click(getDriver(),ele);
    }

}

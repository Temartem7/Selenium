package tests;

import actionDriver.Action;
import actionInterface.ActionInterface;
import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class RadioCheckboxes extends BaseClass {

    Action action = new Action();
    @Ignore
    @Test
    public void testCheckBoxRadioButton() throws InterruptedException {
        getDriver().get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
        Thread.sleep(10000);
        action.scrollByVisibilityOfElement(getDriver(), getDriver().findElement(By.name("Other_Hobby")));
        action.moveToElement(getDriver(), getDriver().findElement(By.name("Other_Hobby")));
        List<WebElement> options = getDriver().findElements(By.xpath("//input[@type='checkbox' and @name='Hobby']"));
        for (int i = 0; i < options.size(); i++) {
            WebElement ele = options.get(i);
            String hobbies = ele.getAttribute("value");
            System.out.println(hobbies);
            if (hobbies.contains("Sketching")){
                ele.click();
                break;
            }
        }
    }

}

package tests;

import actionDriver.Action;
import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DropDown_MultiDropDown extends BaseClass {

    Action action = new Action();
    @Test
    public void dropDown() throws InterruptedException {
        getDriver().get("http://omayo.blogspot.com/");
        Select letter = new Select(getDriver().findElement(By.id("drop1")));
        letter.selectByIndex(3);
        List<WebElement> options = letter.getOptions();
        for (WebElement ele : options){
            String currElement = ele.getText();
            System.out.println(currElement);
        }
    }

    @Test
    public void multiSelect(){
        getDriver().get("http://omayo.blogspot.com/");
        Select cars = new Select(getDriver().findElement(By.id("multiselect1")));
        cars.selectByIndex(0);
        cars.selectByIndex(1);
        cars.selectByIndex(2);

//        List<String> expectedList = new ArrayList<>();
//        expectedList.add("Volvo");
//        expectedList.add("Swift");
//        expectedList.add("Hyundai");
//
//        List<String> actualList = new ArrayList<>();
//        List<WebElement> allSelectedOptions = cars.getAllSelectedOptions();
//        for (WebElement ele : allSelectedOptions){
//            actualList.add(ele.getText());
//            System.out.println(ele.getText());
//        }
//
//        boolean res = actualList.equals(expectedList);
//        System.out.println(res);
    }
}

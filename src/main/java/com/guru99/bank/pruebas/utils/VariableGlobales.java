package com.guru99.bank.pruebas.utils;

import com.guru99.bank.pruebas.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.List;

import java.util.concurrent.TimeUnit;
public class VariableGlobales {

    public static JavascriptExecutor executor;
    private static LoginPage loginPage = new LoginPage();
    public static WebDriver driver;

    public static WebElement randomElement(WebDriver driver, By by) {
        List<WebElement> listElements = driver.findElements(by);
        int elementPosition = (int) (Math.random() * listElements.size());
        return listElements.get(elementPosition);
    }

    public static void clickJS(WebDriver driver,By by) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",driver.findElements(by));

    }

    public static void clickJSWebElement(WebDriver driver,WebElement elemento) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elemento);
    }
    public static void EnterRobot() {
        try {
            Robot robot = new Robot();  // Robot class throws AWT Exception
            Thread.sleep(2000); // Thread.sleep throws InterruptedException
            robot.mouseMove(1000, 600);
            //   robot.keyPress(KeyEvent.VK_E);
            Thread.sleep(2000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            //    robot.keyPress(KeyEvent.VK_E);
        } catch (Exception e1) {
        }
    }

    public void Scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        //js.executeScript("arguments[0].scrollIntoView();", newCustomerPage.getBntScroll());
    }

}

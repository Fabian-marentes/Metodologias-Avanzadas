package com.guru99.bank.pruebas.utils;

import com.guru99.bank.pruebas.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import java.util.concurrent.TimeUnit;
public class VariableGlobales {

    public static JavascriptExecutor executor;
    private static LoginPage loginPage = new LoginPage();

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

}

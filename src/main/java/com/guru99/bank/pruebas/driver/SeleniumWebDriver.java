package com.guru99.bank.pruebas.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver {

    public static WebDriver driver;

    //este metodo tiene la funcion de levantar el navegador
    public static void ChromeWebDriver(String url){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.get(url);
    }

}
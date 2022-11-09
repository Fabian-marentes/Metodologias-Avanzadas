package com.guru99.bank.pruebas.utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Espera {

    public static void esperaImplicita(WebDriver driver, int segundos) {
        driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }

    public static void esperaExplicita(int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.pages.NewCustomerPage;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.InputEvent;

public class NewCustomerStep extends PageObject {
    public static WebDriver driver;

    //Escribe el texto en cualquier campo que tenga habilitada la opcion de escribir en el
    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    //Selecciona el elemento que se desee
    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }


    //los metodos que tienen el nombre tipo: -escribir"Nombre"-, son utilizados para rellenar los campos vacios del formulario con informacion
    public void ClickVentanaCliente(String txt) {
        clicEnElemento(NewCustomerPage.getBtnCustomer());
    }

    public void EnterRobot() {
        try {
            Robot robot = new Robot();  // Robot class throws AWT Exception
            Thread.sleep(2000); // Thread.sleep throws InterruptedException
            robot.mouseMove(1000,600);
            //   robot.keyPress(KeyEvent.VK_E);
            Thread.sleep(2000);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            //    robot.keyPress(KeyEvent.VK_E);
        } catch (Exception e1) {
        }
    }
    public void IngresarDatos(String txt) {

        escribirEnTexto(NewCustomerPage.getTxtName(), txt);
        clicEnElemento(NewCustomerPage.getFieldGender());
        escribirEnTexto(NewCustomerPage.getTxtDate(), txt);
        escribirEnTexto(NewCustomerPage.getTxtCity(), txt);
        escribirEnTexto(NewCustomerPage.getTxtAdress(), txt);
        escribirEnTexto(NewCustomerPage.getTxtState(), txt);
        escribirEnTexto(NewCustomerPage.getTxtPin(), txt);
        escribirEnTexto(NewCustomerPage.getTxtPhone(), txt);
        escribirEnTexto(NewCustomerPage.getTxtEmail(), txt);
        escribirEnTexto(NewCustomerPage.getTxtPassword(), txt);

        //presiona el boton subtim para guardar cambios en el codigo
        clicEnElemento(NewCustomerPage.getBtnSubtim());
        //Selecciona el genero

    }


}




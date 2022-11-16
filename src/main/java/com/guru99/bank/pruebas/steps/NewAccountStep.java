package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.models.DataInjection;
import com.guru99.bank.pruebas.pages.LoginPage;
import com.guru99.bank.pruebas.pages.NewAccountPage;
import com.guru99.bank.pruebas.utils.VariableGlobales;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountStep {

    public static WebDriver driver;
    LoginPage loginPage= new LoginPage();
    NewAccountPage newAccountPage = new NewAccountPage();
    DataInjection dataInjection = new DataInjection();


    //Escribe el texto en cualquier campo que tenga habilitada la opcion de escribir en el
    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }


    //Selecciona el elemento que se desee
    public void clicEnElemento(By elemento) {
        driver.findElement(elemento).click();
    }

    //-------------------------------------------------------------------------------------------------------

    //Este metodo tiene la función de dar click en la seccion de nueva cuenta,
    // escribe en el campo el ID del cliente creado y selecciona el tipo de cuenta
    //Escribe el deposito y da click en el boton de suptin para crear la cuenta


    public void escribirCustomerId(String txt) {

        clicEnElemento(NewAccountPage.getBtnNewAccount());
        //escribirEnTexto(NewAccountPage.getTxtCustomer(), txt);
        clicEnElemento(NewAccountPage.getBtnCurrent());
    }

    //Escribe el deposito y da click en el boton de suptin para crear la cuenta
    public void escribirDeposito(String txt) {
        escribirEnTexto(NewAccountPage.getTxtInitialDeposit(), txt);
        clicEnElemento(NewAccountPage.getBtnSubtim());
    }

}


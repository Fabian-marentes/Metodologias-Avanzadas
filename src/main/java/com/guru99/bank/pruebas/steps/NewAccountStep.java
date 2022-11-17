package com.guru99.bank.pruebas.steps;
import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.models.DataInjection;
import com.guru99.bank.pruebas.pages.LoginPage;
import com.guru99.bank.pruebas.pages.NewAccountPage;
import com.guru99.bank.pruebas.utils.Espera;
import com.guru99.bank.pruebas.utils.VariableGlobales;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountStep extends PageObject {

    NewAccountPage newAccountPage = new NewAccountPage();


    //Escribe el texto en cualquier campo que tenga habilitada la opcion de escribir en el
    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }


    //Selecciona el elemento que se desee
    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    //-------------------------------------------------------------------------------------------------------

    //Este metodo tiene la función de dar click en la seccion de nueva cuenta,
    // escribe en el campo el ID del cliente creado y selecciona el tipo de cuenta
    //Escribe el deposito y da click en el boton de suptin para crear la cuenta

    public void ClickCuenta(){
        Espera.esperaExplicita(2);
        //VariableGlobales.clickJS(getDriver(),);
        clicEnElemento(NewAccountPage.getBtnNewAccount());}

    public void escribirCustomerId(String txt) {
        Espera.esperaExplicita(2);
        escribirEnTexto(NewAccountPage.getTxtCustomer(), txt);
        Espera.esperaExplicita(2);
        clicEnElemento(NewAccountPage.getBtnCurrent());
    }

    //Escribe el deposito y da click en el boton de subtim para crear la cuenta

    public void escribirDeposito(String txt) {
        Espera.esperaExplicita(2);
        escribirEnTexto(NewAccountPage.getTxtInitialDeposit(), txt);
        Espera.esperaExplicita(2);
        clicEnElemento(NewAccountPage.getBtnSubtim());
    }


}

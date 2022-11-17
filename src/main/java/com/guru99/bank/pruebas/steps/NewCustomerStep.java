package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.models.DataInjection;
import com.guru99.bank.pruebas.pages.NewCustomerPage;
import com.guru99.bank.pruebas.utils.Espera;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.*;


public class NewCustomerStep {

    NewCustomerPage newCustomerPage = new NewCustomerPage();
    DataInjection dataInjection = new DataInjection();
    WebDriver driver;

    //Escribe el texto en cualquier campo que tenga habilitada la opcion de escribir en el
    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    @Step
    public void ClickCliente() {
        clicEnElemento(newCustomerPage.getBtnCustomer());
    }

    @Step
    public void ClickCuenta() {
        clicEnElemento(newCustomerPage.getBtnCustomer());
    }
    //Selecciona el elemento que se desee
    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }


    //los metodos que tienen el nombre tipo: -escribir"Nombre"-, son utilizados para rellenar los campos vacios del formulario con informacion

    public void Scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void escribirDato() {

        escribirEnTexto(newCustomerPage.getTxtName(), dataInjection.getNombreCliente());

        clicEnElemento(newCustomerPage.getFieldGender());

        escribirEnTexto(newCustomerPage.getTxtDate(), dataInjection.getFechaCumpleañosDia());
        Espera.esperaExplicita(1);
        escribirEnTexto(newCustomerPage.getTxtDate(), dataInjection.getFechaCumpleañosMes());
        Espera.esperaExplicita(1);
        escribirEnTexto(newCustomerPage.getTxtDate(), dataInjection.getFechaCumpleañosA_o());
        Espera.esperaExplicita(1);
        escribirEnTexto(newCustomerPage.getTxtCity(), dataInjection.getCiudad());
        Espera.esperaExplicita(1);
        escribirEnTexto(newCustomerPage.getTxtAdress(), dataInjection.getDireccion());
        Espera.esperaExplicita(1);
        escribirEnTexto(newCustomerPage.getTxtState(), dataInjection.getEstado());
        Espera.esperaExplicita(1);
        escribirEnTexto(newCustomerPage.getTxtPin(), dataInjection.getPin());
        Espera.esperaExplicita(1);
        escribirEnTexto(newCustomerPage.getTxtPhone(), dataInjection.getNumeroTelefono());
        Espera.esperaExplicita(1);
        escribirEnTexto(newCustomerPage.getTxtEmail(), dataInjection.getCorreo());
        Espera.esperaExplicita(1);
        escribirEnTexto(newCustomerPage.getTxtPassword(), dataInjection.getPassword());
        Espera.esperaExplicita(1);

        //presiona el boton subtim para guardar cambios en el codigo
        clicEnElemento(newCustomerPage.getBtnSubtim());

        Espera.esperaExplicita(1);

    }

}




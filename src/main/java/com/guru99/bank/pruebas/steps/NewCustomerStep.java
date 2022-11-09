package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.pages.NewCustomerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerStep {
    public static WebDriver driver;
    //Escribe el texto en cualquier campo que tenga habilitada la opcion de escribir en el
    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    //Selecciona el elemento que se desee
    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    //-------------------------------------------------------------------------------------------------------
    //selecciona el campo de New Customer
    public void clickBtn() {
        clicEnElemento(NewCustomerPage.getBtnCustomer());
    }


    //los metodos que tienen el nombre tipo: -escribir"Nombre"-, son utilizados para rellenar los campos vacios del formulario con informacion
    public void escribirDato(String txt) {
        escribirEnTexto(NewCustomerPage.getTxtName(), txt);

        //Selecciona el genero
        clicEnElemento(NewCustomerPage.getFieldGender());
    }

    public void escribirFecha(String txt) {
        escribirEnTexto(NewCustomerPage.getTxtDate(), txt);
    }

    public void escribirCiudad(String txt) {
        escribirEnTexto(NewCustomerPage.getTxtCity(), txt);
    }

    public void escribirDireccion(String txt) {
        escribirEnTexto(NewCustomerPage.getTxtAdress(), txt);
    }

    public void escribirEstado(String txt) {
        escribirEnTexto(NewCustomerPage.getTxtState(), txt);
    }

    public void escribirPin(String txt) {
        escribirEnTexto(NewCustomerPage.getTxtPin(), txt);
    }

    public void escribirTelefono(String txt) {
        escribirEnTexto(NewCustomerPage.getTxtPhone(), txt);
    }

    public void escribirCorreo(String txt) {
        escribirEnTexto(NewCustomerPage.getTxtEmail(), txt);
    }

    public void escribirContrasena(String txt) {
        escribirEnTexto(NewCustomerPage.getTxtPassword(), txt);

        //presiona el boton subtim para guardar cambios en el codigo
        clicEnElemento(NewCustomerPage.getBtnSubtim());
    }

}




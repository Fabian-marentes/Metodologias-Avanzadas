package com.guru99.bank.pruebas.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    //Esta parte contiene los localizadores de tipo name
    //los cuales seleccionaran y llenaran los campos vacios con los datos del usuario para ingresar a la plataforma
    public By txtUser = By.name("uid");
    public By txtPassword = By.name("password");
    public By btnLogIn = By.name("btnLogin");

    //Los get son utilizados para mostrar el valor de una propiedad o atributo de un objeto

    public By getTxtUser() {
        return txtUser;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnLogIn() {
        return btnLogIn;
    }
}
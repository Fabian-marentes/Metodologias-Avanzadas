package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.models.DataInjection;
import com.guru99.bank.pruebas.pages.LoginPage;
import com.guru99.bank.pruebas.utils.Espera;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginStep {

    LoginPage loginPage = new LoginPage();
    //Escribe el texto que le enviamos por medio del escenario
    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    //Da click sobre el elemento que le decimos
    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    //el metodo escribe el nombre del usuario
    public void escribirUsuario(String txt) {
        Espera.esperaExplicita(1);
        escribirEnTexto(loginPage.getTxtUser(), txt);
        Espera.esperaExplicita(1);
    }

    //El metodo escribe la clave y da click en el boton de subtim
    public void escribirClave(String txt) {
        Espera.esperaExplicita(1);
        escribirEnTexto(loginPage.getTxtPassword(), txt);
        Espera.esperaExplicita(1);
        clicEnElemento(loginPage.getBtnLogIn());
        Espera.esperaExplicita(2);
    }

}

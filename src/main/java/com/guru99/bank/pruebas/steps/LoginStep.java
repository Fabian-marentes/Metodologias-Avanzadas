package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.pages.LoginPage;
import com.guru99.bank.pruebas.utils.Espera;
import com.guru99.bank.pruebas.utils.VariableGlobales;
import com.sqasa.web.demo.utils.KrakenWeb;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginStep extends PageObject {
    LoginPage loginPage = new LoginPage();

    @Step
    public void setUp() {
        loginPage.open();
    }

    //Escribe el texto que le enviamos por medio del escenario
    @Step
    public void escribirEnTexto(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    //Da click sobre el elemento que le decimos
    @Step
    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    @Step
    public void escribirCredenciales(String usuario, String clave) {
        Espera.esperaExplicita(1);
        escribirEnTexto(loginPage.getTxtUser(), usuario);
        Espera.esperaExplicita(1);
        escribirEnTexto(loginPage.getTxtPassword(), clave);
        Espera.esperaExplicita(1);
        clicEnElemento(loginPage.getBtnLogIn());
        Espera.esperaExplicita(1);
    }

}

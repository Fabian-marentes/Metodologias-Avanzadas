package com.guru99.bank.prueba.stepdefinitions;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.models.Usuario;
import com.guru99.bank.pruebas.steps.LoginStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinition {

    @Steps
    //instanciamos la clase login step la cual permite interactuar con la clase LoginStepDefinition
    LoginStep loginStep = new LoginStep();

    //En el given asignamos la url de la pagina que vamos a automatizar
    @Dado("^que estoy en la pagina de Guru q$")
    public void queEstoyEnLaPaginaDeGuru() {
        SeleniumWebDriver.ChromeWebDriver("http://demo.guru99.com/V4/index.php");

    }

    //En el When asignamos las funcionalidades que quiero que se realicen dentro de la pagina
    @Cuando("^ingreso mi usuario y clave q$")
    public void ingresoMiUsuarioYClave(List<Usuario> usuarioDato) throws InterruptedException {

        loginStep.escribirUsuario(usuarioDato.get(0).getUsuario());
        loginStep.escribirClave(usuarioDato.get(0).getClave());

    }

    //Then tiene la funcion de cerrar la ventana
    @Entonces("^deberia ver el texto SIGN-OFFq$")
    public void deberiaVerElTextoSIGNOFF() {
        SeleniumWebDriver.driver.quit();
    }

}

package com.guru99.bank.prueba.stepdefinitions;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.models.Login;
import com.guru99.bank.pruebas.models.LoginFallido;
import com.guru99.bank.pruebas.models.Usuario;
import com.guru99.bank.pruebas.pages.LoginPage;
import com.guru99.bank.pruebas.steps.LoginStep;
import com.guru99.bank.pruebas.utils.Espera;
import com.sqasa.web.demo.utils.KrakenWeb;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginStepDefinition extends KrakenWeb {

    @Steps
    //instanciamos la clase login step la cual permite interactuar con la clase LoginStepDefinition
    LoginStep loginStep = new LoginStep();

    @Dado("^que estoy en la pagina de Guru99$")
    public void queEstoyEnLaPaginaDeGuru99() {
        SeleniumWebDriver.ChromeWebDriver("http://demo.guru99.com/V4/index.php");
    }

    @Cuando("^ingreso mi usuario y claveU$")
    public void ingresoMiUsuarioYClaveU(List<Usuario> usuarioDato) throws InterruptedException {

        loginStep.escribirUsuario(usuarioDato.get(0).getUsuario());
        Espera.esperaExplicita(1);
        loginStep.escribirClave(usuarioDato.get(0).getClave());
    }

    @Entonces("^deberia ver el texto SIGN-OFF.$")
    public void deberiaVerElTextoSIGNOFFq() {
        SeleniumWebDriver.driver.quit();
    }
//----------------------------------------------------
    @Cuando("^ingreso credenciales erroneas$")
    public void ingresoCredencialesErroneas(List<Login> usuarioDato) throws InterruptedException {

        loginStep.escribirUsuario(usuarioDato.get(0).getUsuario());
        Espera.esperaExplicita(1);
        loginStep.escribirClave(usuarioDato.get(0).getClave());
    }

    @Entonces("^deberia ver que el usuario o la contraseña no son válidas$")
    public void deberiaVerQueElUsuarioOLaContraseñaNoSonVálidas() {
        SeleniumWebDriver.driver.quit();
    }

    @Cuando("^ingreso un usuario y dejo el campo clave vacio$")
    public void ingresoUnUsuarioYDejoElCampoClaveVacio(List<LoginFallido> usuarioDato) {
        loginStep.escribirUsuario(usuarioDato.get(0).getUsuario());
        Espera.esperaExplicita(1);
        loginStep.escribirClave(usuarioDato.get(0).getClave());
    }

    @Entonces("^deberia ver que la contraseña no debe estar en blanco$")
    public void deberiaVerQueLaContraseñaNoDebeEstarEnBlanco() {
        SeleniumWebDriver.driver.quit();
    }

}

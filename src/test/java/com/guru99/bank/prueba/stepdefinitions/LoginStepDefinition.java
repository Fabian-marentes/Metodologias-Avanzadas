package com.guru99.bank.prueba.stepdefinitions;

import com.guru99.bank.pruebas.driver.SeleniumWebDriver;
import com.guru99.bank.pruebas.models.NewAccount;
import com.guru99.bank.pruebas.models.NewCustomer;
import com.guru99.bank.pruebas.models.Usuario;
import com.guru99.bank.pruebas.steps.NewAccountStep;
import com.guru99.bank.pruebas.steps.NewCustomerStep;
import com.sqasa.web.demo.utils.KrakenWeb;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import com.guru99.bank.pruebas.steps.LoginStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinition extends KrakenWeb {

    public static WebDriver driver;
    //@Steps
    //instanciamos la clase login step la cual permite interactuar con la clase LoginStepDefinition
    NewAccountStep newAccountStep = new NewAccountStep();
    @Steps
    //instanciamos la clase login step la cual permite interactuar con la clase LoginStepDefinition
    NewCustomerStep newCustomerStep = new NewCustomerStep();

    //instanciamos la clase login step la cual permite interactuar con la clase LoginStepDefinition
    @Steps
    LoginStep loginStep;

    //En el given asignamos la url de la pagina que vamos a automatizar
    @Dado("^que estoy en la pagina de Guru$")
    public void queEstoyEnLaPaginaDeGuru() {
        SeleniumWebDriver.ChromeWebDriver("http://demo.guru99.com/V4/index.php");
    }


    //En el When asignamos las funcionalidades que quiero que se realicen dentro de la pagina
    @Cuando("^ingreso mi usuario y clave$")
    public void ingresoMiUsuarioYClave(List<Usuario> dato) {

        loginStep.escribirCredenciales(dato.get(0).getUsuario(),
                dato.get(0).getClave());
    }


    //Then tiene la funcion de cerrar la ventana y de comparar valores

    @Entonces("^deberia ver el texto SIGN-OFF$")
    public void deberiaVerElTextoSIGNOFF() {
        SeleniumWebDriver.driver.equals("");
        SeleniumWebDriver.driver.quit();
    }

    @Cuando("^ingresa los datos de la cuenta que sera creada$")
    public void ingresaLosDatosDeLaCuentaQueSeraCreada(List<NewAccount> infoCuenta) {
        newAccountStep.escribirCustomerId(infoCuenta.get(0).getId());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Entonces("^deberia ver los datos que se quieren ingresar$")
    public void deberiaVerLosDatosQueSeQuierenIngresar() {
        SeleniumWebDriver.driver.quit();
    }

    @Cuando("^ingresa los datos del cliente proximo a crear$")
    public void ingresaLosDatosDelClienteProximoACrear(List<NewCustomer> usuarioDato)throws InterruptedException {
        newCustomerStep.ClickVentanaCliente(usuarioDato.get(0).getNombre());
        newCustomerStep.EnterRobot();
        newCustomerStep.IngresarDatos(usuarioDato.get(0).getNombre());

        Thread.sleep(5000);
    }

    @Entonces("^debería ver el usuario creado$")
    public void deberíaVerElUsuarioCreado() {
        driver.quit();
    }
}

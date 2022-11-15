package com.guru99.bank.prueba.stepdefinitions;

import com.guru99.bank.pruebas.models.NewCustomer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.guru99.bank.pruebas.steps.NewCustomerStep;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class NewCustomerStepDefinition {

    private WebDriver driver;

    @Steps
    //instanciamos la clase login step la cual permite interactuar con la clase LoginStepDefinition
    NewCustomerStep newCustomerStep = new NewCustomerStep();
/*
    //En el When asignamos las funcionalidades que quiero que se realicen dentro de la pagina
    @When("^I enter the client's data$")
    public void iEnterTheClientSData(List<NewCustomer> usuarioDato) throws InterruptedException {

        newCustomerStep.clickBtn();

        newCustomerStep.escribirDato(usuarioDato.get(0).getNombre());
        newCustomerStep.escribirFecha(usuarioDato.get(0).getFecha());
        newCustomerStep.escribirDireccion(usuarioDato.get(0).getDireccion());
        newCustomerStep.escribirCiudad(usuarioDato.get(0).getCiudad());

        newCustomerStep.escribirEstado(usuarioDato.get(0).getEstado());
        newCustomerStep.escribirPin(usuarioDato.get(0).getPin());
        newCustomerStep.escribirTelefono(usuarioDato.get(0).getTelefono());
        newCustomerStep.escribirCorreo(usuarioDato.get(0).getCorreo());
        newCustomerStep.escribirContrasena(usuarioDato.get(0).getContrasena());
        Thread.sleep(5000);
    }

    //Then tiene la función de cerrar la ventana
    @Then("^you should see the user created$")
    public void youShouldSeeTheUserCreated() {
        driver.quit();
    }
*/

}

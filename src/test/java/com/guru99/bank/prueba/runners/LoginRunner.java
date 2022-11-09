package com.guru99.bank.prueba.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//RunWith permite ejecutar en este caso las pruebas con cucumber y serenity.
// donde serenity nos brinda varias cosas y entre esas esta que nos realiza evidencias del paso a paso
@RunWith(CucumberWithSerenity.class)

//cucumber options permite:
@CucumberOptions(
        //llamar el feature el cual es utilizado para escriber los criterios de aceptación
        features = "src/test/resources/features/Login.feature",

        //glue describe la ubicación y la ruta del archivo de definición de pasos.
        glue = "com/guru99/bank/prueba/stepdefinitions",

        //los snippets son utilizados mas por apariencia y tambien para mantener la sintaxis de java
        snippets = SnippetType.CAMELCASE,
        tags = "@NewAccount")

public class LoginRunner {
}

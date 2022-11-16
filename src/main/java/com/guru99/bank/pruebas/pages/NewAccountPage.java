package com.guru99.bank.pruebas.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NewAccountPage extends PageObject {

    //Esta parte contiene los localizadores de tipo xpath
    //los cuales seleccionaran y llenaran los campos vacios con el ID para poder crear una nueva cuenta
    private static By btnNewAccount = By.xpath("//a[contains(text(),'New Account')]");
    private static By txtCustomer = By.xpath("//input[@name='cusid']");
    private static By btnCurrent = By.xpath("//option[contains(text(),'Current')]");
    private static By txtInitialDeposit = By.xpath("//input[@name='inideposit']");
    private static By btnSubtim = By.xpath("//input[@name='button2']");
    private static By btnContinue = By.xpath("//a[contains(text(),'Continue')]");




    public void setBtnNewAccount() {

        getDriver().findElement(btnNewAccount).click();
    }
    //Los get son utilizados para mostrar el valor de una propiedad o atributo de un objeto
    public static By getBtnNewAccount() {
        return btnNewAccount;
    }

    public static By getTxtCustomer() {
        return txtCustomer;
    }

    public static By getBtnCurrent() {
        return btnCurrent;
    }

    public static By getTxtInitialDeposit() {
        return txtInitialDeposit;
    }

    public static By getBtnSubtim() {
        return btnSubtim;
    }

    public static By getBtnContinue() {
        return btnContinue;
    }
}

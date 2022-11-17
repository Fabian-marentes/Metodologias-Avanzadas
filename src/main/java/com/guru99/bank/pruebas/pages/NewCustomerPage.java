package com.guru99.bank.pruebas.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class NewCustomerPage extends PageObject {

    //Esta parte contiene los localizadores de tipo xpath y name
    //los cuales seleccionaran y llenaran los campos vacios con el ID para poder crear una nueva cuenta

    public By btnCustomer = By.xpath("//ul//a[@href='addcustomerpage.php']");
    public By txtPassword = By.name("password");
    public By btnSubtim = By.name("sub");
    public By txtName = By.xpath("//input[@name='name']");
    public By fieldGender = By.xpath("//input[@value='f']");
    public By txtDate = By.xpath("//input[@name='dob']");
    public By txtAdress = By.name("addr");
    public By txtCity = By.name("city");
    public By txtState = By.name("state");
    public By txtPin = By.name("pinno");
    public By txtPhone = By.name("telephoneno");
    public By txtEmail = By.name("emailid");


    public By getBtnCustomer() {
        return btnCustomer;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnSubtim() {
        return btnSubtim;
    }

    public By getTxtName() {
        return txtName;
    }

    public By getFieldGender() {
        return fieldGender;
    }

    public By getTxtDate() {
        return txtDate;
    }

    public By getTxtAdress() {
        return txtAdress;
    }

    public By getTxtCity() {
        return txtCity;
    }

    public By getTxtState() {
        return txtState;
    }

    public By getTxtPin() {
        return txtPin;
    }

    public By getTxtPhone() {
        return txtPhone;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

}

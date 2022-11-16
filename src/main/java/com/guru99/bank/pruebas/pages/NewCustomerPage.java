package com.guru99.bank.pruebas.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class NewCustomerPage extends PageObject {

    //Esta parte contiene los localizadores de tipo xpath y name
    //los cuales seleccionaran y llenaran los campos vacios con el ID para poder crear una nueva cuenta

    public By btnCustomer = By.xpath("//ul//a[@href='addcustomerpage.php']");
    public By clientePage = By.xpath("//*[text()='New Customer']");
    public By nameInput = By.xpath("//input[@name='name']");
    public By genderClick = By.xpath("//input[@value='f']");
    public By birthdayInput = By.xpath("//input[@name='dob']");
    public By addressInput = By.name("addr");
    public By cityInput = By.name("city");
    public By stateInput = By.name("state");
    public By pinInput = By.name("pinno");
    public By mobileInput = By.name("telephoneno");
    public By emailInput = By.name("emailid");
    public By passwordInput = By.name("password");
    public By btnSubmit = By.name("sub");
    public By customerIDCustomerRegistered = By.xpath("(//table[@id='customer']//tr//td)[1]");
    public By customerIDText = By.xpath("(//table[@id='customer']//tr//td)[5]");

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
    public By bntScroll=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td/a");


    public By getBntScroll() {
        return bntScroll;
    }

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

package com.guru99.bank.pruebas.pages;

import org.openqa.selenium.By;

public class NewCustomerPage {

    //Esta parte contiene los localizadores de tipo xpath y name
    //los cuales seleccionaran y llenaran los campos vacios con el ID para poder crear una nueva cuenta

    private static By btnCustomer = By.xpath("//ul//a[@href='addcustomerpage.php']");
    //campo usuario
    private static By txtName = By.xpath("//input[@name='name']");

    //genero
    private static By fieldGender = By.xpath("//input[@value='f']");

    //escribe fecha
    private static By txtDate = By.xpath("//input[@name='dob']");

    //direccion4
    private static By txtAdress = By.name("addr");

    //ciudad
    private static By txtCity = By.name("city");

    //estado
    private static By txtState = By.name("state");

    //pin
    private static By txtPin = By.name("pinno");

    //telefono
    private static By txtPhone = By.name("telephoneno");

    //correo electronico
    private static By txtEmail = By.name("emailid");

    //nueva contraseña
    private static By txtPassword = By.name("password");

    //boton subtim
    private static By btnSubtim = By.name("sub");

    //Los get son utilizados para mostrar el valor de una propiedad o atributo de un objeto
    public static By getBtnCustomer() {
        return btnCustomer;
    }

    public static By getTxtName() {
        return txtName;
    }

    public static By getFieldGender() {
        return fieldGender;
    }

    public static By getTxtDate() {
        return txtDate;
    }

    public static By getTxtAdress() {
        return txtAdress;
    }

    public static By getTxtCity() {
        return txtCity;
    }

    public static By getTxtState() {
        return txtState;
    }

    public static By getTxtPin() {
        return txtPin;
    }

    public static By getTxtPhone() {
        return txtPhone;
    }

    public static By getTxtEmail() {
        return txtEmail;
    }

    public static By getTxtPassword() {
        return txtPassword;
    }

    public static By getBtnSubtim() {
        return btnSubtim;
    }
}

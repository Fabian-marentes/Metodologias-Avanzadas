package com.guru99.bank.pruebas.models;

public class NewAccount {
    //En esta clase se declararon los elementos de tipo string
    String id, deposito;

    //Se crea un constructor con el proposito de inicializar el objeto y sirve para asegurarnos que los objetos siempre contengan valores válidos
    public NewAccount(String id, String deposito) {
        this.id = id;
        this.deposito = deposito;
    }

    //Los get son utilizados para mostrar el valor de una propiedad o atributo de un objeto
    public String getId() {
        return id;
    }

    public String getDeposito() {
        return deposito;
    }
}

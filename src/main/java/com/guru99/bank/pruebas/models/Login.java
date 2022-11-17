package com.guru99.bank.pruebas.models;

public class Login {
    //En esta clase se declararon los elementos de tipo string
    String usuario,clave;

    //Se crea un constructor con el proposito de inicializar el objeto
    // y sirve para asegurarnos que los objetos siempre contengan valores válidos
    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    //Los get son utilizados para mostrar el valor de una propiedad o atributo de un objeto
    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}

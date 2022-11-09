package com.guru99.bank.pruebas.models;

public class NewCustomer {
    //En esta clase se declararon los elementos de tipo string
    String nombre, genero, fecha, direccion, ciudad, estado, pin, telefono, correo, contrasena;


    //Se crea un constructor con el proposito de inicializar el objeto y sirve para asegurarnos que los objetos siempre contengan valores válidos
    public NewCustomer(String nombre, String genero, String fecha,
                       String direccion, String ciudad, String estado,
                       String pin, String telefono, String correo,
                       String contrasena) {
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pin = pin;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    //Los get son utilizados para mostrar el valor de una propiedad o atributo de un objeto

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getPin() {
        return pin;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
}

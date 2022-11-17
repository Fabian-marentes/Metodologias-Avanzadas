package com.guru99.bank.pruebas.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {


    Faker faker = new Faker(new Locale ("en-U$"));

    //Se crean las variables tipo String

    private String username,password,validacionmensaje, nombreCliente,fechaCumpleañosDia, fechaCumpleañosMes,
            fechaCumpleañosA_o, direccion,ciudad,estado,pin,numeroTelefono,correo,contraseña,validacionDatosCliente,
            idClienteRegistrado, CuentaIdInput, ListaSeleccion,DepositoInicial,validacionMensajeCuentaCreada;

    // Se crea un metodo para asignar los datos
    public DataInjection() {
        this.password = "gUsEtUg";
        this.username = "mngr452530";
        this.nombreCliente = faker.name().firstName();
        this.fechaCumpleañosDia = Integer.toString(faker.number().numberBetween(1,30));
        this.fechaCumpleañosMes = Integer.toString(faker.number().numberBetween(1,12));
        this.fechaCumpleañosA_o = Integer.toString(faker.number().numberBetween(1950,2021));
        this.direccion = "Cra 24 33 73";
        this.ciudad = faker.address().city();
        this.estado = faker.address().state();
        this.pin = Long.toString(faker.number().randomNumber(6,true));
        this.numeroTelefono = "3144080752";
        this.correo = faker.internet().emailAddress();
        this.contraseña = faker.internet().password();
        this.ListaSeleccion = "Savings";
        this.DepositoInicial = Long.toString(faker.number().randomNumber(7,true));
    }
 // Se crea los gettes y se retorna el valor

    public String getDepositoInicial() {
        return DepositoInicial;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public String getFechaCumpleañosDia() {
        return fechaCumpleañosDia;
    }
    public String getFechaCumpleañosMes() {
        return fechaCumpleañosMes;
    }
    public String getFechaCumpleañosA_o() {
        return fechaCumpleañosA_o;
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
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public String getCorreo() {
        return correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getListaSeleccion() {
        return ListaSeleccion;
    }
    public String getValidacionMensajeCuentaCreada() {return validacionMensajeCuentaCreada;}
    public String getValidacionmensaje() {
       return validacionmensaje;
    }
    public String getValidacionDatosCliente() {
        return validacionDatosCliente;
    }
    public String getUsername() {return username;}
    public String getPassword() {return password;}

}

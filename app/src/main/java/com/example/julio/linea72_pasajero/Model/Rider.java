package com.example.julio.linea72_pasajero.Model;

/**
 * Created by Julio on 19/09/2018.
 */

public class Rider {
    private String email, password, nombre,  telefono;

    public Rider(){
    }

    public Rider(String Email,String Password,String Nombre, String Telefono){
        this.email = Email;
        this.password = Password;
        this.nombre = Nombre;
        this.telefono = Telefono;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String registro) {
        this.nombre = registro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

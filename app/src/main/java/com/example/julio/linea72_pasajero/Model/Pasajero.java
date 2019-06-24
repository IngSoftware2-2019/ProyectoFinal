package com.example.julio.linea72_pasajero.Model;

/**
 * Created by Julio on 20/06/2019.
 */

public class Pasajero {
    private double longitud, latitud;

    public Pasajero(){
    }

    public Pasajero(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}

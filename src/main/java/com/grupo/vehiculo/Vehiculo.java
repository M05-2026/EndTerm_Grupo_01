package com.grupo.vehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private String color;
    private double precio;
    private boolean encendido;
    private int velocidadActual;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, String matricula, String color, double precio, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
        this.precio = precio;
        this.encendido = false;
        this.velocidadActual = 0;
	this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo encender
    public void encenderCoche() {

        if (!encendido) {
            System.out.println("Enciende el motor por favor");
            this.encendido = true;
        } else {
            System.out.println("Has encendido el coche, dale!");
        }
    }

    //Metodo frenar
    public void frenar(int frenando) {

    if (!encendido) {
        System.out.println("El vehículo está apagado. No es necesario frenar, pon el freno de mano.");
        return;
    }

    if (frenando <= 0) {
        throw new IllegalArgumentException("La cantidad para frenar debe ser mayor que 0");
    }

    int nuevaVelocidad = velocidadActual - frenando;

    if (nuevaVelocidad < 0) {
        velocidadActual = 0;
        System.out.println("El vehiculo se ha detenido");
    } else {
        velocidadActual = nuevaVelocidad;
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }
}

    public void acelerar(int incremento) {

	if (!encendido) {
        	System.out.println("El vehículo está apagado. No se puede acelerar.");
        	return;
    	}

    	if (incremento <= 0) {
        	throw new IllegalArgumentException("El incremento debe ser positivo.");
    	}

    	int nuevaVelocidad = velocidadActual + incremento;

    	if (nuevaVelocidad > velocidadMaxima) {
        	velocidadActual = velocidadMaxima;
    	} else {
        	velocidadActual = nuevaVelocidad;
    	}

    	System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }

// GETTER Y SETTER de encendido y velocidadActual

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
}


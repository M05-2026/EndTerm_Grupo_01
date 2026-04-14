package com.grupo.vehiculo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {

    @Test
    void elVehiculoDebeEmpezarApagadoYConVelocidadCero() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);

        assertFalse(v.isEncendido());
        assertEquals(0, v.getVelocidadActual());
    }

    @Test
    void encenderCocheDebeCambiarElEstadoAEncendido() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);

        v.encenderCoche();

        assertTrue(v.isEncendido());
    }

    @Test
    void frenarDebeReducirLaVelocidadSiElVehiculoEstaEncendido() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);
        v.setEncendido(true);
        v.setVelocidadActual(80);

        v.frenar(30);

        assertEquals(50, v.getVelocidadActual());
    }

    @Test
    void frenarNoDebeBajarDeCero() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);
        v.setEncendido(true);
        v.setVelocidadActual(20);

        v.frenar(50);

        assertEquals(0, v.getVelocidadActual());
    }

    @Test
    void frenarNoDebeCambiarLaVelocidadSiElVehiculoEstaApagado() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);
        v.setVelocidadActual(40);

        v.frenar(10);

        assertEquals(40, v.getVelocidadActual());
        assertFalse(v.isEncendido());
    }

    @Test
    void frenarDebeLanzarExcepcionSiElValorEsCero() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);
        v.setEncendido(true);
        v.setVelocidadActual(40);

        assertThrows(IllegalArgumentException.class, () -> v.frenar(0));
    }

    @Test
    void frenarDebeLanzarExcepcionSiElValorEsNegativo() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);
        v.setEncendido(true);
        v.setVelocidadActual(40);

        assertThrows(IllegalArgumentException.class, () -> v.frenar(-10));
    }

    @Test
    void acelerarDebeAumentarLaVelocidadSiElVehiculoEstaEncendido() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);
        v.setEncendido(true);

        v.acelerar(50);

        assertEquals(50, v.getVelocidadActual());
    }

    @Test
    void acelerarNoDebeSuperarLaVelocidadMaxima() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 100);
        v.setEncendido(true);
        v.setVelocidadActual(80);

        v.acelerar(50);

        assertEquals(100, v.getVelocidadActual());
    }

    @Test
    void acelerarNoDebeCambiarLaVelocidadSiElVehiculoEstaApagado() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);
        v.setVelocidadActual(40);

        v.acelerar(20);

        assertEquals(40, v.getVelocidadActual());
        assertFalse(v.isEncendido());
    }

    @Test
    void acelerarDebeLanzarExcepcionSiElValorEsCero() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);
        v.setEncendido(true);

        assertThrows(IllegalArgumentException.class, () -> v.acelerar(0));
    }

    @Test
    void acelerarDebeLanzarExcepcionSiElValorEsNegativo() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000, 180);
        v.setEncendido(true);

        assertThrows(IllegalArgumentException.class, () -> v.acelerar(-10));
    }
}

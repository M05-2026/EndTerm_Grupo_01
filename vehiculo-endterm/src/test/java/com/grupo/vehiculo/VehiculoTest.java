package com.grupo.vehiculo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {

  // Actualización 1: Hago los Test para Encender (que ya lo hemos puesto para que sea más real) y para frenar.
    @Test
    void elVehiculoDebeEmpezarApagadoYConVelocidadCero() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000);

        assertFalse(v.isEncendido());
        assertEquals(0, v.getVelocidadActual());
    }

    @Test
    void encenderCocheDebeCambiarElEstadoAEncendido() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000);

        v.encenderCoche();

        assertTrue(v.isEncendido());
    }

    @Test
    void frenarDebeReducirLaVelocidadSiElVehiculoEstaEncendido() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000);
        v.setEncendido(true);
        v.setVelocidadActual(80);

        v.frenar(30);

        assertEquals(50, v.getVelocidadActual());
    }

    @Test
    void frenarNoDebeBajarDeCero() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000);
        v.setEncendido(true);
        v.setVelocidadActual(20);

        v.frenar(50);

        assertEquals(0, v.getVelocidadActual());
    }

    @Test
    void frenarNoDebeCambiarLaVelocidadSiElVehiculoEstaApagado() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000);
        v.setVelocidadActual(40);

        v.frenar(10);

        assertEquals(40, v.getVelocidadActual());
        assertFalse(v.isEncendido());
    }

    @Test
    void frenarDebeLanzarExcepcionSiElValorEsCero() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000);
        v.setEncendido(true);
        v.setVelocidadActual(40);

        assertThrows(IllegalArgumentException.class, () -> v.frenar(0));
    }

    @Test
    void frenarDebeLanzarExcepcionSiElValorEsNegativo() {
        Vehiculo v = new Vehiculo("Seat", "Ibiza", "1234ABC", "Rojo", 15000);
        v.setEncendido(true);
        v.setVelocidadActual(40);

        assertThrows(IllegalArgumentException.class, () -> v.frenar(-10));
    }
}

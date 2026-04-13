public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private String color;
    private double precio;
    private boolean encendido;
    private int velocidadActual;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, String matricula, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
        this.precio = precio;
        this.encendido = false;
        this.velocidadActual = 0;
    }
}

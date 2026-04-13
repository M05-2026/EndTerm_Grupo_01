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

    public Acelerar(){

        if (!encendido) {
            System.out.println("El vehículo está apagado. No se puede acelerar.");
            return;
        }

        int nuevaVelocidad = velocidadActual + incremento;

        if (nuevaVelocidad > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
            System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        } else {
            velocidadActual = nuevaVelocidad;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        }
    }
}

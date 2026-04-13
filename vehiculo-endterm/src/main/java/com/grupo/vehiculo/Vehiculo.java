public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private String color;
    private double precio;
    private boolean encendido;
    private int velocidadActual;

    public Vehiculo(String marca, String modelo, String matricula, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
        this.precio = precio;
        this.encendido = false;
        this.velocidadActual = 0;
    }

    public void frenar(int frenando){

        if (!encendido) {
            System.out.println("El vehículo está apagado. No es necesario frenar, pon el freno de mano.");
            return;
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
}

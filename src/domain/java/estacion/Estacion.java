package estacion;

public class Estacion {
    private final int id;
    private final String direccion;

    public Estacion(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    private int getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "Estacion de " + direccion;
    }
}

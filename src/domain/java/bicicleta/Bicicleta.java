package bicicleta;

public class Bicicleta implements Movil {
    private final int id;

    public Bicicleta(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String toString() {
        return  "" + Bicicleta.class + " " + id ;
    }
}

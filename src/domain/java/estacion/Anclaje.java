package estacion;

import bicicleta.Movil;

public class Anclaje {
    private boolean ocupado;
    private Movil bici;

    // we just need empty constructor

    boolean isOcupado() {
        return ocupado;
    }

    Movil getBici() {
        return bici;
    }

    void anclarBici(Movil bici) {
        this.bici = bici;
        this.ocupado = true;
    }

    void liberarBici() {
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "ocupado: " + isOcupado();
    }
}

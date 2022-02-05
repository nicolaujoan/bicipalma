package estacion;

import bicicleta.Movil;
import java.util.concurrent.ThreadLocalRandom;

public class Anclajes {
    private final Anclaje[] anclajes;

    Anclajes(int numeroAnclajes) {
        this.anclajes = new Anclaje[numeroAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes() {
        for (int i = 0; i < anclajes.length; i++) {
            anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes() {
        return this.anclajes;
    }

    int numAnclajes() {
        return this.anclajes.length;
    }

    void ocuparAnclaje(int posicion, Movil bici) {
        anclajes[posicion].anclarBici(bici);
    }

    boolean isAnclajeOcupado(int posicion) {
        return anclajes[posicion].isOcupado();
    }

    void liberarAnclaje(int posicion) {
        anclajes[posicion].liberarBici();
    }

    Movil getBici(int posicion) {
        return anclajes[posicion].getBici();
    }

    Movil getBiciAt(int position) {
        return anclajes[position].getBici();
    }

    /**
     * Substituido por Arrays.stream().findAny()
     */

    int seleccionarAnclaje() {
        return ThreadLocalRandom.current().nextInt(0, numAnclajes());
    }

    @Override
    public String toString() {
        return "Numero de anclajes: " + Integer.toString(numAnclajes());
    }

    /**
     * Al introducir streams no es posible acceder
     * por posicion al ADT Anclaje.
     * Los metodos de acceso por posicion
     * ya no son necesarios.
     */
}

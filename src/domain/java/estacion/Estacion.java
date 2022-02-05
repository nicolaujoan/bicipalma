package estacion;

import bicicleta.Movil;
import tarjetausuario.Autenticacion;

import java.util.Arrays;
import java.util.Optional;

public class Estacion {
    private final int id;
    private final String direccion;
    private final int numeroAnclajes;
    private final Anclajes anclajes;


    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        anclajes = new Anclajes(numeroAnclajes);
    }

    private int getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "id: " + getId() +
                "\ndireccion: " + getDireccion() +
                "\nnumeroAnclajes: " + numAnclajes();

    }

   private Anclaje[] anclajes() {
        return anclajes.anclajes();
    }

    private int numAnclajes() {
        return this.numeroAnclajes;
    }

    public void consultarEstacion() {
        System.out.println(this);
    }

    public int anclajesLibres() {
        return  (int) Arrays.stream(anclajes()).filter(a -> !a.isOcupado()).count();
    }

    // ancla la bici en cualquier anclaje libre
    public void anclarBicicleta(Movil bici) {
        Optional<Anclaje> anclajeLibre = Arrays.stream(anclajes())
                                        .filter(anclaje -> !anclaje.isOcupado())
                                        .findAny();
        if (anclajeLibre.isPresent()) {
            anclajeLibre.get().anclarBici(bici);
        } else {
            System.out.println("No existen enlaces disponibles para la bici " + bici);
        }
    }

    // ancla la bici en el primer anclaje libre
    public void anclarBicicleta(Movil bici, boolean primerAnclaje) {
        Optional<Anclaje> anclajeLibre = Arrays.stream(anclajes())
                                        .filter(anclaje -> !anclaje.isOcupado())
                                        .findFirst();
        if (anclajeLibre.isPresent()) {
            anclajeLibre.get().anclarBici(bici);
        } else {
            System.out.println("No existen enlaces disponibles para la bici " + bici);
        }
    }

    public boolean leerTarjetaUsuario(Autenticacion tarjeta) {
        return tarjeta.isActivada();
    }

    public void retirarBicicleta(Autenticacion tarjeta) {
        if (leerTarjetaUsuario(tarjeta)) {
            Optional<Anclaje> anclajeOcupado = Arrays.stream(anclajes())
                                               .filter(Anclaje::isOcupado)
                                               .findAny();
            if (anclajeOcupado.isPresent()) {
                anclajeOcupado.get().liberarBici();
            } else {
                System.out.println("Todos los anclajes estan libres");
            }

        } else {
            System.out.println("Tarjeta de usuario inactiva");
        }
    }

    private void mostrarBicicleta(Movil bicicleta /*, int numeroAnclaje*/) {
        System.out.println("bicicleta retirada: " + bicicleta.getId()
                /*+ " del anclaje: " + numeroAnclaje*/);
    }

    private void mostrarAnclaje(Movil bicicleta, int numeroAnclaje) {
        System.out.println("bicicleta " + bicicleta.getId()
                + " anclada en el anclaje " + numeroAnclaje);
    }

    // info de los anclajes de la estación
    public void consultarAnclajes() {
        Arrays.stream(anclajes()).map(a -> Optional.ofNullable(a.getBici()))
                        .forEach(bici -> System.out.println("Anclaje " +
                        (bici.isPresent()? bici.get(): "libre\n")));
    }

}

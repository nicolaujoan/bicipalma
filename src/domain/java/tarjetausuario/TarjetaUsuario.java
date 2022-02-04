package tarjetausuario;

public class TarjetaUsuario implements Autenticacion {
    private final String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    @Override
    public String toString() {
        return this.id;
    }
}

public class Jugador {
    private int id;
    private static int ultimoId = 0;
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
        ultimoId++;
        this.id = ultimoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador " + nombre;
    }
}

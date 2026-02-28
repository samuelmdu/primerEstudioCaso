public class Rutina {

    private String nombre;
    private String tipoRetorno;

    public Rutina(String nombre, String tipoRetorno) {
        this.nombre = nombre;
        this.tipoRetorno = tipoRetorno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoRetorno() {
        return tipoRetorno;
    }

    @Override
    public String toString() {
        return nombre + "() : " + tipoRetorno;
    }
}
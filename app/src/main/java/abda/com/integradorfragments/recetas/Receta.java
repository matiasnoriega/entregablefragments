package abda.com.integradorfragments.recetas;

/**
 * Created by digitalhouse on 17/10/16.
 */
public class Receta {

    private String nombre;
    private String descripcion;
    private String resumen;

    public Receta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.resumen = descripcion.substring(0, 25)+"...";
    }


    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getResumen() {
        return resumen;
    }
}

package abda.com.integradorfragments;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 14/10/16.
 */

public class Restaurante {
    private String nombre;
    private String ubicacion;
    private Integer fotoBackground;

    public Restaurante(String ubicacion, String nombre, Integer fotoBackground) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.fotoBackground = fotoBackground;
    }

    public static List<Restaurante> devolverListaDeRestaurantes(){

        List<Restaurante> listaADevolver = new ArrayList<Restaurante>();

        listaADevolver.add(new Restaurante("Central", "Lima, Peru", R.drawable.central));
        listaADevolver.add(new Restaurante("Boragó", "Santiago, Chile", R.drawable.borago));
        listaADevolver.add(new Restaurante("Astrid y Gastón", "Lima, Peru", R.drawable.astridygaston));
        listaADevolver.add(new Restaurante("D.O.M.", "San Pablo, Brasil", R.drawable.central));
        listaADevolver.add(new Restaurante("Maido", "Lima, Peru", R.drawable.maido));
        listaADevolver.add(new Restaurante("Quintonil", "Ciudad de Mexico", R.drawable.quintonil));
        listaADevolver.add(new Restaurante("Tegui", "Buenos Aires, Argentina", R.drawable.central));
        listaADevolver.add(new Restaurante("Maní", "San Pablo, Brasil", R.drawable.mani));

        return listaADevolver;
    }
    public String getNombre() {
        return nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }

    public Integer getFotoBackground() {
        return fotoBackground;
    }
}

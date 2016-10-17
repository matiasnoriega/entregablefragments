package abda.com.integradorfragments.restoranes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import abda.com.integradorfragments.R;

public class FragmentRestaurantes extends Fragment {

    public static FragmentRestaurantes devolverFragmentRestaurantes(Restaurante restaurante){

        FragmentRestaurantes fragmentADevolver = new FragmentRestaurantes();

        Bundle bundle = new Bundle();
        bundle.putString("Nombre",restaurante.getNombre());
        bundle.putString("Ubicacion", restaurante.getUbicacion());
        bundle.putInt("Foto", restaurante.getFotoBackground());

        fragmentADevolver.setArguments(bundle);

        return fragmentADevolver;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.restaurant_layout, container, false);

        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frameLayout);
        TextView textViewNombre = (TextView) view.findViewById(R.id.textNombre);
        TextView textViewUbicacion = (TextView) view.findViewById(R.id.textUbicacion);

        Bundle bundle = getArguments();

        String nombre = bundle.getString("Nombre");
        String ubicacion = bundle.getString("Ubicacion");
        Integer foto = bundle.getInt("Foto");

        frameLayout.setBackgroundResource(foto);
        textViewNombre.setText(nombre);
        textViewUbicacion.setText(ubicacion);

        return view;
    }
}

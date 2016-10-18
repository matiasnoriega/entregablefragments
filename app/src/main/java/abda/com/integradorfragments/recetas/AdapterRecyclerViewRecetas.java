package abda.com.integradorfragments.recetas;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.*;

import abda.com.integradorfragments.R;

public class AdapterRecyclerViewRecetas extends RecyclerView.Adapter {

    private Context contexto;
    private List<Receta> listaDeRecetas;

    public AdapterRecyclerViewRecetas(Context contexto, List<Receta> listaDeRecetas) {
        this.contexto = contexto;
        this.listaDeRecetas = listaDeRecetas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contexto);
        View vistaCelda = inflater.inflate(R.layout.receta_vista_celda, parent, false);
        RecetasViewHolder recetasViewHolder = new RecetasViewHolder(vistaCelda);
        return recetasViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Receta unaReceta = listaDeRecetas.get(position);
        RecetasViewHolder recetaViewHolder = (RecetasViewHolder) holder;
        recetaViewHolder.cargarReceta(unaReceta);

    }

    @Override
    public int getItemCount() {
        return listaDeRecetas.size();
    }

    private class RecetasViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewNombre;
        private TextView textViewResumen;

        public RecetasViewHolder(View view) {
            super(view);
            textViewNombre = (TextView)view.findViewById(R.id.textNombreRecetaLayoutDetalle);
            textViewResumen = (TextView)view.findViewById(R.id.textResumenRecetaLayoutDetalle);
        }

        public void cargarReceta (Receta unaReceta){
            textViewNombre.setText(unaReceta.getNombre());
            textViewResumen.setText(unaReceta.getResumenCorto());
        }

    }
}

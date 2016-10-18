package abda.com.integradorfragments.recetas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.List;

import abda.com.integradorfragments.R;


public class RecetasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        List<Receta> listaDeRecetas = Receta.devolverListaRecetas();

        RecyclerView recyclerViewRecetas = (RecyclerView) findViewById(R.id.recyclerViewRecetas);

        AdapterRecyclerViewRecetas adaptadorRecetas = new AdapterRecyclerViewRecetas(this, listaDeRecetas);

        recyclerViewRecetas.setAdapter(adaptadorRecetas);

        LinearLayoutManager linearLayoutManagerVertical = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerViewRecetas.setLayoutManager(linearLayoutManagerVertical);

        recyclerViewRecetas.setHasFixedSize(true);

    }
}

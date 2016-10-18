package abda.com.integradorfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import abda.com.integradorfragments.recetas.RecetasActivity;
import abda.com.integradorfragments.restoranes.RestaurantesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void restaurantes(View view){
        Intent  intent = new Intent(this, RestaurantesActivity.class);
        startActivity(intent);
    }

    public void recetas(View view){
        Intent intent = new Intent(this, RecetasActivity.class);
        startActivity(intent);
    }
}

package abda.com.integradorfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RestaurantesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        FragmentManager fragmentManager = getSupportFragmentManager();

        RestaurantesFragmentPageAdapter restaurantesFragmentPageAdapter = new RestaurantesFragmentPageAdapter(fragmentManager);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        viewPager.setAdapter(restaurantesFragmentPageAdapter);
    }
}

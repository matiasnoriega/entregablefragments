package abda.com.integradorfragments.restoranes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class RestaurantesFragmentPageAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> miListaDeFragments;

    public RestaurantesFragmentPageAdapter(FragmentManager fm) {
        super(fm);

        miListaDeFragments = new ArrayList<Fragment>();
        List<Restaurante> restaurantes = Restaurante.devolverListaDeRestaurantes();

        for(Restaurante unRestaurante : restaurantes){
            miListaDeFragments.add(FragmentRestaurantes.devolverFragmentRestaurantes(unRestaurante));
        }

    }

    @Override
    public Fragment getItem(int position) {
        return this.miListaDeFragments.get(position);
    }

    @Override
    public int getCount() {
        return this.miListaDeFragments.size();
    }
}

package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftBar {

    public AdapterRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNotaBauturi(double totalPlata) {
        super.printeazaNotaBauturi(totalPlata);
    }
}

package restaurant.adapter.bucatarie;

import restaurant.adapter.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftRestaurant{
    private String denumire;
    private double totalPlataNota;

    public AdapterRestaurant(String denumire) {
        this.denumire = denumire;
        this.totalPlataNota = totalPlataNota;
    }


}

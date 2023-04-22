package restaurant.proxy.main;

import restaurant.proxy.clase.IRestaurant;
import restaurant.proxy.clase.ProxyRestaurant;
import restaurant.proxy.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        //aici ca sa vedem cum ii fara proxy
        IRestaurant restaurant = new Restaurant("Hush");
        restaurant.rezervaMasa(2);

        System.out.println();

        //aici cum ii cu proxy
        IRestaurant proxy = new ProxyRestaurant(restaurant);
        proxy.rezervaMasa(2);

        proxy.rezervaMasa(5);
    }
}

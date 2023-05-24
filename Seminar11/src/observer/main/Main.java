package observer.main;

import observer.clase.Client;
import observer.clase.IClient;
import observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("George");
        IClient client2 = new Client("Enel");
        IClient client3 = new Client("Mihai");

        Restaurant restaurant = new Restaurant("Tratoria Moza");

        restaurant.introduceOfertaNoua();

        restaurant.abonareClient(client1);
        restaurant.adaugaDisscount(25);

        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonare(client1);

        restaurant.introduceOfertaNoua();

    }
}

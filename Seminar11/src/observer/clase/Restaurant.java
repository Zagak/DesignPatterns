package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    private List<IClient> listaClienti;

    public Restaurant(String nume){
        this.nume=nume;
        listaClienti=new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        listaClienti.add(client);
    }

    @Override
    public void dezabonare(IClient client) {
        listaClienti.remove(client);
    }

    @Override
    public void notificareClient(String message) {
        for (IClient client:listaClienti){
            client.primesteNotificare(message);
        }
    }

    public void introduceOfertaNoua(){
        String mesaj = new String(this.nume+" a introdus o oferta noua.");
        notificareClient(mesaj);
    }

    public void adaugaDisscount(int discount){
        String mesaj = new String(this.nume+" a introdus un discount de "+discount);
        notificareClient(mesaj);
    }



}

package strategy.main;

import strategy.clase.Calator;
import strategy.clase.PlataCardBancar;
import strategy.clase.PlataCardCalatorii;
import strategy.clase.PlataPrinSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Dinca Vlad");

        calator.platesteBilet(50);
        calator.setMetodaPlata(new PlataPrinSMS());

        calator.platesteBilet(30);
        calator.setMetodaPlata(new PlataCardBancar());

        calator.platesteBilet(10);
        calator.setMetodaPlata(new PlataCardCalatorii());

        calator.platesteBilet(20);
    }
}

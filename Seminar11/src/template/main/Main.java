package template.main;

import template.clase.IMasa;
import template.clase.Masa;
import template.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        IMasa masa = new Masa(1);
        masa.ocupaMesa();

        IMasa masaRezervata = new MasaRezervata(2,"14:30");

        masaRezervata.ocupaMesa();

    }
}

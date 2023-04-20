package singletoneRegistry.main;

import singleton.classes.Secretariat;
import singletoneRegistry.InstitutiePublica;

public class Main {
    public static void main(String[] args) {
        InstitutiePublica politie=InstitutiePublica.getInstitutieOptimizat("Politie");
        InstitutiePublica pompieri=InstitutiePublica.getInstitutieOptimizat("Pompieri");
        InstitutiePublica politielocala=InstitutiePublica.getInstitutieOptimizat("Politie");

        politie.setNumarAngajati(10);
        pompieri.setNumarAngajati(20);
        politielocala.setNumarAngajati(5);

        System.out.println(politie);
        System.out.println(pompieri);
        System.out.println(politielocala);


        Secretariat secretariat = Secretariat.getInstanta(2,12);
        System.out.println(secretariat);

        Secretariat secretariat1 = Secretariat.getInstanta(3,15);
        System.out.println(secretariat);
    }
}

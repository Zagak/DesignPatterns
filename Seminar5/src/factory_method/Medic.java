package factory_method;

import factory_method.PersonalSpital;

public class Medic extends PersonalSpital {
    public Medic (String name){
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicul"+ super.getName());
    }
}

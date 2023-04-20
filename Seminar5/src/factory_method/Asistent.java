package factory_method;

import factory_method.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent (String name){
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul"+ super.getName());
    }
}

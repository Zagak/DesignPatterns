package factory_method.main;


import factory_method.FactoryBracardier;
import factory_method.FactoryMediic;
import factory_method.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMediic factoryMediic=new FactoryMediic();
        FactoryBracardier factoryBracardier=new FactoryBracardier();

        List<PersonalSpital> listaPersonal = new ArrayList<>();

        listaPersonal.add(factoryMediic.createPersonal("Ciprian"));
        listaPersonal.add(factoryMediic.createPersonal("Finel"));
        listaPersonal.add(factoryBracardier.createPersonal("Enescu"));

        for(PersonalSpital personalSpital : listaPersonal){
            personalSpital.afiseazaDescriere();
        }
    }
}

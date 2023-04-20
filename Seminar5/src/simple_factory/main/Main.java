package simple_factory.main;

import simple_factory.PersonalSpital;
import simple_factory.SimpleFactory;
import simple_factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        List<PersonalSpital> list=new ArrayList<>();

        PersonalSpital personalSpital1=simpleFactory.createPersonal(TipPersonal.Medic,"Andrei");
        PersonalSpital personalSpital2=simpleFactory.createPersonal(TipPersonal.Asistent,"Gigi");
        PersonalSpital personalSpital3=simpleFactory.createPersonal(TipPersonal.Bracardier,"Fanel");
        PersonalSpital personalSpital4=simpleFactory.createPersonal(TipPersonal.Medic,"Catalin");
        PersonalSpital personalSpital5=simpleFactory.createPersonal(TipPersonal.Anestezist,"Dorel",20);

        list.addAll(List.of(personalSpital1,personalSpital2,personalSpital3,personalSpital4,personalSpital5));

        for(PersonalSpital personalSpital:list){
            personalSpital.afiseazaDescriere();
        }
    }
}

package simple_factory;

public class Medic extends PersonalSpital{
    public Medic (String name){
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicul"+ super.getName());
    }
}

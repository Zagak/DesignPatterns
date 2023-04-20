package simple_factory;

public class Bracardier extends PersonalSpital{
    public Bracardier (String name){
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Bracardierul"+ super.getName());
    }
}

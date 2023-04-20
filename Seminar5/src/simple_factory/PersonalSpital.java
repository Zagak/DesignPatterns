package simple_factory;

public abstract class PersonalSpital {
    public String name;

    public PersonalSpital(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public abstract void afiseazaDescriere();
}

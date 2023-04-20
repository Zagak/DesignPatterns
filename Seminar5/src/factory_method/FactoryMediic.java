package factory_method;



public class FactoryMediic implements Factory{

    @Override
    public PersonalSpital createPersonal(String name) {
        return new Medic(name);
    }
}

package factory_method;



public class FactoryBracardier implements Factory{
    @Override
    public PersonalSpital createPersonal(String name) {
        return new Bracardier(name);
    }
}

import SpitalFacade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.interneaza("Maria");
        facade.interneaza("Andrei");
        facade.interneaza("Frederick");
        facade.interneaza("Maria");
        facade.interneaza("Maria");
    }
}
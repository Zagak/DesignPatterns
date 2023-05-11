package state.clase;

public class BusInService implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof  BusAtEndOfRoute){
            System.out.println("The bus"+bus.getLicensePlate()+"has left in a new route");
        }else{
            System.out.println("The bus "+bus.getLicensePlate()+" cannot leave");
        }
    }
}

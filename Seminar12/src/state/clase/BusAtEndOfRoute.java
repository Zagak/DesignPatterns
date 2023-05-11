package state.clase;

public class BusAtEndOfRoute implements IBusState{


    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusInRoute || bus.getState() instanceof BusInService){
            System.out.println("Autobuzul "+bus.getLicensePlate()+" has reached the end of line");
            bus.setState(this);
        }else{
            System.out.println("Autobuzul "+bus.getLicensePlate()+" cannot go anymore");
        }
    }
}

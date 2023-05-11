package state.clase;

public class BusInRoute implements IBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute){
            System.out.println("On the road");
        }else{
            System.out.println("No more on the road");
        }
    }
}

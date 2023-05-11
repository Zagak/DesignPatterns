package state.main;

import state.clase.Bus;
import state.clase.IBusState;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("VI.21BUN");
        bus.goInService();
        bus.arriveAtTheEndOfTheRoute();
        bus.leaveForRoute();
        bus.goInService();
        bus.arriveAtTheEndOfTheRoute();
    }
}

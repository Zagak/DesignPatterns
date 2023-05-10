package state.clase;

public class StareOcupata implements IStare{
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareOcupata)){
            System.out.printf("Masa s-a ocupata acum");
            masa.setStare(this);
        }else{
            System.out.printf("Masa e deja ocupata");
        }
    }
}

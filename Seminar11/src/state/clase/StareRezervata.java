package state.clase;

public class StareRezervata implements IStare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.printf("Masa este rezervata acum");
            masa.setStare(this);
        }else{
            System.out.printf("Masa nu poate fi rezervata");
        }
    }
}

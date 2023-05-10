package state.clase;

public class StareLibera implements IStare{
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareLibera)){
            System.out.printf("Masa este eliberata acum");
            masa.setStare(this);
        }else{
            System.out.printf("Masa este deja libera");
        }
    }
}

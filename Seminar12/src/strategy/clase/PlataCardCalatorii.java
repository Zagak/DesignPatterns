package strategy.clase;

public class PlataCardCalatorii implements TipPlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata a fost realizata cu cardul de calatorii");
    }
}

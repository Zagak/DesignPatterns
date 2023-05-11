package strategy.clase;

public class PlataPrinSMS implements TipPlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata a fost realizata prin sms");
    }
}

package spital.decorator.clase;

public class RezultatOnline extends DecoratorAbstract{
    public RezultatPeHartie atr;

    public RezultatOnline(FurnizeazaRezultat atr) {
        super(atr);
    }

    @Override
    public void afisareOnline(String diagnostic) {
        System.out.println("Online "+diagnostic);
    }
}

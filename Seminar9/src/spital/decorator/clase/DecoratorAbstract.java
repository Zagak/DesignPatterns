package spital.decorator.clase;

public abstract class DecoratorAbstract implements FurnizeazaRezultat{
    private FurnizeazaRezultat atr;

    public DecoratorAbstract(FurnizeazaRezultat atr) {
        this.atr = atr;
    }

    @Override
    public void printeazaRezultat(String diagnostic) {
        atr.printeazaRezultat(diagnostic);
    }

    public abstract void afisareOnline(String diagnostic);
}

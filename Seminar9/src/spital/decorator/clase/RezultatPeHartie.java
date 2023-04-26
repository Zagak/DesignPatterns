package spital.decorator.clase;

public class RezultatPeHartie implements FurnizeazaRezultat{

    @Override
    public void printeazaRezultat(String diagnostic) {
        System.out.println("Hartie "+diagnostic);
    }
}

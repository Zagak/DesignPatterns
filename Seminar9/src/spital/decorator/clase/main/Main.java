package spital.decorator.clase.main;

import spital.decorator.clase.DecoratorAbstract;
import spital.decorator.clase.FurnizeazaRezultat;
import spital.decorator.clase.RezultatOnline;
import spital.decorator.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        FurnizeazaRezultat rezultatPeHartie = new RezultatPeHartie();
        rezultatPeHartie.printeazaRezultat("Raceala");

        DecoratorAbstract decoratorAbstract = new RezultatOnline(rezultatPeHartie);
        decoratorAbstract.afisareOnline("Raceala");
        decoratorAbstract.printeazaRezultat("Gripa");


    }
}

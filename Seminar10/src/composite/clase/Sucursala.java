package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara{
    private String nume;
    private int nrAngajati;

    private List<UnitateBancara> lista;

    public Sucursala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        lista=new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        lista.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        lista.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return lista.get(index);
    }

    @Override
    public void printDescriere(String identare) {
        System.out.println("Surcusala "+this.nume+" are "+this.nrAngajati);
        for(UnitateBancara unitateBancara:lista){
            unitateBancara.printDescriere("   "+identare);
        }
    }
}

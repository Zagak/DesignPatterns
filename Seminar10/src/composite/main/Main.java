package composite.main;

import composite.clase.Filiala;
import composite.clase.Sucursala;
import composite.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursala1=new Sucursala("Sucursala1",10);
        UnitateBancara sucursala2=new Sucursala("Sucursala2",20);

        UnitateBancara agentie1=new Sucursala("Agentie1",30);
        UnitateBancara agentie2=new Sucursala("Agentie2",60);

        UnitateBancara filiala1=new Filiala("Filiala1",20);
        UnitateBancara filiala2=new Filiala("Filiala2",70);
        UnitateBancara filiala3=new Filiala("Filiala3",90);


        sucursala1.adaugaUnitate(sucursala2);
        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(filiala1);

        sucursala2.adaugaUnitate(agentie2);
        sucursala2.adaugaUnitate(filiala2);

        agentie1.adaugaUnitate(filiala3);

        sucursala1.printDescriere("   ");
    }
}

package flyweight.main;

import flyweight.clase.Cont;
import flyweight.clase.FlyWeightFactory;
import flyweight.clase.IClientBanca;

public class Main {
    public static void main(String[] args) {
        FlyWeightFactory fabrica = new FlyWeightFactory();

        Cont cont1=new Cont(2300f,12);
        Cont cont2=new Cont(4000f,14);
        Cont cont3=new Cont(6000f,16);

        IClientBanca detinator = fabrica.getDetinator("Ion","0726894405","str.Dunno");
        detinator.descriere(cont1);

        fabrica.getDetinator("Alin","0723354","str.Ceva").descriere(cont1);
        fabrica.getDetinator("Marin","0723354","str.Arzei").descriere(cont2);
        fabrica.getDetinator("Voicu","0733546","str.Brezei").descriere(cont3);
    }
}

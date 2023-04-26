package SpitalFacade.clase;

import java.awt.image.PackedColorModel;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade(){
        this.medic=new Medic();
        medic.adaugaPacient(new Pacient("Andrei",3));
        medic.adaugaPacient(new Pacient("Maria",5));
        medic.adaugaPacient(new Pacient("Nicolae",4));

        this.salon=new Salon();
        salon.adaugaPaturiLibere(23);
        salon.adaugaPaturiLibere(43);
    }

    public void interneaza(String numePacient){
        if(medic.verificaTrimitere(medic.getPacient(numePacient))){
            if(salon.verificaPaturiLibere()){
                if(medic.getPacient(numePacient).getGravitate()>4){
                    System.out.println("Pacientul "+numePacient+" a fost internat");
                    salon.ocupaPat();
                }
                else{
                    System.out.println("Pacientul "+numePacient+" nu are o stare grava");
                }
            }else {
                System.out.println("Nu exista paturi libere!");
            }
        }else{
            System.out.println("Va trebuie trimitere");
        }
    }
}

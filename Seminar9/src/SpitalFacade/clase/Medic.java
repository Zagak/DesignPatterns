package SpitalFacade.clase;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private List<Pacient> pacients;

    public Medic() {
        pacients=new ArrayList<>();
    }

    public void adaugaPacient(Pacient pacient){
        pacients.add(pacient);
    }

    public boolean verificaTrimitere(Pacient pacient){
        return this.pacients.contains(pacient);
    }

    public Pacient getPacient(String numePacient){
        for(Pacient pacient : pacients){
            if(pacient.getNume().equals(numePacient)) {
                return pacient;
            }
        }
        return null;
    }

}

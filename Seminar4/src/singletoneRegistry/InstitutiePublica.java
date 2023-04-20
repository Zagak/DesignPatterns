package singletoneRegistry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;
    private int numarAngajati;
    private static Map<String,InstitutiePublica> registruInstitutii=new HashMap<>();

    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InstitutiePublica{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }

    public synchronized static InstitutiePublica getInstitutie(String denumire){
        if(registruInstitutii.containsKey(denumire)){
            return registruInstitutii.get(denumire);
        }
        else{
            InstitutiePublica institutiePublica=new InstitutiePublica(denumire,0);
            registruInstitutii.put(denumire,institutiePublica);
            return institutiePublica;
        }
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public synchronized static InstitutiePublica getInstitutieOptimizat(String denumire){
        if(!registruInstitutii.containsKey(denumire)){
            registruInstitutii.put(denumire,new InstitutiePublica(denumire,0));

        }
        return registruInstitutii.get(denumire);
    }
}

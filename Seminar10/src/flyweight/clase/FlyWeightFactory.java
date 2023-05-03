package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private Map<String,IClientBanca> mapCont;

    public FlyWeightFactory() {
        this.mapCont = new HashMap<>();
    }

    public IClientBanca getDetinator(String nume,String nrTelefon,String adresa){
        if(!mapCont.containsKey(nume)){
            IClientBanca client=new Detinator(nume,nrTelefon,adresa);
            mapCont.put(nume,client);
        }
        return mapCont.get(nume);
    }
}

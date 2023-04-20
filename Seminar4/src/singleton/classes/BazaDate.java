package singleton.classes;

public class BazaDate {
    private int dimensiuneDate;
    private int numatTabele;
    private  String denumire;
    public static BazaDate instanta=new BazaDate(100,2,"OOP");

    private BazaDate(){

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BazaDate{");
        sb.append("dimensiuneDate=").append(dimensiuneDate);
        sb.append(", numatTabele=").append(numatTabele);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }

    public void setNumatTabele(int numatTabele) {
        this.numatTabele = numatTabele;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    private BazaDate(int dimensiuneDate, int numatTabele, String denumire) {
        this.dimensiuneDate = dimensiuneDate;
        this.numatTabele = numatTabele;
        this.denumire = denumire;
    }

    public static BazaDate getInstanta(){
        return instanta;
    }
}

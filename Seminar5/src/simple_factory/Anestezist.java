package simple_factory;

public class Anestezist extends PersonalSpital{
    private Integer aniVechime;

    public Anestezist (String name,Integer aniVechime){
        super(name);
        this.aniVechime = aniVechime;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Anestezistul"+ super.getName()+" are"+this.aniVechime+" ani vechime");
    }
}

package builder;

public class ContBancarBuilder implements Builder{
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;
    private String numeClient;

    public ContBancarBuilder(boolean primesteSalariu, boolean cardAtasat, boolean internetBanking, String numeClient) {
    }

    public ContBancarBuilder() {
        
    }

    public ContBancarBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public ContBancarBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBancarBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancarBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    @Override
    public ContBancar build() {
        ContBancar contBancar = new ContBancar(this.primesteSalariu,this.cardAtasat,this.internetBanking,this.numeClient);
        return contBancar;
    }
}

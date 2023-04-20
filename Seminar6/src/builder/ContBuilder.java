package builder;

public class ContBuilder implements Builder{

    private final ContBancar contBancar;

    public ContBuilder() {
        this.contBancar = new ContBancar();
    }

    public ContBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.contBancar.setCardAtasat(cardAtasat);
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.contBancar.setInternetBanking(internetBanking);
        return this;
    }

    public ContBuilder setNumeClient(String numeClient) {
        this.contBancar.setNumeClient(numeClient);
        return this;
    }

    @Override
    public ContBancar build() {
        return this.contBancar;
    }
}

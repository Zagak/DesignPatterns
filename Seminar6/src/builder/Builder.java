package builder;

public interface Builder {
    public ContBancar build();

    public Builder setPrimesteSalariu(boolean primesteSalariu) ;

    public Builder setCardAtasat(boolean cardAtasat) ;

    public Builder setInternetBanking(boolean internetBanking);

    public Builder setNumeClient(String numeClient);
}

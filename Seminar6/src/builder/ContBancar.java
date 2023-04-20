package builder;

public class ContBancar {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;
    private String numeClient;

    protected ContBancar() {
        this.primesteSalariu = false;
        this.cardAtasat = false;
        this.numeClient = "Necunoscut";
        this.internetBanking = false;
    }

    protected ContBancar(boolean primesteSalariu, boolean cardAtasat, boolean internetBanking, String numeClient) {
        this.primesteSalariu = primesteSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("primesteSalariu=").append(primesteSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append('}');
        return sb.toString();
    }

    protected void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    protected void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    protected void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }
}

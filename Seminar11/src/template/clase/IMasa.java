package template.clase;

public abstract class IMasa {
    private int nr;

    public IMasa(int nr) {
        this.nr = nr;
    }

    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void invitaPersoane();
    public final void ocupaMesa(){
        curataMasa();
        aseazaServetele();
        invitaPersoane();
    }

    public int getNr() {
        return nr;
    }
}

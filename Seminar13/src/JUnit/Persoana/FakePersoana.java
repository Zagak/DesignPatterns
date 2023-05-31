package JUnit.Persoana;

public class FakePersoana implements IPersoana{
    private int getVarstaValue;
    private boolean checkCNPvalue;

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return getVarstaValue;
    }

    @Override
    public boolean checkCNP() {
        return checkCNPvalue;
    }

    public void setGetVarstaValue(int getVarstaValue) {
        this.getVarstaValue = getVarstaValue;
    }

    public void setCheckCNPvalue(boolean checkCNPvalue) {
        this.checkCNPvalue = checkCNPvalue;
    }
}

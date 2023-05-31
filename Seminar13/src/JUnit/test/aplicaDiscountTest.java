package JUnit.test;

import JUnit.Persoana.FakePersoana;
import JUnit.Persoana.PachetTuristic;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class aplicaDiscountTest {
    @Test
    void testNuSeAplicaDiscountVarstnici(){
        FakePersoana fp = new FakePersoana();
        fp.setGetVarstaValue(6);
        PachetTuristic pachetTuristic = new PachetTuristic(fp,"Eforia",1000d);
        pachetTuristic.aplicaDiscountVarstnici(70);
        assertEquals(1000,pachetTuristic.getPret());
    }

    @Test
    void testAplicaDiscount(){
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(89);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana,"Eforia",1000d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900,pachetTuristic.getPret());
    }
}
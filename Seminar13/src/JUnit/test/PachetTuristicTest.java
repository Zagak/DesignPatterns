package JUnit.test;

import JUnit.Persoana.PachetTuristic;
import JUnit.dubluri.StubPersoana;
import JUnit.dubluri.StubPersoanaMajora;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PachetTuristicTest {
    @Test
    void unMinorNuPoateRezerva(){
        StubPersoana persoana = new StubPersoana();
        PachetTuristic pachet = new PachetTuristic(persoana,"Bucuresti",150.0);
        assertFalse(pachet.poateRezerva());
    }

    @Test
    void unMajorPoateRezerva(){
        StubPersoanaMajora persoanaMajora = new StubPersoanaMajora();
        PachetTuristic pachet1 = new PachetTuristic(persoanaMajora,"Cluj",150.0);
        assertTrue(pachet1.poateRezerva());
    }
}
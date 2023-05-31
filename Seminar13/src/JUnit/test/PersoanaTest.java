package JUnit.test;

import JUnit.Persoana.ExceptieNenascut;
import JUnit.Persoana.ExeptionCNPNull;
import JUnit.Persoana.IPersoana;
import JUnit.Persoana.Persoana;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class PersoanaTest {
    @org.junit.jupiter.api.Test
    void getVarstaTestRight(){
        IPersoana persoana = new Persoana("Andrei","19708284487");
        assertEquals(25,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryNouNascut(){
        IPersoana persoana = new Persoana("Andrei","5230524123456");
        assertEquals(0,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryLimitaInferioara(){
        IPersoana persoana = new Persoana("Andrei","5000101123456");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryLimitaSuperioara(){
        IPersoana persoana = new Persoana("Andrei","299123123456");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaErrorCondition(){
        IPersoana persoana = new Persoana("Andrei","6231231123456");
        assertThrows(ExceptieNenascut.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @Test
    public void getVarstaPerformance(){
        IPersoana persoana = new Persoana("Andrei","6001231123456");
        assertTimeout(Duration.ofMillis(100),()->persoana.getVarsta());
    }

    //C.O.R.E.C.T
    @Test
    public void cnpCaractereCorect(){
        Persoana persoana = new Persoana("Andrei","6001231123456");
        assertEquals(13,persoana.getCNP().length());
    }

    @Test
    public void ordineDeVarstaPersoane(){
        Persoana persoana1 = new Persoana("Marcel","6001231123456");
        Persoana persoana2 = new Persoana("Maria","2981231123456");
        assertTrue(persoana1.getVarsta()<persoana2.getVarsta());
    }

    @Test
    public void getvarstaShouldThrowExceptionCNPNull(){
        Persoana persoana = new Persoana("Marcel",null);
        assertThrows(ExeptionCNPNull.class,()->persoana.getVarsta());
    }

    @Test
    public void getvarstaCardinality(){
        Persoana persoana = new Persoana("Marcel","5220515151234");
        assertEquals(1,persoana.getVarsta());
    }

    @Test
    public void verificaConstructorCrosschain(){
        Persoana persoana1 = new Persoana("Marcel","5220515151234");
        Persoana persoana2 = new Persoana();
        persoana2.setCNP("5220515151234");
        persoana2.setNume("Marcel");

        assertEquals(persoana1.getCNP(),persoana2.getCNP());
        assertEquals(persoana1.getNume(),persoana2.getNume());
    }



}

package cotxox;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import conductores.Conductor;

public class ConductorTest {
    Conductor conductor1;
    Conductor conductor2;
    Conductor conductor3;

    @Before
    public void objectsTest(){
        conductor1 = new Conductor("Joan");
        conductor2 = new Conductor("Pep");
        conductor3 = new Conductor("Alex");


    }
    @Test
    public void getNombreTest(){
        assertEquals("Joan", conductor1.getNombre());
        assertEquals("Pep", conductor2.getNombre());
        assertEquals("Alex", conductor3.getNombre());
    }

    @Test
    public void modeloTest(){
        conductor1.setModelo("Audi");
        assertEquals("Audi", conductor1.getModelo());
        conductor2.setModelo("Panda");
        assertEquals("Panda", conductor2.getModelo());
        conductor3.setModelo("Fiesta");
        assertEquals("Fiesta", conductor3.getModelo());
    }

    @Test
    public void matriculaTest(){
        conductor1.setMatricula("12345678H");
        assertEquals("12345678H", conductor1.getMatricula());
        conductor2.setMatricula("987654320K");
        assertEquals("987654320K", conductor2.getMatricula());
        conductor3.setMatricula("876192412L");
        assertEquals("876192412L", conductor3.getMatricula());
    }

    @Test
    public void valoracionTest(){
        assertEquals(0d, conductor1.getValoracionMedia(), 0.001);
        conductor2.setValoracion((byte) 4);
        assertEquals(4d, conductor2.getValoracionMedia(), 0.001);
        conductor3.setValoracion((byte) 5);
        conductor3.setValoracion((byte) 2);
        conductor3.setValoracion((byte) 3);
        assertEquals(3.33333333d, conductor3.getValoracionMedia(), 0.001);

    }

    @Test
    public void ocupadoTest(){
        assertEquals(false, conductor1.isOcupado());
        conductor2.setOcupado(true);
        assertEquals(true, conductor2.isOcupado());
        conductor3.setOcupado(false);
        assertEquals(false, conductor3.isOcupado());



    }



}

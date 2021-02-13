package cotxox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import carrera.Carrera;

public class CarreraTest {
    Carrera carrera1 = null;
    Carrera carrera2 = null;
    Carrera carrera3 = null;
    Carrera carrera4 = null;
    Carrera carrera5 = null;
    Carrera carrera6 = null;

    @Before
    public void objectsTest(){
        this.carrera1 = new Carrera("8172517829129571");
        this.carrera2 = new Carrera("5164572545647435");
        this.carrera3 = new Carrera("9472828303742033");
        this.carrera4 = new Carrera("9387727638952032");
        this.carrera5 = new Carrera("0293462038342772");
        this.carrera6 = new Carrera("9767589234582934");

        carrera1.setOrigen("Marratxi");
        carrera2.setOrigen("Arta");
        carrera3.setOrigen("Valldemossa");
        carrera4.setOrigen("Cala Millor");
        carrera5.setOrigen("Palma");
        carrera6.setOrigen("Llucmajor");

        carrera1.setDestino("Llucmajor");
        carrera2.setDestino("Palma");
        carrera3.setDestino("Cala Millor");
        carrera4.setDestino("Valldemossa");
        carrera5.setDestino("Arta");
        carrera6.setDestino("Marratxi");

        carrera1.setTiempoEsperado(42);
        carrera2.setTiempoEsperado(2);
        carrera3.setTiempoEsperado(89);
        carrera4.setTiempoEsperado(76);
        carrera5.setTiempoEsperado(11);
        carrera6.setTiempoEsperado(908);

        carrera1.setTiempoCarrera(1);
        carrera2.setTiempoCarrera(4);
        carrera3.setTiempoCarrera(10);
        carrera4.setTiempoCarrera(14);
        carrera5.setTiempoCarrera(30);
        carrera6.setTiempoCarrera(50);

        carrera1.setDistancia(1);
        carrera2.setDistancia(2);
        carrera3.setDistancia(6);
        carrera4.setDistancia(12);
        carrera5.setDistancia(33);
        carrera6.setDistancia(88);

        carrera1.recibirPropina(3);
        carrera2.recibirPropina(4);
        carrera3.recibirPropina(5);
        carrera4.recibirPropina(8);


     }

    @Test
    public void constructorTest(){
        assertNotNull(carrera1);
    }

    @Test
    public void tarjetaCreditoUsuarioTest(){
        assertEquals("8172517829129571", carrera1.getTarjetaCredito());
        assertEquals("5164572545647435", carrera2.getTarjetaCredito());
        assertEquals("9472828303742033", carrera3.getTarjetaCredito());
        assertEquals("9387727638952032", carrera4.getTarjetaCredito());
        assertEquals("0293462038342772", carrera5.getTarjetaCredito());
        assertEquals("9767589234582934", carrera6.getTarjetaCredito());
    }

    @Test
    public void origenTest(){
        assertEquals("Marratxi", carrera1.getOrigen());
        assertEquals("Arta", carrera2.getOrigen());
        assertEquals("Valldemossa", carrera3.getOrigen());
        assertEquals("Cala Millor", carrera4.getOrigen());
        assertEquals("Palma", carrera5.getOrigen());
        assertEquals("Llucmajor", carrera6.getOrigen());
    }

    public void destinoTest(){
        assertEquals("Llucmajor", carrera1.getDestino());
        assertEquals("Palma", carrera2.getDestino());
        assertEquals("Cala Millor", carrera3.getDestino());
        assertEquals("Valldemossa", carrera4.getDestino());
        assertEquals("Arta", carrera5.getDestino());
        assertEquals("Marratxi", carrera6.getDestino());
    }


    public void tiempoEsperadoTest(){
        assertEquals(42, carrera1.getTiempoEsperado());
        assertEquals(2, carrera2.getTiempoEsperado());
        assertEquals(89, carrera3.getTiempoEsperado());
        assertEquals(76, carrera4.getTiempoEsperado());
        assertEquals(11, carrera5.getTiempoEsperado());
        assertEquals(908, carrera6.getTiempoEsperado());
    }

    public void tiempoCarreraTest(){
        assertEquals(1, carrera1.getTiempoCarrera());
        assertEquals(4, carrera2.getTiempoCarrera());
        assertEquals(10, carrera3.getTiempoCarrera());
        assertEquals(14, carrera4.getTiempoCarrera());
        assertEquals(30, carrera5.getTiempoCarrera());
        assertEquals(50, carrera6.getTiempoCarrera());
    }
    public void distancia(){
        assertEquals(1.0d, carrera1.getDistancia(), 0.001);
        assertEquals(2.0d, carrera2.getTiempoCarrera(), 0.001);
        assertEquals(6.0d, carrera3.getDistancia(), 0.001);
        assertEquals(12.0d, carrera4.getDistancia(), 0.001);
        assertEquals(33.0d, carrera5.getDistancia(), 0.001);
        assertEquals(88.0d, carrera6.getDistancia(), 0.001);
    }
    
}

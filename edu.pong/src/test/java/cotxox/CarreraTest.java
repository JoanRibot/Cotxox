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
        carrera1.setOrigen("Marratxi");
        assertEquals("Marratxi", carrera1.getOrigen());
        carrera2.setOrigen("Arta");
        assertEquals("Arta", carrera2.getOrigen());
        carrera3.setOrigen("Valldemossa");
        assertEquals("Valldemossa", carrera3.getOrigen());
        carrera4.setOrigen("Cala Millor");
        assertEquals("Cala Millor", carrera4.getOrigen());
        carrera5.setOrigen("Palma");
        assertEquals("Palma", carrera5.getOrigen());
        carrera6.setOrigen("Llucmajor");
        assertEquals("Llucmajor", carrera6.getOrigen());
    }

    public void destinoTest(){
        carrera1.setDestino("Llucmajor");
        assertEquals("Llucmajor", carrera1.getDestino());
        carrera2.setDestino("Palma");
        assertEquals("Palma", carrera2.getDestino());
        carrera3.setDestino("Cala Millor");
        assertEquals("Cala Millor", carrera3.getDestino());
        carrera4.setDestino("Valldemossa");
        assertEquals("Valldemossa", carrera4.getDestino());
        carrera5.setDestino("Arta");
        assertEquals("Arta", carrera5.getDestino());
        carrera6.setDestino("Marratxi");
        assertEquals("Marratxi", carrera6.getDestino());
    }


    public void tiempoEsperadoTest(){
        carrera1.setTiempoEsperado(42);
        assertEquals(42, carrera1.getTiempoEsperado());
        carrera2.setTiempoEsperado(2);
        assertEquals(2, carrera2.getTiempoEsperado());
        carrera3.setTiempoEsperado(89);
        assertEquals(89, carrera3.getTiempoEsperado());
        carrera4.setTiempoEsperado(76);
        assertEquals(76, carrera4.getTiempoEsperado());
        carrera5.setTiempoEsperado(11);
        assertEquals(11, carrera5.getTiempoEsperado());
        carrera6.setTiempoEsperado(908);
        assertEquals(908, carrera6.getTiempoEsperado());
    }

    public void tiempoCarreraTest(){
        carrera1.setTiempoEsperado(42);
        assertEquals(42, carrera1.getTiempoCarrera());
        carrera2.setTiempoEsperado(2);
        assertEquals(2, carrera2.getTiempoCarrera());
        carrera3.setTiempoEsperado(89);
        assertEquals(89, carrera3.getTiempoCarrera());
        carrera4.setTiempoEsperado(76);
        assertEquals(76, carrera4.getTiempoCarrera());
        carrera5.setTiempoEsperado(11);
        assertEquals(11, carrera5.getTiempoCarrera());
        carrera6.setTiempoEsperado(908);
        assertEquals(908, carrera6.getTiempoCarrera());
    }
    public void distancia(double d){
        carrera1.setDistancia(42);
        assertEquals(42d, carrera1.getDistancia());
        carrera2.setDistancia(2.5);
        assertEquals(2.5d, carrera2.getTiempoCarrera());
        carrera3.setDistancia(53.3);
        assertEquals(53.3d, carrera3.getDistancia());
        carrera4.setDistancia(60.9);
        assertEquals(60.9d, carrera4.getDistancia());
        carrera5.setDistancia(11);
        assertEquals(11d, carrera5.getDistancia());
        carrera6.setDistancia(88.9);
        assertEquals(88.9d, carrera6.getDistancia());
    }
    
}

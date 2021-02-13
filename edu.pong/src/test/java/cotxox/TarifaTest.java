package cotxox;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import carrera.Carrera;
import tarifa.Tarifa;

public class TarifaTest {
    Tarifa tarifa;
    Carrera carrera1 = null;
    Carrera carrera2 = null;
    Carrera carrera3 = null;
    Carrera carrera4 = null;
    Carrera carrera5 = null;
    Carrera carrera6 = null;


    @Before
    public void objectsTest(){
        this.tarifa = new Tarifa();
        
        this.carrera1 = new Carrera("8172517829129571");
        this.carrera2 = new Carrera("5164572545647435");
        this.carrera3 = new Carrera("9472828303742033");
        this.carrera4 = new Carrera("9387727638952032");
        this.carrera5 = new Carrera("0293462038342772");
        this.carrera6 = new Carrera("9767589234582934");

        carrera1.setDistancia(1);
        carrera2.setDistancia(2);
        carrera3.setDistancia(6);
        carrera4.setDistancia(12);
        carrera5.setDistancia(33);
        carrera6.setDistancia(88);

        carrera1.setTiempoCarrera(1);
        carrera2.setTiempoCarrera(4);
        carrera3.setTiempoCarrera(10);
        carrera4.setTiempoCarrera(14);
        carrera5.setTiempoCarrera(30);
        carrera6.setTiempoCarrera(50);

    }


    @Test
    public void getCosteDistanciaTest(){
        assertEquals(1.35d, tarifa.getCosteDistancia(carrera1.getDistancia()), 0.001);
        assertEquals(2.7d, tarifa.getCosteDistancia(carrera2.getDistancia()), 0.001);
        assertEquals(8.1d, tarifa.getCosteDistancia(carrera3.getDistancia()), 0.001);
        assertEquals(16.2d, tarifa.getCosteDistancia(carrera4.getDistancia()), 0.001);
        assertEquals(44.55d, tarifa.getCosteDistancia(carrera5.getDistancia()), 0.001);
        assertEquals(118.8d, tarifa.getCosteDistancia(carrera6.getDistancia()), 0.001);
}

    @Test
    public void getCosteTiempoTest(){
        assertEquals(0.35d, tarifa.getCosteTiempo(carrera1.getTiempoCarrera()), 0.001);
        assertEquals(1.4d, tarifa.getCosteTiempo(carrera2.getTiempoCarrera()), 0.001);
        assertEquals(3.5d, tarifa.getCosteTiempo(carrera3.getTiempoCarrera()), 0.001);
        assertEquals(4.9d, tarifa.getCosteTiempo(carrera4.getTiempoCarrera()), 0.001);
        assertEquals(10.5d, tarifa.getCosteTiempo(carrera5.getTiempoCarrera()), 0.001);
        assertEquals(17.5d, tarifa.getCosteTiempo(carrera6.getTiempoCarrera()), 0.001);

    }

    @Test 
    public void getCosteTotalTest(){
        assertEquals(5d, tarifa.getCosteTotal(carrera1), 0.001);
        assertEquals(5d, tarifa.getCosteTotal(carrera2), 0.001);
        assertEquals(13.92d, tarifa.getCosteTotal(carrera3), 0.001);
        assertEquals(25.32d, tarifa.getCosteTotal(carrera4), 0.001);
        assertEquals(66.06d, tarifa.getCosteTotal(carrera5), 0.001);
        assertEquals(163.56d, tarifa.getCosteTotal(carrera6), 0.001);


    }

}

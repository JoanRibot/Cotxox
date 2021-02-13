package cotxox;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import conductores.Conductor;
import conductores.PoolConductores;

public class PoolConductaresTest {
    PoolConductores conductores;


    @Before
    public void objectsTest(){
        List<Conductor> poolConductores = new ArrayList<Conductor>();
        String[] nombreConductores = {"Pere", "Raul", "David"};

        for(String nombre:nombreConductores){
            Conductor conductor = new Conductor(nombre);
            poolConductores.add(conductor);
        }

        conductores = new PoolConductores(poolConductores);
    }

    @Test
    public void getConductoresTest(){
        for (Conductor conductor:conductores.getConductores()){
            System.out.println(conductor.getNombre());
        }
    }
/**
*  @Test
*    public void asignarConductorConSitioTest(){
*        conductores.asignarConductor();
*        conductores.asignarConductor();
*        for (Conductor conductor:conductores.getConductores()){
*            System.out.println(conductor.isOcupado());
*        }
*        
*    }
**/
    @Test
    public void asignarConductorSinSitioTest(){
        conductores.asignarConductor();
        conductores.asignarConductor();
        conductores.asignarConductor();
        conductores.asignarConductor();
        for (Conductor conductor:conductores.getConductores()){
            System.out.println(conductor.isOcupado());
        }
        
    }
}

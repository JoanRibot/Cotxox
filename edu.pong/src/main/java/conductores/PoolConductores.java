package conductores;

import java.util.List;
import java.util.Optional;

public class PoolConductores {
    List<Conductor> conductores;

    public PoolConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }


    public List<Conductor> getConductores() {
        return conductores;
    }


    public Optional<Conductor> asignarConductor() {
        Optional<Conductor> conductor = this.conductores.stream().filter(c -> !c.isOcupado()).findAny();
        if(conductor.isPresent()){
            conductor.get().setOcupado(true);
            return conductor;
        }
        else{
            System.out.println("Todos los conductores están ocupados");
            Optional <Conductor> noHayConductores = null;
            return noHayConductores;
        }
    }

}

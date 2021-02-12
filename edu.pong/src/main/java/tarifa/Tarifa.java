package tarifa;

public class Tarifa {
    double costeTarifa;
    
    public void setCosteTarifa(int tiempoCarrera){
        this.costeTarifa *= tiempoCarrera;
    }
}

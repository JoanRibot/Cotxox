package carrera;

public class Carrera {
    String tarjetaCredito;
    String origen;
    String destino;
    double distancia;
    int tiempoEsperado;
    int tiempoCarrera;
    double costeTotal;
    int propina;
    //Conductor conductor;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
        //this.conductor = conductor;

    }


	public String getTarjetaCredito(){
        return this.tarjetaCredito;
    }

    public void setOrigen(String lugarOrigen){
        this.origen = lugarOrigen;
    }

    public String getOrigen() {
        return origen;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCosteEsperado(){
        return costeTotal;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }
    
    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }
    
    
}

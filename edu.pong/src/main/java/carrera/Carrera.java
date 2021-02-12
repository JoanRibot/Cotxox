package carrera;

public class Carrera {
    String tarjetaCreditoUsuario;
    String origen;
    String destino;
    int tiempoEsperado;
    int tiempoCarrera;
    double distancia;
    //Conductor conductor;

    public Carrera(String tarjetaCreditoUsuario) {
        this.tarjetaCreditoUsuario = tarjetaCreditoUsuario;
        //this.conductor = conductor;

    }


	public String gettarjetaCreditoUsuario(){
        return this.tarjetaCreditoUsuario;
    }

    public void setOrigen(String lugarOrigen){
        this.origen = lugarOrigen;
    }

    public String getOrigen() {
        return origen;
    }
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }



}

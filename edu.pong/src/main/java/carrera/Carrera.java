package carrera;

import java.util.Optional;

import conductores.Conductor;
import conductores.PoolConductores;
import tarifa.Tarifa;

public class Carrera {
    String tarjetaCredito;
    String origen;
    String destino;
    double distancia = 0;
    int tiempoEsperado = 0;
    int tiempoCarrera = 0;
    double costeTotal = 0d;
    int propina = 0;

    private Optional<Conductor> conductor;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;

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
        return Tarifa.getCosteTotal(this);
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

    public int getPropina() {
        return propina;
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }

    public Optional<Conductor> getConductor() {
        return conductor;
    }

    public void asignarConductor(PoolConductores conductores){
        this.conductor = conductores.asignarConductor();
    }

    public double getCosteTotal(){
        return getCosteEsperado() + getPropina();
    }

    public void realizarPago(double pago) {
		this.costeTotal = pago;
	}

    public void liberarConductor(){
        this.conductor.get().setOcupado(false);
    }
}

package conductores;

import java.util.ArrayList;

public class Conductor {
    String nombre;
    String modelo;
    String matricula;
    double valoracionMedia;
	private ArrayList<Byte> valoraciones = new ArrayList<>();
    boolean ocupado = false;

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        if(this.valoraciones.size()==0){
            return 0;
        }
        this.valoracionMedia = 0;
        for (byte valoracion:this.valoraciones){
            this.valoracionMedia += valoracion;
        }
        return (double)this.valoracionMedia / this.valoraciones.size();
        }
    

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.valoracionMedia = getValoracion();
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
}

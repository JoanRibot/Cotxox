package tarifa;

import carrera.Carrera;

public class Tarifa {
    final double costeTarifa = 1.35;
    final double costeMinuto = 0.35;
    final double costeMinimo = 5;
    final byte comision = 20;

    public double getCosteDistancia(double distancia){
        return this.costeTarifa * distancia;
    }

    public double getCosteTiempo(int minutos){
        return this.costeMinuto * minutos;
    }
    public double getCosteTotal(Carrera carrera){
        double conteSinComision = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoCarrera());
        double comisionPorcentaje = (double)this.comision / 100;
        double costeTotal = conteSinComision + conteSinComision * comisionPorcentaje;
        if (costeTotal < this.costeMinimo){
            return this.costeMinimo;
        }
        else {
            return costeTotal;
        }
    }
}

package tarifa;

import carrera.Carrera;

public class Tarifa {
    final static double costeTarifa = 1.35;
    final static double costeMinuto = 0.35;
    final static double costeMinimo = 5;
    final static byte comision = 20;

    public static double getCosteDistancia(double distancia){
        return costeTarifa * distancia;
    }

    public static double getCosteTiempo(int minutos){
        return costeMinuto * minutos;
    }
    public static double getCosteTotal(Carrera carrera){
        double conteSinComision = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoCarrera());
        double comisionPorcentaje = (double)comision / 100;
        double costeTotal = conteSinComision + conteSinComision * comisionPorcentaje;
        if (costeTotal < costeMinimo){
            return costeMinimo;
        }
        else {
            return costeTotal;
        }
    }
}

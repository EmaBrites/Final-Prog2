package v2;

import java.util.ArrayList;

public class Empresa extends Establecimiento{

    private ArrayList<Establecimiento> establecimientos;

    public Empresa(int id, String nombre) {
        super(id, nombre);
        this.establecimientos = new ArrayList<>();
    }

    @Override
    public int getCantidadAnimales() {
        int cantidad = 0;
        for (Establecimiento establecimiento : this.establecimientos) {
            cantidad += establecimiento.getCantidadAnimales();
        }
        for (Rodeo rodeo : this.getRodeos()) {
            cantidad += rodeo.getCantidadAnimales();
        }
        cantidad += this.getAnimales().size();
        return cantidad;
    }

    @Override
    public double getPesoTotal() {
        double pesoTotal = 0;
        for (Establecimiento establecimiento : this.establecimientos) {
            pesoTotal += establecimiento.getPesoTotal();
        }
        for (Rodeo rodeo : this.getRodeos()) {
            pesoTotal += rodeo.getPesoTotal();
        }
        for (Animal animal : this.getAnimales()) {
            pesoTotal += animal.getPeso();
        }
        return pesoTotal;
    }
}

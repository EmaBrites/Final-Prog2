package v2;

import java.util.ArrayList;

public class Establecimiento extends ConjuntoAnimales{
    private ArrayList<Rodeo> rodeos;

    public Establecimiento(int id, String nombre) {
        super(id, nombre);
        this.rodeos = new ArrayList<>();
    }

    public ArrayList<Rodeo> getRodeos() {
        return new ArrayList<>(rodeos);
    }

    @Override
    public int getCantidadAnimales() {
        int cantidad = 0;
        for (Rodeo rodeo : this.rodeos) {
            cantidad += rodeo.getCantidadAnimales();
        }
        cantidad += this.getAnimales().size();
        return cantidad;
    }

    @Override
    public double getPesoTotal() {
        double pesoTotal = 0;
        for (Rodeo rodeo : this.rodeos) {
            pesoTotal += rodeo.getPesoTotal();
        }
        for (Animal animal : this.getAnimales()) {
            pesoTotal += animal.getPeso();
        }
        return pesoTotal;
    }

}

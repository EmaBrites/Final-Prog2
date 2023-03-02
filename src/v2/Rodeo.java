package v2;

public class Rodeo extends ConjuntoAnimales{

    public Rodeo(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public int getCantidadAnimales() {
        return this.getAnimales().size();
    }

    @Override
    public double getPesoTotal() {
        double pesoTotal = 0;
        for (Animal animal : this.getAnimales()) {
            pesoTotal += animal.getPeso();
        }
        return pesoTotal;
    }

}

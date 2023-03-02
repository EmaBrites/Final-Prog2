package v2;

import java.util.ArrayList;

public abstract class ConjuntoAnimales {
    private int id;
    private String nombre;
    private ArrayList<Animal> animales;

    public ConjuntoAnimales(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Animal> getAnimales() {
        return new ArrayList<>(animales);
    }

    public void addAnimal(Animal animal){
        if (!this.animales.contains(animal)) {
            this.animales.add(animal);
        }
    }

    public void removeAnimal(Animal animal){
        if (this.animales.contains(animal)) {
            this.animales.remove(animal);
        }
    }

    public abstract int getCantidadAnimales();

    public abstract double getPesoTotal();

    public double getPesoPromedio() {
        return this.getPesoTotal() / this.getCantidadAnimales();
    }
}

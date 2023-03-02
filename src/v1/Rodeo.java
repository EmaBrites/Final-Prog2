package v1;

import v1.Animal;

import java.util.ArrayList;

public class Rodeo {
    private int id;
    private String nombre;
    protected int cantidadAnimales;
    protected double pesoPromedio;
    protected double pesoTotal;
    private ArrayList<Animal> animales;

    public Rodeo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadAnimales = 0;
        this.pesoPromedio = 0;
        this.pesoTotal = 0;
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

    public int getCantidadAnimales() {
        return cantidadAnimales;
    }

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public ArrayList<Animal> getAnimales() {
        return new ArrayList<>(animales);
    }

    public void addAnimal(Animal animal){
        if (!this.animales.contains(animal)) {
            this.animales.add(animal);
            actualizarDatos(true, animal);
        }
    }

    public void removeAnimal(Animal animal){
        if (this.animales.contains(animal)) {
            this.animales.remove(animal);
            this.actualizarDatos(false, animal);
        }
    }

    public void actualizarDatos(boolean esAgregar, Animal animal){
        if (esAgregar){
            cantidadAnimales++;
            pesoTotal += animal.getPeso();
        } else {
            cantidadAnimales--;
            pesoTotal -= animal.getPeso();
        }
        pesoPromedio = pesoTotal / cantidadAnimales;
    }

}

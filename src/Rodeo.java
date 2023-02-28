import java.util.ArrayList;

public class Rodeo {
    private int id;
    private String nombre;
    private int cantidadAnimales;
    private double pesoPromedio;
    private double pesoTotal;
    private ArrayList<Animal> animales;

    public Rodeo(int id, String nombre, int cantidadAnimales, double pesoPromedio, double pesoTotal) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadAnimales = cantidadAnimales;
        this.pesoPromedio = pesoPromedio;
        this.pesoTotal = pesoTotal;
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
            cantidadAnimales++;
            pesoTotal += animal.getPeso();
            pesoPromedio = pesoTotal / cantidadAnimales;
        }
    }

    public void removeAnimal(Animal animal){
        if (this.animales.contains(animal)) {
            this.animales.remove(animal);
            cantidadAnimales--;
            pesoTotal -= animal.getPeso();
            pesoPromedio = pesoTotal / cantidadAnimales;
        }
    }

}

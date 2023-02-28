import java.util.ArrayList;

public class Establecimiento {
    private int id;
    private String nombre;
    private int cantidadAnimales;
    private double pesoPromedio;
    private double pesoTotal;
    private ArrayList<Rodeo> rodeos;
    private ArrayList<Animal> animales;

    public Establecimiento(int id, String nombre, int cantidadAnimales, double pesoPromedio, double pesoTotal) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadAnimales = cantidadAnimales;
        this.pesoPromedio = pesoPromedio;
        this.pesoTotal = pesoTotal;
        this.rodeos = new ArrayList<>();
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

    public ArrayList<Rodeo> getRodeos() {
        return new ArrayList<>(rodeos);
    }

    public ArrayList<Animal> getAnimales() {
        return new ArrayList<>(animales);
    }

    public void addRodeo(Rodeo rodeo){
        if (!this.contains())
        this.rodeos.add(rodeo);
        cantidadAnimales += rodeo.getCantidadAnimales();
        pesoTotal += rodeo.getPesoTotal();
        pesoPromedio = pesoTotal / cantidadAnimales;
    }

    public void addVaca(Animal animal){
        this.animales.add(animal);
        cantidadAnimales++;
        pesoTotal += animal.getPeso();
        pesoPromedio = pesoTotal / cantidadAnimales;
    }

    public boolean contains(Animal animal){
        return rodeos.contains(animal)||animales.contains(animal);
    }
}

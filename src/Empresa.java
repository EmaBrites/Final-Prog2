import java.util.ArrayList;

public class Empresa {
    private int id;
    private String nombre;
    private int cantidadAnimales;
    private double pesoPromedio;
    private double pesoTotal;
    private ArrayList<Establecimiento> establecimientos;
    private ArrayList<Rodeo> rodeos;
    private ArrayList<Animal> animales;

    public Empresa(int id, String nombre, int cantidadAnimales, double pesoPromedio, double pesoTotal) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadAnimales = cantidadAnimales;
        this.pesoPromedio = pesoPromedio;
        this.pesoTotal = pesoTotal;
        this.establecimientos = new ArrayList<>();
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

    public ArrayList<Establecimiento> getEstablecimientos() {
        return new ArrayList<>(establecimientos);
    }

    public void addEstablecimiento(Establecimiento establecimiento){
        this.establecimientos.add(establecimiento);
        cantidadAnimales += establecimiento.getCantidadAnimales();
        pesoTotal += establecimiento.getPesoTotal();
        pesoPromedio = pesoTotal / cantidadAnimales;
    }

    public void addRodeo(Rodeo rodeo){
        this.rodeos.add(rodeo);
        cantidadAnimales += rodeo.getCantidadAnimales();
        pesoTotal += rodeo.getPesoTotal();
        pesoPromedio = pesoTotal / cantidadAnimales;
    }

    public void addAnimal(Animal animal){
        this.animales.add(animal);
        cantidadAnimales++;
        pesoTotal += animal.getPeso();
        pesoPromedio = pesoTotal / cantidadAnimales;
    }
}

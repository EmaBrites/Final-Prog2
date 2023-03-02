package v1;

public class Animal {
    private int id;
    private int edad;
    private double peso;
    private String raza;
    private String sexo;
    private boolean capado;
    private int ternerosParidos;

    public Animal(int id, int edad, double peso, String raza, String sexo, boolean capado, int ternerosParidos) {
        this.id = id;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
        this.capado = capado;
        this.ternerosParidos = ternerosParidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isCapado() {
        return capado;
    }

    public void setCapado(boolean capado) {
        this.capado = capado;
    }

    public int getTernerosParidos() {
        return ternerosParidos;
    }

    public void setTernerosParidos(int ternerosParidos) {
        this.ternerosParidos = ternerosParidos;
    }

    public boolean equals(Animal animal) {
        return id == animal.getId();
    }
}

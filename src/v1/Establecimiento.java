package v1;

import java.util.ArrayList;

public class Establecimiento extends Rodeo {
    private ArrayList<Rodeo> rodeos;

    public Establecimiento(int id, String nombre) {
        super(id,nombre);
        this.rodeos = new ArrayList<>();
    }

    public ArrayList<Rodeo> getRodeos() {
        return new ArrayList<>(rodeos);
    }

    public void addRodeo(Rodeo rodeo){
        if(!this.rodeos.contains(rodeo)) {
            this.rodeos.add(rodeo);
            for (Animal animal : rodeo.getAnimales()) {
                this.actualizarDatos(true, animal);
            }
        }
    }
    public void removeRodeo(Rodeo rodeo) {
        if (this.rodeos.contains(rodeo)) {
            this.rodeos.remove(rodeo);
            for (Animal animal : rodeo.getAnimales()) {
                this.actualizarDatos(false, animal);
            }
        }
    }

}

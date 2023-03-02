package v1;

import java.util.ArrayList;

public class Empresa extends Establecimiento{
    private ArrayList<Establecimiento> establecimientos;

    public Empresa(int id, String nombre) {
        super(id,nombre);
        this.establecimientos = new ArrayList<>();
    }

    public ArrayList<Establecimiento> getEstablecimientos() {
        return new ArrayList<>(establecimientos);
    }

    public void addEstablecimiento(Establecimiento establecimiento){
        if(!this.establecimientos.contains(establecimiento)) {
            this.establecimientos.add(establecimiento);
            for (Rodeo rodeo : establecimiento.getRodeos()) {
                for (Animal animal : rodeo.getAnimales()) {
                    this.actualizarDatos(true, animal);
                }
            }
        }
    }

    public void removeEstablecimiento(Establecimiento establecimiento) {
        if (this.establecimientos.contains(establecimiento)) {
            this.establecimientos.remove(establecimiento);
            for (Rodeo rodeo : establecimiento.getRodeos()) {
                for (Animal animal : rodeo.getAnimales()) {
                    this.actualizarDatos(false, animal);
                }
            }
        }
    }

}

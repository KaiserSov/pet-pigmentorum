package co.com.sofka.ddd.gremioPersonas.events;

import co.com.sofka.ddd.gremioPersonas.values.Nombre;

public class FuncionAgregada extends DomainEvent {
    private final Nombre nombre;

    public FuncionAgregada(Nombre nombre) {
        super("sofka.funcion.funcioncreada");
        this.nombre = nombre;
    }

    public Nombre getNombre(){
        return nombre;
    }
}

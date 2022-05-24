package co.com.sofka.ddd.gremioPersonas.events;

import co.com.sofka.ddd.equipos.values.Caracteristicas;
import co.com.sofka.ddd.equipos.values.Descripcion;
import co.com.sofka.ddd.equipos.values.FuncionId;
import co.com.sofka.ddd.gremioPersonas.Funcion;
import co.com.sofka.ddd.gremioPersonas.GremioPersonas;
import co.com.sofka.ddd.gremioPersonas.values.CantidadPersonas;
import co.com.sofka.ddd.gremioPersonas.values.GremioId;
import co.com.sofka.ddd.gremioPersonas.values.MaterialId;
import co.com.sofka.ddd.gremioPersonas.values.Nombre;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class MaterialAgregado extends DomainEvent {
    private final Nombre nombre;

    public FuncionAgregada(Nombre nombre) {
        super("sofka.funcion.materialAgregado");
        this.nombre = nombre;
    }

    public Nombre getNombre(){
        return nombre;
    }

    public GremioPersonas(GremioId entityId, Nombre) {
        super(entityId);
        appendChange(new GremioPersonas(nombre)).apply();
    }

    public void actualizarGremio(GremioId entityId){
        appendChange(new GremioActualizado(GremioId)).apply();
    }

    public void actualizarCantidadDePersonas(CantidadPersonas cantidadPersonas){
        appendChange(new CantidadDePersonasActualizada(cantidadPersonas)).apply();
    }

    public void agregarFuncion(FuncionId entityId, Caracteristicas caracteristicas, Descripcion descripcion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(caracteristicas);
        Objects.requireNonNull(descripcion);
        appendChange(new FuncionAgregada(entityId, caracteristicas, descripcion)).apply();
    }

    public void agregarMaterial(MaterialId entityId, materials){
        appendChange(new MaterialAgregado(entityId, materials)).apply();
    }

    public Optional<Funcion> getFuncionPorId(FuncionId entityId){
        return funciones()
                .stream()
                .filter(funcion -> funcion.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Material> getMaterialPorId(MaterialId entityId){
        return materiales
                .stream()
                .filter(material -> material.identity().equals(entityId))
                .findFirst();
    }

    //Encapsulamiento

    public Nombre nombre() {
        return nombre;
    }

    public GremioId gremioId(){
        return gremioId;
    }

    public Set<Funcion> funciones() {
        return funciones;
    }

    public Set<Material> Materiales(){
        return materiales;
    }
}
package co.com.sofka.ddd.gremioPersonas;

import co.com.sofka.ddd.equipos.values.Caracteristicas;
import co.com.sofka.ddd.equipos.values.Descripcion;
import co.com.sofka.ddd.equipos.values.FuncionId;
import co.com.sofka.ddd.gremioPersonas.events.CantidadDePersonasActualizada;
import co.com.sofka.ddd.gremioPersonas.events.FuncionAgregada;
import co.com.sofka.ddd.gremioPersonas.events.GremioActualizado;
import co.com.sofka.ddd.gremioPersonas.events.MaterialAgregado;
import co.com.sofka.ddd.gremioPersonas.values.CantidadPersonas;
import co.com.sofka.ddd.gremioPersonas.values.MaterialId;
import co.com.sofka.ddd.gremioPersonas.values.Nombre;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.ddd.gremioPersonas.values.GremioId;

import java.util.Objects;
import java.util.Set;

public class GremioPersonas extends AggregateEvent<GremioId> {
    protected Nombre nombre;
    protected Set<Funcion> funciones;
    protected Set<Material> materiales;

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

    public void agregarMaterial(MaterialId entityId, material){
        appendChange(new MaterialAgregado(entityId, material)).apply();
    }
}

package co.com.sofka.ddd.gremioPersonas;

import co.com.sofka.ddd.gremioPersonas.events.CantidadDePersonasActualizada;
import co.com.sofka.ddd.gremioPersonas.events.FuncionAgregada;
import co.com.sofka.ddd.gremioPersonas.events.GremioActualizado;
import co.com.sofka.ddd.gremioPersonas.events.MaterialAgregado;

import java.util.HashSet;

public class GremioChange extends EventChange{
    public GremioChange(final GremioPersonas gremioPersonas) {

        apply((GremioActualizado event) -> {
            gremioPersonas.nombre = event.getNombre();
            gremioPersonas.funciones = new HashSet<Funcion>();
            gremioPersonas.materiales = new HashSet<Material>();
        });

        apply((FuncionAgregada event) -> {
            gremioPersonas.gremioId = event.getGremioId();
        });

        apply((MaterialAgregado event) -> {
            var material = gremioPersonas.getMaterialPorId(event.getMaterialId()).orElseThrow();
            .orElseThrow(() -> new IllegalArgumentException("No se encuentra el material para los pigmentos de este gremio"));
            material.actualizarDescripcion(event.getDescripcion());
        });

        apply((MaterialAgregado event) -> {
            var numMateriales = gremioPersonas.materiales().size();
            if (numMateriales >=15){
                throw new IllegalArgumentException("Son demasiados materiales para un pigmento. Invalido");
            }

            gremioPersonas.materiales.add(new material (
                    event.getMaterialPorId(),
                    event.getCaracteristica(),
                    event.FechaDeVencimiento()
            ));
        });

        apply((CantidadDePersonasActualizada event) -> {
            var gremioPersonas = gremioPersonas.getGremioId(event.getGremioId()).orElseThrow();
            .orElseThrow(() -> new IllegalArgumentException("No se encuentra el personal de este gremio"));
            material.actualizarDescripcion(event.getDescripcion());
        });

    }
}

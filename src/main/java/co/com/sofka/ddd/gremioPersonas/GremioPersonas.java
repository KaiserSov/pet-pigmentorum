package co.com.sofka.ddd.gremioPersonas;

import co.com.sofka.ddd.gremioPersonas.values.Nombre;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.ddd.gremioPersonas.values.GremioId;

public class GremioPersonas extends AggregateEvent<GremioId> {

    public GremioPersonas(GremioId entityId, Nombre) {
        super(entityId);
    }
}

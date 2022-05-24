package co.com.sofka.ddd.espacio;

import co.com.sofka.ddd.espacio.values.EspacioId;
import co.com.sofka.ddd.espacio.values.Estado;
import co.com.sofka.ddd.gremioPersonas.values.Nombre;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.ddd.gremioPersonas.values.GremioId;

public class Espacio extends AggregateEvent<EspacioId> {

    public Espacio(EspacioId entityId, Estado) {
        super(entityId);
    }
}

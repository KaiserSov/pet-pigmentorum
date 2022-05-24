package co.com.sofka.ddd.gremioPersonas.commands;

import co.com.sofka.ddd.equipos.values.Caracteristicas;
import co.com.sofka.ddd.equipos.values.FuncionId;
import co.com.sofka.ddd.gremioPersonas.values.GremioId;

public class CrearFuncion extends Command{
    private final GremioId gremioId;
    private final FuncionId entityId;
    private final Caracteristicas caracteristicas;

    public CrearFuncion (GremioId gremioId, FuncionId entityId, final Caracteristicas caracteristicas) {
        this.gremioId = personaId;
        this.entityId = entityId;
        this.caracteristicas = caracteristicas;
    }

    public GremioId getGremioId() {
        return gremioId;
    }

    public FuncionId getEntityId() {
        return entityId;
    }

    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }
}

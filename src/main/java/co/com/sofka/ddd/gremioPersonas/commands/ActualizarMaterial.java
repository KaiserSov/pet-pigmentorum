package co.com.sofka.ddd.gremioPersonas.commands;

import co.com.sofka.ddd.gremioPersonas.values.MaterialId;

public class ActualizarMaterial extends Command{

    private final MaterialId materialId;

    public ActualizarMaterial (MaterialId) {
        this.materialId = materialId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }
}

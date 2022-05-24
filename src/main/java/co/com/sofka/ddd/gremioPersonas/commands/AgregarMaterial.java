package co.com.sofka.ddd.gremioPersonas.commands;

import co.com.sofka.ddd.gremioPersonas.values.MaterialId;

public class AgregarMaterial extends Command{
    private final MaterialId materialId;

    public AgregarMaterial (MaterialId) {
        this.materialId = materialId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }

}

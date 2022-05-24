package co.com.sofka.ddd.gremioPersonas;

import co.com.sofka.ddd.equipos.values.Caracteristicas;
import co.com.sofka.ddd.equipos.values.Descripcion;
import co.com.sofka.ddd.equipos.values.FuncionId;

import java.util.Objects;

public class Funcion extends Entity<FuncionId>{
    private final Caracteristicas caracteristicas;
    private final Descripcion descripcion;

    public Funcion(FuncionId entityId, Caracteristicas caracteristicas, Descripcion descripcion){
        super(entityId);
        this.caracteristicas = caracteristicas;
        this.descripcion = descripcion;
    }

    //Estos son los comportamientos
    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public void actualizarCaracteristicas(Caracteristicas caracteristicas){
        this.caracteristicas = Objects.requireNonNull(caracteristicas);
    }

    public  Caracteristicas caracteristicas(){
        return caracteristicas;
    }

    public Descripcion descripcion () {
        return descripcion;
    }
}

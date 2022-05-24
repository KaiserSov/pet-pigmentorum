import co.com.sofka.ddd.equipos.values.Caracteristicas;
import co.com.sofka.ddd.equipos.values.Descripcion;
import co.com.sofka.ddd.equipos.values.FuncionId;
import co.com.sofka.ddd.gremioPersonas.values.FechaDeVencimiento;
import co.com.sofka.ddd.gremioPersonas.values.MaterialId;
import co.com.sofka.ddd.gremioPersonas.values.Nombre;

import java.util.Objects;

public class Material extends Entity<MaterialId>{
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final FechaDeVencimiento fechaDeVencimiento;

    public Material(MaterialId entityId, Nombre nombre, Descripcion descripcion, FechaDeVencimiento fechaDeVencimiento){
        super(entityId);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    //Estos son los comportamientos
    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarFechaDeVencimiento(FechaDeVencimiento fechaDeVencimiento){
        this.fechaDeVencimiento = Objects.requireNonNull(fechaDeVencimiento);
    }

    public  Nombre nombre(){
        return nombre;
    }

    public Descripcion descripcion () {
        return descripcion;
    }

    public FechaDeVencimiento fechaDeVencimiento () {
        return fechaDeVencimiento;
    }
}
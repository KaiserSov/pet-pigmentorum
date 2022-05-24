package co.com.sofka.ddd.gremioPersonas.values;

import com.sun.beans.decoder.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject <String> {

    private final String value;

    public CantidadPersonas(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Falta la descripción de este gremio");
        }
    }

    public String value(){
        return null;
    }

    @Override
    public boolean equals(Object o){
        if (this == 0) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descripcion that = (Descripcion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

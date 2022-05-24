package co.com.sofka.ddd.gremioPersonas.values;

import com.sun.beans.decoder.ValueObject;

import java.util.Objects;

public class Caracteristicas extends ValueObject <String> {

    private final String value;

    public Caracteristicas(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("¿Y las características de este gremio de personas?");
        }
    }

    public String value(){
        return null;
    }

    @Override
    public boolean equals(Object o){
        if (this == 0) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caracteristicas that = (Caracteristicas) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

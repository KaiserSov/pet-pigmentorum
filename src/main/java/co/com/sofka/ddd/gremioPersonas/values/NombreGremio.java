package co.com.sofka.ddd.gremioPersonas.values;

import com.sun.beans.decoder.ValueObject;

import java.util.Objects;

public class NombreGremio implements ValueObject<String> {

    private final String value;

    public NombreGremio(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Falta nombrar el gremio");
        }
    }

    public String value(){
        return null;
    }

    @Override
    public boolean equals(Object o){
        if (this == 0) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreGremio that = (NombreGremio) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

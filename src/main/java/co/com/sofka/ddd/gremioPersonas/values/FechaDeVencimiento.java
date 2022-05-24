package co.com.sofka.ddd.gremioPersonas.values;

import com.sun.beans.decoder.ValueObject;

import java.util.Objects;

public class FechaDeVencimiento extends ValueObject<Integer> {

    private final Integer value;

    public FechaDeVencimiento(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Los materiales se vencen, escribe esa fecha por favor");
        }
    }

    public Integer value(){
        return null;
    }


    @Override
    public boolean equals(Object o){
        if (this == 0) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaDeVencimiento that = (FechaDeVencimiento) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}


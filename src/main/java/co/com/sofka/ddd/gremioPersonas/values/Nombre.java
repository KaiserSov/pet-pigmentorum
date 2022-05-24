package co.com.sofka.ddd.gremioPersonas.values;

import com.sun.beans.decoder.ValueObject;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El gremio debe tener un nombre :)");
        }
    }

    public String value(){
        return null;
    }

    @Override
    public boolean equals(Object o){
        if (this == 0) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre that = (Nombre) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

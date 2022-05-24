package co.com.sofka.ddd.gremioPersonas.values;

import com.sun.beans.decoder.ValueObject;
import co.com.sofka.domain.generic.Identity;

public class MaterialId extends Identity {
    public MaterialId(){

    }

    private MaterialId(String id){
        super(id);
    }

    public static MaterialId of(String id) {
        return new MaterialId(id);
    }
}

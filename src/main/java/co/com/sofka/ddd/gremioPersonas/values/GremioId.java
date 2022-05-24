package co.com.sofka.ddd.gremioPersonas.values;

import co.com.sofka.domain.generic.Identity;

public class GremioId extends Identity {

    public GremioId(){

    }

    private GremioId(String id){
        super(id);
    }

    public static GremioId of(String id) {
        return new GremioId(id);
    }
}

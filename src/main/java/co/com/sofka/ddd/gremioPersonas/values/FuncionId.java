package co.com.sofka.ddd.gremioPersonas.values;

import co.com.sofka.ddd.gremioPersonas.Funcion;

import java.security.Identity;
import java.util.IdentityHashMap;

public class FuncionId extends Identity {
    public FuncionId(){

    }

    private FuncionId(String id){
        super(id);
    }

    public static FuncionId of(String id) {
        return new FuncionId(id);
    }


}

import java.security.PublicKey;

public class Animal {


    public int customMethod;

    protected void finalize() throws Throwable {
        try {

        } finally {

            super.finalize();
        }
    }

    public enum ExtracurricularActivity {
        SWIMMING,
        DANCING,
        RUNNING,
        SINGING,
    }

    public enum AnimalSpecies {
        CAT,
        BIRD,
        DOG,
        FISH,
        UNKNOWN
    }

    public boolean canFly() {


        return false;
    }

}

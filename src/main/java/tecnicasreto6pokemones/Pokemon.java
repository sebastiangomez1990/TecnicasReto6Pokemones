package tecnicasreto6pokemones;

/**
 *
 * @author Usuario
 */
import tecnicasreto6pokemones.NoEvolucionaException;

public abstract class Pokemon {
    public abstract Pokemon evolucionar() throws NoEvolucionaException;
    public abstract String gritar();
    

}
package tecnicasreto6pokemones;

/**
 *
 * @Equipo: John Sebastian Gomez Gonzalez    c.c 1000084363
 *          Sebastian Aristizabal Castañeda  c.c 1000639678
 */

import tecnicasreto6pokemones.Charmander;
import tecnicasreto6pokemones.Pokebola;
import tecnicasreto6pokemones.Pokemon;

/*Grupo de actividad Sebastian Aristizabal y Sebastian Gomez
*/
public class TecnicasReto6Pokemones {

    public static void main(String[] args) {
        
        Pokebola pokebolaroja = new Pokebola();
        
        Charmander fuego = new Charmander("mauricio");
        
        System.out.println("POkemon capturado: " + fuego.toString() );
        
        System.out.println("poke grito " + fuego.gritar() );
        
        fuego.evolucionar();
        
        System.out.println("poke grito " + fuego.gritar());
        
        fuego.evolucionar();
        
        System.out.println("poke grito " + fuego.gritar());
        
        fuego.evolucionar();
        
        System.out.println("poke grito " + fuego.gritar());
        
        
    }
}

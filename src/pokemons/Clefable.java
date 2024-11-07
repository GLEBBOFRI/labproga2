package pokemons;

import ru.ifmo.se.pokemon.Type;
import moves.Facade;

public class Clefable extends Clefairy {
    public Clefable(String name, int level) {
        super(name, level);
        setType(Type.FAIRY);
        setStats(95, 70, 73, 95, 90, 60);
        addMove(new Facade());
    }
}

package pokemons;

import ru.ifmo.se.pokemon.Type;
import moves.Pound;

public class Clefairy extends Cleffa {
    public Clefairy(String name, int level) {
        super(name, level);
        setType(Type.FAIRY);
        setStats(70, 45, 48, 60, 65, 35);
        addMove(new Pound());
    }
}

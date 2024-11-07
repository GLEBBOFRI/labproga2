package pokemons;

import ru.ifmo.se.pokemon.Type;
import moves.Snarl;

public final class Pangoro extends Pancham {
    public Pangoro(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING, Type.DARK);
        setStats(95, 124, 78, 69, 71, 58);
        addMove(new Snarl());
    }
}

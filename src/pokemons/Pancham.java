package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.KarateChop;
import moves.RockTomb;
import moves.WorkUp;

public class Pancham extends Pokemon {
    public Pancham(String name, int level) {
        super(name, level);
        setType(Type.FIGHTING);
        setStats(67, 82, 62, 46, 48, 43);
        addMove(new KarateChop());
        addMove(new RockTomb());
        addMove(new WorkUp());
    }
}

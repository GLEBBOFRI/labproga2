package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import moves.ShadowBall;
import moves.ThunderWave;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int level) {
        super(name, level);
        setType(Type.FAIRY);
        setStats(50, 25, 28, 45, 55, 15);
        addMove(new ShadowBall());
        addMove(new ThunderWave());
    }
}

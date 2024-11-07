package moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class Amnesia extends StatusMove {

    public Amnesia() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (pokemon.getStat(Stat.SPECIAL_DEFENSE) < 6) { 
            pokemon.setMod(Stat.SPECIAL_DEFENSE, 2);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует способность " + pieces[pieces.length - 1];
    }
}

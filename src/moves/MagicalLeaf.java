package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class MagicalLeaf extends SpecialMove {

    public MagicalLeaf() {
        super(Type.GRASS, 60, 0);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int) damage);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует способность " + this.getClass().getSimpleName();
    }
}

package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class KarateChop extends PhysicalMove {

    public KarateChop() {
        super(Type.FIGHTING, 50, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int) damage);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1.0 / 8.0;
    }

    @Override
    protected String describe() {
        return "использует способность " + this.getClass().getSimpleName();
    }
}

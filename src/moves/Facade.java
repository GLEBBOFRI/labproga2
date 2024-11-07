package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        Status statusCondition = pokemon.getCondition();
        double finalDamage = calculateFacadeDamage(damage, statusCondition);
        pokemon.setMod(Stat.HP, (int) finalDamage);
    }

    public double calculateFacadeDamage(double basePower, Status statusCondition) {
        if (statusCondition == Status.BURN || statusCondition == Status.POISON || statusCondition == Status.PARALYZE) {
            if (statusCondition == Status.BURN) {
                return basePower; 
            }
            return basePower * 2;
        }
        return basePower;
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует способность " + pieces[pieces.length - 1];
    }
}

package moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class SweetScent extends StatusMove {

    public SweetScent() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getStat(Stat.EVASION) > -6) { 
            pokemon.setMod(Stat.EVASION, -1);
        }
    }

    @Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "использует способность " + pieces[pieces.length-1];
	}
}

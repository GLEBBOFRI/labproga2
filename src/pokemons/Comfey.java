package pokemons;

import moves.Amnesia;
import moves.Facade;
import moves.MagicalLeaf;
import moves.SweetScent;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Comfey extends Pokemon{
	
	public Comfey(String name, int level) {
		super(name,level);
		super.setType(Type.FAIRY);
		super.setStats(51, 52, 90, 82, 110, 100);
		addMove(new Facade());
		addMove(new SweetScent());
		addMove(new Amnesia());
		addMove(new MagicalLeaf());
	}
}

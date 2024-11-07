package laba2prog;

import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Program {
    public static void main(String[] args) {
        Battle b = new Battle();

        // Команда A: Клеффоподобные
        Cleffa cleffa = new Cleffa("Cleffa", 5);
        Clefairy clefairy = new Clefairy("Clefairy", 10);
        Clefable clefable = new Clefable("Clefable", 20);

        // Команда B: Прочие
        Pancham pancham = new Pancham("Pancham", 15);
        Pangoro pangoro = new Pangoro("Pangoro", 25);
        Comfey comfey = new Comfey("Comfey", 30);

        // Добавляем покемонов в битву
        b.addAlly(cleffa);
        b.addAlly(clefairy);
        b.addAlly(clefable);

        b.addFoe(pancham);
        b.addFoe(pangoro);
        b.addFoe(comfey);

        // Запуск битвы
        b.go();
    }
}

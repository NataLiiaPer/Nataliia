package pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main1 {
    public static void main(String[] args) {
        List<Pokemon> pokemonListOfAsh = initializePokemons();
        //  pokemonListOfAsh.get(2);
        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "grass", "water");


        for (Pokemon element : pokemonListOfAsh) {

            boolean result = element.isEffectiveAgainst(wildPokemon);
            if (result) {
                System.out.println(wildPokemon + " " + element);
                System.out.print("I choose you, " +element);
                break;
            }

        }


        // Which pokemon should Ash use?
        // Write the necessary code to get the name of the right pokemon and print it:


    }

    // maybe I have to compare wildPokemon with all pokemons?
    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Bulbasaur", "grass", "water"));
        pokemon.add(new Pokemon("Pikachu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "grass"));
        pokemon.add(new Pokemon("new pokemon", "fire", "grass"));
        pokemon.add(new Pokemon("Pidgeot", "flying", "fighting"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }
}


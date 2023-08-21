//import InvalidPokemonTypeExeption.InvalidPokemonTypeExeption;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static java.nio.charset.StandardCharsets.UTF_8;
//
//public class PokemonApp {
//    public static void main(String[] args) {
//        List<String> pokemons = readFile("src/pokemons.csv"); // same as String file
//        try {
//            validateFileContent(pokemons); // unchecked time exception
//        } catch (InvalidPokemonTotalExeption e){
//            System.err.println("Invalid total");
//         //   System.exit(1);
//        } catch (InvalidPokemonTypeExeption e){
//            System.err.println("Invalid type.");
//          //  System.exit(2);
//        } catch (Exception e){   //with this part of code we replace two previous part
//            System.err.println("Invalid pokemon."); //the order of exception is very important!!!
//       //     System.exit(0); // The most general should be first
//        } finally {
//            System.out.println("Validation ended.");
//        }
//        System.out.println("here");
//        List<String> pokemonNames = filterPokemonNames(pokemons); // hit enter and it will create a method
//        writeFile(pokemonNames, "src/pokemonNames.csv");
////        System.out.println(pokemons);
////        System.out.println(pokemonNames);
//        appendFile(Arrays.asList("NewName", "NewName1"), "src/pokemonNames.csv")
//        //    append -    добавлять
//    }
//
//    private static void validateFileContent(List<String> pokemons)
//            throws InvalidPokemonTotalExeption, InvalidPokemonTypeExeption {
//        for (String pokemon : pokemons) ;
//        String[] pokemonData = pokemons.split(",");
//        int total = Integer.parseInt(pokemonData[4]); //convert pokemonData(String) to integer
//        String type1 = pokemonData[2];
//        String type2 = pokemonData[3];
//        if (total < 0) {
//            throw new InvalidPokemonTotalExeption(); //we should to create new class
//        } else if(type1.isEmpty()&&type2.isEmpty()){
//            throw new InvalidPokemonTypeExeption();
//        }
//    }
//
//    private static void appendFile(List<String> fileContent, String file) {
//        try {
//            Files.write(Paths.get(file), fileContent, StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            System.err.println("Unable to read file.");
//        }
//    }
//
//    private static void writeFile(List<String> fileContent, String file) {
//        try {
//            Files.write(Paths.get(file), fileContent);
//        } catch (IOException e) {
//            System.err.println("Unable to read file.");
//        }
//    }
//
//    // if red - alt+enter = surround by try and catch
//    private static List<String> filterPokemonNames(List<String> pokemons) {
//        List<String> pokemonNames = new ArrayList<>();
//        for (int i = 0; i < pokemons.size(); i++) {
//            //    for (int i = 0; i < 1; i++) {
//            String pokemonLine = pokemons.get(i);
//            String[] pokemonData = pokemonLine.split(",");
//            String pokemonName = pokemonData[1];
//            //  System.out.println(Arrays.toString(pokemonData)); // will print first string
//            //   System.out.println(pokemonData[1]);// will print second element
//            pokemonNames.add(pokemonName);
//        }
//        //   return null;
//        return pokemonNames;
//    }
//
//    public static List<String> readFile(String file) {
//        Path filePath = Paths.get(file); //мы конвертируем String в filePath выбирает Java.nio.file and String file inside it
//        try { //exception
//            List<String> filelines = Files.readAllLines(filePath, UTF_8); //StandardCharsets.UTF_8 для русск и др языков (Alt+enter)
//            filelines.remove(0);
//            return filelines; // we will see a mistake and can decide what to do
//        } catch (IOException exception) { // type and the name of variable
//            System.err.println("Unable to read file.");
//            return new ArrayList<>();
//        }
//
//
//    }
//}

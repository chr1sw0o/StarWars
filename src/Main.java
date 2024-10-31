import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Jedi(20, "Luke", "the force for good"));
        characters.add(new Sith(45, "DarkVaders", "the force for evil"));
        characters.add(new Droid(410, "R2D2", "Shock charge"));

        for (Character character : characters) {
            character.action();
            if (character instanceof Character) {
                character.showTraits();
                System.out.println();
            }
        }
    }
}
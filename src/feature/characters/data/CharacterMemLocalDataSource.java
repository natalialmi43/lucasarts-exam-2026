package feature.characters.data;

import org.nissan.Vehicle;

import java.util.ArrayList;
import java.util.Objects;

public class CharacterMemLocalDataSource {

    private ArrayList<Character> storage = new ArrayList<>();

    public ArrayList<Character> findAll() {
        return storage;
    }

    public void save(Character character) {
        storage.add(character);
    }

    public void delete(String characterId) {
        storage.removeIf(character -> Objects.equals(character.getId(), characterId));
    }
}

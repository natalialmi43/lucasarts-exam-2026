package feature.characters.data;
import feature.characters.domain.CharacterModel;

import java.util.ArrayList;
import java.util.Objects;

public class CharacterMemLocalDataSource {

    private ArrayList<CharacterModel> storage = new ArrayList<>();

    public ArrayList<CharacterModel> findAll() {
        return storage;
    }

    public void save(CharacterModel character) {
        storage.add(character);
    }

    public void delete(String characterId) {
        storage.removeIf(character -> Objects.equals(character.getId(), characterId));
    }

    private static CharacterMemLocalDataSource instance = null;

    public static CharacterMemLocalDataSource newInstance (){

        if (instance == null){
            instance = CharacterMemLocalDataSource.newInstance();
        }

        return instance;

    }
}

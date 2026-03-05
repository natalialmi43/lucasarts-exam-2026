package feature.characters.data;

import feature.characters.domain.CharacterModel;
import feature.characters.domain.CharactherModelRepository;

import java.util.ArrayList;

public class CharacterModelDataRepository implements CharactherModelRepository {

    private CharacterMemLocalDataSource characterMemLocalDataSource;

    public CharacterModelDataRepository(CharacterMemLocalDataSource characterMemLocalDataSource) {
        this.characterMemLocalDataSource = characterMemLocalDataSource;
    }

    @Override
    public ArrayList<CharacterModel> getCharacterModel() {
        return characterMemLocalDataSource.findAll();
    }

    @Override
    public void saveCharacterModel(CharacterModel characterModel) {
        characterMemLocalDataSource.save(characterModel);
    }

    @Override
    public void deleteCharacterModel(String idCharacterModel) {
        characterMemLocalDataSource.delete(idCharacterModel);
    }
}

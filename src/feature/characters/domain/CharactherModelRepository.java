package feature.characters.domain;

import java.util.ArrayList;

public interface CharactherModelRepository {

    ArrayList <CharacterModel> getCharacterModel();

    void saveCharacterModel (CharacterModel characterModel);

    void deleteCharacterModel (String idCharacterModel);
}

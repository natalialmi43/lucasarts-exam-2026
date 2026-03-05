package feature.characters.domain;

import java.util.ArrayList;

public class GetCharactherModelUseCase {
    private CharactherModelRepository charactherModelRepository;

    public GetCharactherModelUseCase(CharactherModelRepository charactherModelRepository) {
        this.charactherModelRepository = charactherModelRepository;
    }

    public ArrayList <CharacterModel> execute (){
        return charactherModelRepository.getCharacterModel();
    }
}

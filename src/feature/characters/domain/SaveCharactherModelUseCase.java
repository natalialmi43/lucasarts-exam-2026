package feature.characters.domain;

public class SaveCharactherModelUseCase {

    private CharactherModelRepository charactherModelRepository;

    public SaveCharactherModelUseCase(CharactherModelRepository charactherModelRepository) {
        this.charactherModelRepository = charactherModelRepository;
    }


    public void execute (CharacterModel characterModel){

        charactherModelRepository.saveCharacterModel(characterModel);
    }
}
